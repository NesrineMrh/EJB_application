package com.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class Client implements Serializable{
	
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	@OneToMany
	private List<Compte> compte ;
	
	public Client() {}

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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
