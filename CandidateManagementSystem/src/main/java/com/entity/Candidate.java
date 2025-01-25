package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidate" , schema="batch1199db")
public class Candidate implements Serializable{

	@Id
	private int id;
	private String name;
	private String assembly;
	private String partyname;
	private String statename;
	private String gender;
	private int age;

	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Candidate(int id, String name, String assembly, String partyname, String statename, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.assembly = assembly;
		this.partyname = partyname;
		this.statename = statename;
		this.gender = gender;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAssembly() {
		return assembly;
	}

	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Candidate [id=" + id + ", name=" + name + ", assembly=" + assembly + ", partyname=" + partyname
				+ ", statename=" + statename + ", gender=" + gender + ", age=" + age + "]";
	}

}
