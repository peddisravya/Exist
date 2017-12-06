/*package com.latest.controller;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latest.model.Employee;
import com.latest.service.EmployeeService;

@RestController
public class EmpMiController {

	
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getResources() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "/{sapId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable("sapId") String sapId) {
		return employeeService.getEmployee(sapId);
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveProjectModel(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> deleteProjectModel(@PathVariable("sapId") String sapId, @RequestBody Employee employee) {
		employeeService.deleteEmployee(sapId);
		return getResources();
	}
}*/