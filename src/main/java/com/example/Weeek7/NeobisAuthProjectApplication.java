package com.example.Weeek7;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@Slf4j
@OpenAPIDefinition(servers = {
		@Server(url = "/", description = "Default Server URL")})
public class NeobisAuthProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeobisAuthProjectApplication.class, args);
	}

}
