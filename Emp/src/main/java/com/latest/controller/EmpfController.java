package com.latest.controller;

import com.latest.Dao.DataDao;
import com.latest.model.Emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by WS on 4/2/17.
 */
@RestController
@RequestMapping("/emp")
public class EmpfController {

	@Autowired
	DataDao dao;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createRecord(@RequestBody Emp emp) {

		try {
			dao.create(emp);

		} catch (Exception ex) {
			System.out.println("Exception in hibernate setup");
		}

	}

	@RequestMapping(method = RequestMethod.GET, value = "/{empId}")
	public Emp getRecord(@PathVariable(value = "empId") long empId) {

		Emp records = null;

		try {
			records = dao.getEmpById(empId);
		} catch (Exception ex) {
			System.out.println("Exception in hibernate setup");
		}

		return records;
	}
}