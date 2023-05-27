package com.advanceacademy.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Car car = new Car();
		car.setModel("audi a8 ");

		System.out.println(car.toString());
	}

}
