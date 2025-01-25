package com.controller;

import java.io.Serializable;

import com.dao.DAO;
import com.entity.Candidate;
import com.service.Service;

public class Controller {

	public Candidate getCandidate() {
		Service service=new Service();
		Candidate object=service.getCandidate();
		return object;
	}

	public Serializable insertCandidate() {
		Service service=new Service();
		Serializable s=service.insertCandidate();
		return s;
	}
	public boolean updateCandidate() {
		Service service=new Service();
		boolean b=service.updateCandidate();
		return b;
	}
	public boolean saveOrUpdateCandidate() {
		Service service=new Service();
		boolean b=service.saveOrUpdateCandidate();
		return b;
	}
	public boolean deleteCandidate() {
		Service service=new Service();
		boolean b=service.deleteCandidate();
		return b;
	}

}
