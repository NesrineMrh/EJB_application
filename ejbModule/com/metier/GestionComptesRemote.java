package com.metier;

import javax.ejb.Remote;

import com.entity.Compte;

import java.util.List;

@Remote
public interface GestionComptesRemote {
    public Compte ajouterCompte(Compte compte);

    public Compte modifierCompte(Compte compte);

    public boolean supprimerCompte(int id);

    public Compte rechercherCompteParId(int id);

    public List<Compte> consulterComptes();

    public Compte verser(double montant, int code);

    public Compte retirer(double montant, int code);

    public void imprimer(Compte compte);
}
