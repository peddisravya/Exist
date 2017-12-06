package com.latest.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.latest.model.Emp;

@Controller
public class EmpController {

	@Autowired
	com.latest.service.EmpService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		// Date - dd/MM/yyyy
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-emps", method = RequestMethod.GET)
	public String showemps(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("Emps", service.retrieveemps(name));
		return "list-emps";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-emp", method = RequestMethod.GET)
	public String showAddempPage(ModelMap model) {
		model.addAttribute("emp", new Emp(0, getLoggedInUserName(model), "Employee Name", new Date(), false));
		return "emp";
	}

	@RequestMapping(value = "/delete-emp", method = RequestMethod.GET)
	public String deleteemp(@RequestParam int id) {

		if (id == 1)
			throw new RuntimeException("Something went wrong");

		service.deleteemp(id);
		return "redirect:/list-emps";
	}

	@RequestMapping(value = "/update-emp", method = RequestMethod.GET)
	public String showUpdateempPage(@RequestParam int id, ModelMap model) {
		Emp emp = service.retrieveemp(id);
		model.put("emp", emp);
		return "emp";
	}

	@RequestMapping(value = "/update-emp", method = RequestMethod.POST)
	public String updateemp(ModelMap model, @Valid Emp emp, BindingResult result) {

		if (result.hasErrors()) {
			return "emp";
		}

		emp.setUser(getLoggedInUserName(model));
		service.updateemp(emp);
		return "redirect:/list-emps";
	}

	@RequestMapping(value = "/add-emp", method = RequestMethod.POST)
	public String addemp(ModelMap model, @Valid Emp emp, BindingResult result) {

		if (result.hasErrors()) {
			return "emp";
		}

		service.addemp(getLoggedInUserName(model), emp.getempName(), emp.getjoinDate(), false);
		return "redirect:/list-emps";
	}
	
	@RequestMapping(value = "/emplist", method = RequestMethod.GET)
	public String EmpList(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("Emps", service.retrieveemps(name));
		return "emplist";
	}
	@RequestMapping(value = "/newUpload", method = RequestMethod.GET)
	public String EmpUpload(ModelMap model) {
		return "page";
	}
	@RequestMapping(value = "/newProcess", method = RequestMethod.GET)
	public String EmpProcess(ModelMap model) {
		return "upload_page";
	}
}
