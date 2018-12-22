package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Compte implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int code;
	private double solde;
	private Date dateCreation;
	private int type;
	@ManyToOne
	private Client client ;
	public Compte(){}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}


	
	
}
