package com.fixed.utility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FixedUtilityEurekaServer {

	public static void main(String[] args) {
		SpringApplication.run(FixedUtilityEurekaServer.class, args);
	}
}
