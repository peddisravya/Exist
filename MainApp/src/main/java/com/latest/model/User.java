/*package com.latest.model;

import java.io.Serializable;
import javax.persistence.*;


*//**
 * The persistent class for the users database table.
 * 
 *//*
@Entity
@Table(name="user")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String sapId;

	private String email;

	private String firstname;

	private String lastname;

	private Boolean status;
	
	private String password;

	//bi-directional many-to-one association to UserRole
	@ManyToOne
	@JoinColumn(name="user_role")
	private UserRole userRole;

	public User() {
	}

	public String getSapId() {
		return this.sapId;
	}

	public void setSapId(String sapId) {
		this.sapId = sapId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public UserRole getUserRole() {
		return this.userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}*/