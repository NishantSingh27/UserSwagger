package com.rest.userswag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
public class UserSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSwaggerApplication.class, args);
	}

}
