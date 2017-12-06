package com.latest;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.latest.validator.FileValidator;
import java.util.Properties;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Configuration
@EnableWebMvc
@EnableAutoConfiguration
@ComponentScan("com.latest")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class SpringBootFirstWebApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstWebApplication.class, args);
	}

	// @Bean
	// public RestTemplate geRestTemplate() {
	// return new RestTemplate();
	// }

	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite:D://sqlitedb/Test1");
		return dataSource;

	}

	// @Bean
	// public EntityManager entityManager() {
	// return entityManagerFactory().getObject().createEntityManager();
	// }
	//
	// @Bean
	// public PlatformTransactionManager transactionManager() {
	// EntityManagerFactory factory = entityManagerFactory().getObject();
	// return new JpaTransactionManager(factory);
	// }

	 @Bean
	 @Autowired
	 public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	 LocalContainerEntityManagerFactoryBean factory = new
	 LocalContainerEntityManagerFactoryBean();
	 HibernateJpaVendorAdapter vendorAdapter = new
	 HibernateJpaVendorAdapter();
	 // vendorAdapter.setGenerateDdl(Boolean.TRUE);
	 vendorAdapter.setShowSql(Boolean.FALSE);
	 factory.setDataSource(dataSource());
	 factory.setJpaVendorAdapter(vendorAdapter);
	 factory.setPackagesToScan("com.latest.model");
	 Properties jpaProperties = new Properties();
	 jpaProperties.put("hibernate.hbm2ddl.auto", "update");
	 jpaProperties.setProperty("hibernate.dialect",
	 "org.hibernate.dialect.SQLiteDialect");
	 factory.setJpaProperties(jpaProperties);
	 factory.afterPropertiesSet();
	 factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
	 return factory;
	 }

	// @Bean
	// public HibernateExceptionTranslator hibernateExceptionTranslator() {
	// return new HibernateExceptionTranslator();
	// }
	//
	// @Bean(name = "multipartResolver")
	// public CommonsMultipartResolver resolver() {
	// return new CommonsMultipartResolver();
	// }
	//
	// @Bean(name = "messageSource")
	// public MessageSource messageSource() {
	// ResourceBundleMessageSource messageSource = new
	// ResourceBundleMessageSource();
	// messageSource.setBasename("validation");
	// return messageSource;
	// }
	//
	// @Bean(name = "Validator")
	// public FileValidator fileValidator() {
	// return new FileValidator();
	// }

	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
// (scanBasePackages={"com.service.something","com.service.application"}

//
// =============================================
//
//
//
//
//
// @SpringBootApplication
//
// @Configuration
//
// @EnableWebMvc
//
// @ComponentScan(basePackages = "com.latest")
//
//// @EnableJpaRepositories(basePackages = "com.latest.repository")
//
// @EnableTransactionManagement
//
// public class SpringBootFirstWebApplication extends
// SpringBootServletInitializer {
//
//
// public static void main(String[] args) {
//
// SpringApplication.run(Application.class, args);
//
// }

// @Bean
//
// public RestTemplate geRestTemplate() {
//
// return new RestTemplate();
//
// }
//
// @Bean
// public EntityManager entityManager() {
// return entityManagerFactory().getObject().createEntityManager();
// }
//
// @Bean
// public PlatformTransactionManager transactionManager() {
// EntityManagerFactory factory = entityManagerFactory().getObject();
// return new JpaTransactionManager(factory);
// }
//
// @Bean
// public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
// LocalContainerEntityManagerFactoryBean factory = new
// LocalContainerEntityManagerFactoryBean();
// HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
// // vendorAdapter.setGenerateDdl(Boolean.TRUE);
// vendorAdapter.setShowSql(Boolean.FALSE);
// factory.setDataSource(dataSource());
// factory.setJpaVendorAdapter(vendorAdapter);
// factory.setPackagesToScan("com.metrics.spring.domain");
// Properties jpaProperties = new Properties();
// jpaProperties.put("hibernate.hbm2ddl.auto", "update");
// factory.setJpaProperties(jpaProperties);
// factory.afterPropertiesSet();
// factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
// return factory;
// }
//
// @Bean
// public HibernateExceptionTranslator hibernateExceptionTranslator() {
// return new HibernateExceptionTranslator();
// }
// }
