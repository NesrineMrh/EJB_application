package com.entity;


import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class ClientProfessionnel extends Client implements Serializable{
	
	
	private String adresseEntreprise;
	private String telephoneEntreprise;
	
	
	public ClientProfessionnel() {
		super();
	}


	public ClientProfessionnel(String adresseEntreprise, String telephoneEntreprise) {
		super();
		this.adresseEntreprise = adresseEntreprise;
		this.telephoneEntreprise = telephoneEntreprise;
	}


	public String getAdresseEntreprise() {
		return adresseEntreprise;
	}
	public void setAdresseEntreprise(String adresseEntreprise) {
		this.adresseEntreprise = adresseEntreprise;
	}
	public String getTelephoneEntreprise() {
		return telephoneEntreprise;
	}
	public void setTelephoneEntreprise(String telephoneEntreprise) {
		this.telephoneEntreprise = telephoneEntreprise;
	}
	
}
