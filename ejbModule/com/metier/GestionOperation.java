package com.metier;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.entity.Operation;

@Stateless(name="GestionOperation")
public class GestionOperation implements GestionOperationLocal,GestionOperationRemote {

	 @PersistenceContext(unitName = "FSTBank")
	    EntityManager em;
	
	public GestionOperation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Operation add(Operation operation) {
			em.persist(operation);
		return operation;
	}
	
	@Override
	public ArrayList<Operation> Operations(int code) {
			Query req = em.createQuery("from Operation o where o.compte.code = " + code);
		return (ArrayList<Operation>) req.getResultList();
	}

}
