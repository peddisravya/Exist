package com.latest.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latest.config.DBInitializeConfig;
import com.latest.model.Emp;
import com.latest.model.Employee;
import com.latest.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeerepository;

	@Autowired
	EntityManager entitymanager;
	// public List<Course> courses = new ArrayList<Course>(
	// Arrays.asList(new Course("1", ".net"), new Course("2", "java")));

	public java.util.List<Employee> getAllEmployees() {
		List<Employee> employee = new ArrayList<>();
		employeerepository.findAll().forEach(employee::add);
		// return courses;
		return employee;
	}

	public Employee getEmployee(String sapId) {
		// return
		// courses.stream().filter(t->t.getId().equals(id).findfirst().get());
		// return courses.stream().filter(t ->
		// t.getId().equals(id)).findFirst().get();
		return employeerepository.findOne(sapId);
	}

	public Employee addEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	public void updateEmployee(String sapId, Employee employee) {
		employeerepository.save(employee);
		
		 
	}

	public void deleteEmployee(String sapId) {
		// courses.removeIf(t -> t.getId().equals(id));
		employeerepository.delete(sapId);

	}



}
