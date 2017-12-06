package com.latest.controller;

import java.util.List;

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
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
/*
	@RequestMapping("/employees")
	public List<Employee> getAllTopics() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping("/employees/{sapId}")
	public Employee getEmployee(@PathVariable String sapId) {
		return employeeService.getEmployee(sapId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{sapId}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String sapId) {
		employeeService.updateEmployee(sapId, employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{sapId}")
	public void deleteEmployee(@PathVariable String sapId) {
		employeeService.deleteEmployee(sapId);
	}*/
	
	
	@RequestMapping(value="/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllTopics() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value="/employees/{sapId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable String sapId) {
		return employeeService.getEmployee(sapId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{sapId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateEmployee(@RequestBody Employee employee, @PathVariable String sapId) {
		employeeService.updateEmployee(sapId, employee);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{sapId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteEmployee(@PathVariable String sapId) {
		employeeService.deleteEmployee(sapId);
	}
}
