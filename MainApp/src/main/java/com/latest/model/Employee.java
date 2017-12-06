package com.latest.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Employee.findAll", query="SELECT r FROM Employee r")
public class Employee {

	@Id
	private String sapId;
	private String ename;
	private String workingLocation;
	private String dateofjoining;
	private String dqiMetrics;
	private String caseStudies;
	
/*	@ManyToOne
	private EmployeeRole role;

	public EmployeeRole getEmployeeRole() {
		return role;
	}

	public void setEmployeeRole(EmployeeRole role) {
		this.role = role;
	}
*/
	public Employee(String sapId, String ename, String workingLocation, String dateofjoining, String dqiMetrics,
			String caseStudies) {
		super();
		this.sapId = sapId;
		this.ename = ename;
		this.workingLocation = workingLocation;
		this.dateofjoining = dateofjoining;
		this.dqiMetrics = dqiMetrics;
		this.caseStudies = caseStudies;
	}

	public String getSapId() {
		return sapId;
	}

	public void setSapId(String sapId) {
		this.sapId = sapId;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getWorkingLocation() {
		return workingLocation;
	}

	public void setWorkingLocation(String workingLocation) {
		this.workingLocation = workingLocation;
	}

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getDqiMetrics() {
		return dqiMetrics;
	}

	public void setDqiMetrics(String dqiMetrics) {
		this.dqiMetrics = dqiMetrics;
	}

	public String getCaseStudies() {
		return caseStudies;
	}

	public void setCaseStudies(String caseStudies) {
		this.caseStudies = caseStudies;
	}

	public Employee() {

	}

	
}
