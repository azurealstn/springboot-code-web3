package com.azurealstn.springbootcodeweb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootCodeWeb3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCodeWeb3Application.class, args);
	}

}
