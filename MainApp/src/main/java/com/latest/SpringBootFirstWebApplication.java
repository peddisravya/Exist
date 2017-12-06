package com.latest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.latest")
public class SpringBootFirstWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}

/*	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver resolver() {
		return new CommonsMultipartResolver();
	}

	@Bean(name = "messageSource")
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("validation");
		return messageSource;
	}

	@Bean(name = "fileValidator")
	public FileValidator fileValidator() {
		return new FileValidator();
	}
	*/
}
