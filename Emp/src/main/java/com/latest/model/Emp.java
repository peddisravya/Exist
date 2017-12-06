package com.latest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Emp")
public class Emp {

	@Id
	private int id;
	private String user;
	@Size(min = 10, message = "Enter at least 10 Characters...")
	private String empName;
	private Date joinDate;
	private boolean isDone;

	public Emp() {
		super();
	}

	public Emp(int id, String user, String empName, Date joinDate, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.empName = empName;
		this.joinDate = joinDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getempName() {
		return empName;
	}

	public void setempName(String empName) {
		this.empName = empName;
	}

	public Date getjoinDate() {
		return joinDate;
	}

	public void setjoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Emp other = (Emp) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("emp [id=%s, user=%s, desc=%s, targetDate=%s, isDone=%s]", id, user, empName, joinDate,
				isDone);
	}

}