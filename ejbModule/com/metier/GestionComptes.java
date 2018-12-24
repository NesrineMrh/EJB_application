package com.metier;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entity.Compte;

import java.util.List;

@Stateless(name = "GestionComptes")
public class GestionComptes implements GestionComptesLocal, GestionComptesRemote {
    @PersistenceContext(unitName = "FSTBank")
    EntityManager em;

    @Override
    public Compte ajouterCompte(Compte compte) {
        em.persist(compte);
        return compte;
    }

    @Override
    public Compte modifierCompte(Compte compte) {
        Compte compteToModify = em.find(Compte.class, compte.getCode());
        if (compteToModify != null) {
            em.merge(compte);
            em.flush();
            return compteToModify;
        }
        return null;
    }

    @Override
    public boolean supprimerCompte(int id) {
        Compte compteToRemove = em.find(Compte.class, id);
        if (compteToRemove != null) {
            em.remove(compteToRemove);
            em.flush();
            return true;
        }
        return false;
    }

    @Override
    public Compte rechercherCompteParId(int id) {
        Compte compte = em.find(Compte.class, id);
        if (compte != null) {
            return compte;
        }
        return null;
    }

    @Override
    public List<Compte> consulterComptes() {
        Query req = em.createQuery("select c from Compte c");
        return req.getResultList();
    }

    @Override
    public Compte verser(double montant, int code) {
        Compte compte = this.rechercherCompteParId(code);
        if (compte != null) {
            compte.setSolde(compte.getSolde() + montant);
            em.merge(compte);
            em.flush();
            return compte;
        }
        return null;
    }

    @Override
    public Compte retirer(double montant, int code) {
        Compte compte = this.rechercherCompteParId(code);
        if (compte != null) {
            if (compte.getSolde() > +montant) {
                compte.setSolde(compte.getSolde() - montant);
                em.merge(compte);
                em.flush();
                return compte;
            } else return null;

        }
        return null;
    }

    @Override
    public void imprimer(Compte compte) {

    }
}
