package ecommerce.entities.concretes;

import ecommerce.entities.abstracts.Entity;

public class User implements Entity {
	
	private String name;
	private String surName;
	private String eMail;
	private String password;
	
	public User() {
		
	}
	
	public User(String name, String surName, String eMail, String password) {
		super();
		this.name = name;
		this.surName = surName;
		this.eMail = eMail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
