package com.latest.repository;

import org.springframework.data.repository.CrudRepository;

import com.latest.model.Employee;

public interface EmployeeRepository  extends CrudRepository<Employee, String> {

}
