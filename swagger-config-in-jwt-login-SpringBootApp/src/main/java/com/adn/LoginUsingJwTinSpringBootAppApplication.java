package com.adn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@SpringBootApplication
public class LoginUsingJwTinSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginUsingJwTinSpringBootAppApplication.class, args);
	}

}
