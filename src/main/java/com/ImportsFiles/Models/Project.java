package com.ImportsFiles.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project implements Serializable {
	
	private static final long serialVersionUID = 1L;

	String name;
	User userResponse;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(User userResponse) {
		this.userResponse = userResponse;
	}

}
