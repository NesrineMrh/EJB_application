package com.metier;

import java.util.List;

import javax.ejb.Local;

import com.entity.Client;

@Local
public interface GestionClientsLocal {
	public Client ajouterPersonne(Client p);
	public boolean supprimerClient(int id);
	public boolean modifierClient(Client p);
	public Client afficherClient(Client p);
	public List<Client> listClient();
}
