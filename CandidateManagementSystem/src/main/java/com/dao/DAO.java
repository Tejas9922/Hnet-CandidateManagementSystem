package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Candidate;

public class DAO {

	public Candidate getCandidate() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Candidate object = session.load(Candidate.class, 1);

		return object;

	}

	public Serializable insertCandidate() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = new Candidate(26, "ZZZ", "Mumbai", "MS", "MH", "Male", 40);
		Serializable s = session.save(candidate);
		tx.commit();

		return s;

	}
	public boolean updateCandidate() {
		boolean isupdate=false;
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = new Candidate(26, "ZZZ5", "Mumbai", "MS", "MH", "Male", 40);
		session.update(candidate);
		tx.commit();
		boolean b=isupdate=true;
		  
		
		return b;
		
	}
	public boolean saveOrUpdateCandidate() {
		boolean isupdate=false;
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = new Candidate(26, "ZZZ6", "Mumbai", "MS", "MH", "Male", 40);
		session.saveOrUpdate(candidate);
		tx.commit();
		boolean b=isupdate=true;
		  
		
		return b;
		
	}
	
	public boolean deleteCandidate() {
		boolean isupdate=false;
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Candidate candidate = new Candidate();
		candidate.setId(26);
		session.delete(candidate);
		tx.commit();
		boolean b=isupdate=true;
		  
		
		return b;
		
	}
	
	

	

}
