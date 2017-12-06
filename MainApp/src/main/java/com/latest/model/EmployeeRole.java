/*package com.latest.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


*//**
 * The persistent class for the roles database table.
 * 
 *//*
@Entity
@Table(name="roles")
@NamedQuery(name="EmployeeRole.findAll", query="SELECT r FROM EmployeeRole r")
public class EmployeeRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	private String name;

	//bi-directional many-to-one association to Resource
	@OneToMany(mappedBy="role")
	private List<Employee> employee;

	//bi-directional many-to-one association to RoleMetric
	@OneToMany(mappedBy="role")
	private List<RoleMetrics> roleMetrics;

	public EmployeeRole() {
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
	public List<Employee> getEmployee() {
		return this.employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Employee addEmployee(Employee employee) {
		getEmployee().add(employee);
		employee.setEmployeeRole(this);

		return employee;
	}
                                                                                                                                                                                                                                                                                                
	public Employee removeEmployee(Employee employee) {
		getEmployee().remove(employee);
		employee.setEmployeeRole(null);

		return employee;
	}

	@JsonIgnore
	public List<RoleMetrics> getRoleMetrics() {
		return this.roleMetrics;
	}

	public void setRoleMetrics(List<RoleMetrics> roleMetrics) {
		this.roleMetrics = roleMetrics;
	}

	public RoleMetrics addRoleMetric(RoleMetrics roleMetric) {
		getRoleMetrics().add(roleMetric);
		roleMetric.setRole(this);

		return roleMetric;
	}

	public RoleMetrics removeRoleMetric(RoleMetrics roleMetric) {
		getRoleMetrics().remove(roleMetric);
		roleMetric.setRole(null);

		return roleMetric;
	}

}*/