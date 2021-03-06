package com.metier;

import java.util.List;

import javax.ejb.Remote;

import com.entity.Banquier;
import com.entity.Client;
import com.entity.ClientProfessionnel;
import com.entity.Compte;

@Remote
public interface GestionClientsRemote {
	public Client ajouterClient(Client p);
	public ClientProfessionnel ajouterClientProfessionnel(ClientProfessionnel c) ;
	public boolean supprimerClient(int id);
	public boolean modifierClient(Client p);
	public Client afficherClient(int id);
	public List<Client> listClient();
	public List<Compte> listeCompte(int id );
	public List<Client> listClientByCompte(int code);
	public Client check(String username , String password );
	public Banquier checkBnaquier(String username , String password );

}
