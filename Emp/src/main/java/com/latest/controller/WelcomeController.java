package com.latest.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.latest.validator.FileValidator;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUserName());
		return "welcome2";
	}

	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}


	private String getPrincipal() {
		String userName = null;
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			userName = ((UserDetails) principal).getUsername();
		} else {
			userName = principal.toString();
		}
		return userName;
	}

	@RequestMapping(value = "/file", method = RequestMethod.GET)
	public String FileUploadPage(ModelMap model) {
		return "upload";
	}
	@Autowired
	private FileValidator fileValidator;

	@RequestMapping(value = "/upl", method = RequestMethod.GET)
	public String submit(ModelMap model)
			throws IOException {
		model.put("message", "upload");
		model.addAttribute("message", "uploaded succesfully");
				return "successFile";
		
	}
}