package com.metier;

import java.util.ArrayList;

import javax.ejb.Local;

import com.entity.Operation;

@Local
public interface GestionOperationLocal {
	
	public Operation add(Operation operation);
	public ArrayList<Operation> Operations(int  code);
}
