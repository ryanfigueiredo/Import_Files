package com.ImportsFiles.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ID;

	private String firstName;
	private String lastName;
	private String cpf;
	private String time;
	private OfficeResponsibility officeResponsibility;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public OfficeResponsibility getOfficeResponsibility() {
		return officeResponsibility;
	}

	public void setOfficeResponsibility(OfficeResponsibility officeResponsibility) {
		this.officeResponsibility = officeResponsibility;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGener() {
		return time;
	}

	public void setGener(String gener) {
		this.time = gener;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

}
