package com.metier;

import java.util.List;

import javax.ejb.Remote;

import com.entity.Client;

@Remote
public interface GestionClientsRemote {
	public Client ajouterPersonne(Client p);
	public boolean supprimerClient(int id);
	public boolean modifierClient(Client p);
	public Client afficherClient(Client p);
	public List<Client> listClient();
}
