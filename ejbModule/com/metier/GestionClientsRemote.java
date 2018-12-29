package com.metier;

import java.util.List;

import javax.ejb.Remote;

import com.entity.Client;

@Remote
public interface GestionClientsRemote {
	public Client ajouterClient(Client p);
	public boolean supprimerClient(int id);
	public boolean modifierClient(Client p);
	public Client afficherClient(int id);
	public List<Client> listClient();
}
