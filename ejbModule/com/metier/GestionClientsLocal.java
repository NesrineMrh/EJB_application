package com.metier;

import java.util.List;

import javax.ejb.Local;

import com.entity.Client;
import com.entity.ClientProfessionnel;
import com.entity.Compte;

@Local
public interface GestionClientsLocal {
	public Client ajouterClient(Client p);
	public ClientProfessionnel ajouterClientProfessionnel(ClientProfessionnel c);
	public boolean supprimerClient(int id);
	public boolean modifierClient(Client p);
	public Client afficherClient(int id);
	public List<Client> listClient();
	public List<Compte> listeCompte(int id );
	public List<Client> listClientByCompte(int code);

}
