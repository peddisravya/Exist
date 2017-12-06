package com.latest.config;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.latest.Dao.FileUploadDAO;
import com.latest.Dao.FileUploadDAOImpl;

@Configuration
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class DBConfig {

	/*
	 * @Autowired Environment env;
	 */
/*	@Autowired
	@Bean(name = "fileUploadDao")
	public FileUploadDAO getUserDao(SessionFactory sessionFactory) {
		return new FileUploadDAOImpl(sessionFactory);
	}*/
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartResolver() {
	    CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	    multipartResolver.setMaxUploadSize(20971520);   // 20MB
	    multipartResolver.setMaxInMemorySize(1048576);  // 1MB
	    return multipartResolver;
	}

	@Bean

	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.sqlite.JDBC");
		dataSource.setUrl("jdbc:sqlite:D://sqlitedb/Test1;user=admin;password=admin");
		dataSource.setUsername("admin");
		dataSource.setPassword("admin");

		return dataSource;
	}

	/*
	 * @Bean public EntityManager entityManager() { // EntityManager e=emf.
	 * return entityManagerFactory().getObject().createEntityManager(); }
	 */

	@Bean
	public PlatformTransactionManager transactionManager() {
		EntityManagerFactory factory = entityManagerFactory().getObject();
		return new JpaTransactionManager(factory);
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter(); //
		vendorAdapter.setGenerateDdl(Boolean.TRUE);
		vendorAdapter.setShowSql(Boolean.FALSE);
		factory.setDataSource(dataSource());
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan("com.latest.model");
		Properties jpaProperties = new Properties();
		jpaProperties.put("javax.persistence.jdbc.user", "admin");
		jpaProperties.put("javax.persistence.jdbc.password", "admin");
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.SQLiteDialect");
		factory.setJpaProperties(jpaProperties);
		factory.afterPropertiesSet();
		factory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		return factory;

	}

	@Bean
	public HibernateExceptionTranslator hibernateExceptionTranslator() {
		return new HibernateExceptionTranslator();
	}
}