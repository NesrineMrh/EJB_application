package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Operation implements Serializable {

	public Operation() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int num;
	private String type ; 
	 @Temporal(TemporalType.DATE)
	 private Date dateCreation;
	private double montant ; 
	@ManyToOne
	private Compte compte;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	public Operation(String type, Date dateCreation, double montant, Compte compte) {
		super();
		this.type = type;
		this.dateCreation = dateCreation;
		this.montant = montant;
		this.compte = compte;
	}
	
	 

}
