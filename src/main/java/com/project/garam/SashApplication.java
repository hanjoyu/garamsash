package com.project.garam;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.project.garam")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SashApplication {

	public static void main(String[] args) {
		SpringApplication.run(SashApplication.class, args);
	}
}
