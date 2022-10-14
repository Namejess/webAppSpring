package com.openclassrooms.webApp;

import com.openclassrooms.controller.EmployeeController;
import com.openclassrooms.model.Employee;
import com.openclassrooms.repository.EmployeeProxy;
import com.openclassrooms.service.EmployeeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Data
@SpringBootApplication
@ComponentScan(basePackageClasses = EmployeeController.class)
@ComponentScan(basePackageClasses = Employee.class)
@ComponentScan(basePackageClasses = EmployeeProxy.class)
@ComponentScan(basePackageClasses = EmployeeService.class)
@ComponentScan(basePackageClasses = CustomProperties.class)

public class WebAppApplication implements CommandLineRunner {

	@Autowired
	private CustomProperties properties;

	public static void main(String[] args) {
		SpringApplication.run(WebAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(properties.getApiUrl());
	}

}