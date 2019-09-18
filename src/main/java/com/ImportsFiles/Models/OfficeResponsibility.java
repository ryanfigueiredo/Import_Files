package com.ImportsFiles.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OfficeResponsibility implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

}
