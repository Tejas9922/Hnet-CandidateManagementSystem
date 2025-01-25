package com.service;

import java.io.Serializable;
import java.util.List;

import com.dao.DAO;
import com.entity.Candidate;

public class Service {

	public Candidate getCandidate() {
		DAO dao = new DAO();
		Candidate object = dao.getCandidate();
		return object;
	}

	public Serializable insertCandidate() {
		DAO dao = new DAO();
		Serializable s=dao.insertCandidate();
		return s;
	}
	
	public boolean updateCandidate() {
		DAO dao = new DAO();
		boolean b=dao.updateCandidate();
		return b;
	}
	public boolean saveOrUpdateCandidate() {
		DAO dao = new DAO();
		boolean b=dao.saveOrUpdateCandidate();
		return b;
	}
	public boolean deleteCandidate() {
		DAO dao = new DAO();
		boolean b=dao.deleteCandidate();
		return b;
	}
}
