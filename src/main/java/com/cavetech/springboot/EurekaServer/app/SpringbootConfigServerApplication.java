package com.cavetech.springboot.EurekaServer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigServerApplication.class, args);
	}

}
