package com.latest.config;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBInitializeConfig {
	Connection connection;

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void initialize() {
		try {
			 connection = dataSource.getConnection();
			Statement statement = connection.createStatement();
			statement.execute("DROP TABLE IF EXISTS Employee");
statement.executeUpdate("CREATE TABLE Employee "+ "(" + "sapId INTEGER Primary key, " + "ename varchar(30),"
+ "workingLocation varchar(30),"+ "dateofjoining INTEGER(20),"+"dqiMetrics varchar(30),"+"caseStudies varchar(30))");
			statement.executeUpdate("INSERT INTO Employee " + "(sapId,ename,workingLocation,dateofjoining,dqiMetrics,caseStudies) " + "VALUES " + "('126','Bharat','chennai','20-10-2017', 'yes','yes')");
			statement.executeUpdate("INSERT INTO Employee " + "(sapId,ename,workingLocation,dateofjoining,dqiMetrics,caseStudies) " + "VALUES " + "('2', 'Anitha', 'noida', '25-11-1992', 'yes','yes')");
			statement.executeUpdate("INSERT INTO Employee " + "(sapId,ename,workingLocation,dateofjoining,dqiMetrics,caseStudies) " + "VALUES " + "('3', 'Ramya', 'chennai', '25-11-1992', 'yes','yes')");
			
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}