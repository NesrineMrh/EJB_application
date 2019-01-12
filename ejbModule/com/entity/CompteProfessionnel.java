package com.entity;

import javax.persistence.Entity;

@Entity
public class CompteProfessionnel extends Compte{
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	
}