package com.metier;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entity.Client;
import com.entity.ClientProfessionnel;
import com.entity.Compte;

@Stateless(name="GestionClientLocal")
public class GestionClients implements GestionClientsLocal , GestionClientsRemote{

	ArrayList<Client> clients= new ArrayList<Client>();
	
	@PersistenceContext(unitName="FSTBank")
	EntityManager em ;
	
	@Override
	public Client ajouterClient(Client c) {
		/*if(em.find(Client.class,c.getId()) != null) {
			return c;
		}
		else {*/
			em.persist(c);
			return c ;
		//}
	}
	@Override
	public ClientProfessionnel ajouterClientProfessionnel(ClientProfessionnel c) {
		/*if(em.find(Client.class,c.getId()) != null) {
			return c;
		}
		else {*/
			em.persist(c);
			return c ;
		//}
	}



	@Override
	public boolean supprimerClient(int id) {
		Client clientToremove = em.find(Client.class, id);
		if(clientToremove!=null) {
				em.remove(clientToremove);
		return true ;		
		}
		return false ;
	}

	@Override
	public boolean modifierClient(Client c) {
		Client clientToUpdate = em.find(Client.class, c.getId());
		em.merge(c);
		em.flush();
		return true ;
	}

	@Override
	public Client afficherClient(int id) {
		Client client= em.find(Client.class, id);
		if(client != null) {
		return client  ;
		}else return null;
	}

	@Override
	public List<Client> listClient() {
		Query req = em.createQuery("select c from Client c");
		return req.getResultList();
	}

	public List<Client> listeCompte(){
		Query req = em.createQuery("select c from Compte c join Client_Compte cc where c.code = cc.comptes_code");
		return req.getResultList();
	}
}
