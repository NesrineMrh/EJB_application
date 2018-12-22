package com.metier;

import com.entity.Compte;

import javax.ejb.Local;
import java.util.List;

@Local
public interface GestionComptesLocal {
    public Compte ajouterCompte(Compte compte);

    public Compte modifierCompte(Compte compte);

    public boolean supprimerCompte(int id);

    public Compte rechercherCompteParId(int id);

    public List<Compte> consulterComptes();

    public Compte verser(double montant, int code);

    public Compte retirer(double montant, int code);

    public void imprimer(Compte compte);


}
