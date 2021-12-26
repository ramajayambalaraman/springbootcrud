package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages =
{"com.example.*"})
@EntityScan("com.example.demo")
@EnableJpaRepositories("com.example.repository")
public class IncedoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncedoDemoApplication.class, args);
		System.out.println("hiii");
	}

}
