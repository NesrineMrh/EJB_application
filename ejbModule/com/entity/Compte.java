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
    private String type;
    @ManyToMany(mappedBy="comptes")
    private List<Client> client;

    
    public Compte(int code, double solde, Date dateCreation, String type) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
		this.type = type;
	}

	public Compte(double solde, Date dateCreation, String type, List<Client> client) {
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

	public List<Client> getClient() {
		return client;
	}

	public void setClient(List<Client> client) {
		this.client = client;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + code;
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(solde);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		}
		if (code != other.code)
			return false;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (Double.doubleToLongBits(solde) != Double.doubleToLongBits(other.solde))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	


}
