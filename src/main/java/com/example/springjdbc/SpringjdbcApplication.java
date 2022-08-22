package com.example.springjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringjdbcApplication 
{
	public static void main(String[] args) 
	{
		try
		{
			SpringApplication.run(SpringjdbcApplication.class, args);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
