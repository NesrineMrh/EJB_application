package com.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Compte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int code;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    private int type;
    @ManyToMany
    private List<Client> client;

    
    public Compte(int code, double solde, Date dateCreation, int type) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.type = type;
	}

	public Compte(double solde, Date dateCreation, int type, List<Client> client) {
		super();
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.type = type;
		this.client = client;
	}

	public Compte() {
    }

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

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}


}
