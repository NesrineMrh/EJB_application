package com.entity;

public class FactoryCompte {

	public FactoryCompte() {
		// TODO Auto-generated constructor stub
	}
	
	public Compte getCompte(String type) {
		Compte compte = null ;
		if (type.equals("particulier")) compte = new Compte();

		else if (type.equals("Professionnel")) compte = new CompteProfessionnel();
		
		return compte ;
	}

}
