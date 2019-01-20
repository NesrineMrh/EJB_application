package com.metier;

import java.util.ArrayList;

import javax.ejb.Remote;

import com.entity.Operation;

@Remote
public interface GestionOperationRemote {

	public Operation add(Operation operation);
	public ArrayList<Operation> Operations(int code);
}
