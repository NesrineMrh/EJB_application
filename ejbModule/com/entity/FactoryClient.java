package com.entity;

public class FactoryClient {

	public FactoryClient() {
		// TODO Auto-generated constructor stub
	}

	public Client getClient(String type) {
		Client client = null ;
		if (type.equals("particulier")) client = new Client();

		else if (type.equals("Professionnel")) client = new ClientProfessionnel();
		
		return client ;
	}
}
