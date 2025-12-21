package com.example.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner testMyDbConnection(DataSource dataSource){
		// the CommandLineRunner automate testing the connection established between our java code as well as mySql and when the developer wants to the connection immediately at that time CommandLineRunner is use. 
		return args -> {
			try (Connection con = dataSource.getConnection();
				Statement stmt  = con.createStatement()){

					String sql  = "select * from checkins";
					ResultSet rs = stmt.executeQuery(sql);

					while (rs.next()) {
						System.out.println("Id: "+ rs.getInt("checkin_id"));
						System.out.println("Name: "+ rs.getString("name"));
					}
			} catch(Exception e) {
				e.printStackTrace();
			}
		};	
	}
}
