package com.entity;

import javax.persistence.Entity;

@Entity
public class CompteProfessionnel extends Compte{
	
	private String adress ;

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
}
