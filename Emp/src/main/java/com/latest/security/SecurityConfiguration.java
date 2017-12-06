package com.latest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	// Create User - in28Minutes/dummy
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("sravya").password("pass").roles("USER").and().withUser("adminr")
				.password("password").roles("ADMIN", "USER");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/login").permitAll().antMatchers("/", "/*emp*/**")
				.access("hasRole('USER')").and().formLogin().permitAll();
			//	.loginPage("/login").usernameParameter("app_username").passwordParameter("app_password").failureUrl("/login?error").

	}
}	
