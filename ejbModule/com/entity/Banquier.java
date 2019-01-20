package com.entity;

import javax.ejb.Singleton;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Singleton
@Entity
public class Banquier implements Serializable {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id ;
    private String nom ;
    private String prenome;
    @OneToMany
    private List<Compte> comptes;
    private String login;
	private String password;
	

    public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenome() {
        return prenome;
    }

    public void setPrenome(String prenome) {
        this.prenome = prenome;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }

	public Banquier() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
