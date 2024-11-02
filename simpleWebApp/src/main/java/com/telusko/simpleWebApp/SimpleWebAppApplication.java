package com.telusko.simpleWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebAppApplication.class, args);
	}

}
// Http method =  Get, put, post, delete

//Repository layer helps to connect database

//JPA comes with JDBC , JDBC takes 7 steps to execute , ORM only take few steps

// ORM helps to store the data without learning the Sql , it ask give me object i will store it in data
// ORM translate object into SQL query
//JPA is standards , Hibernate is implement those standards