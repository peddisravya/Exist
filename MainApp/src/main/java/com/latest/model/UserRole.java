/*package com.latest.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Entity
@Table(name = "user_roles")
@NamedQuery(name = "UserRole.findAll", query = "SELECT u FROM UserRole u")
public class UserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String description;

	private String name;

	// bi-directional many-to-one association to User
	@OneToMany(mappedBy = "userRole")
	private List<User> users;

	public UserRole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonIgnore
	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setUserRole(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setUserRole(null);

		return user;
	}

}*/