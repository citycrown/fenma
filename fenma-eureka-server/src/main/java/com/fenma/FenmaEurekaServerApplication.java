package com.fenma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FenmaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FenmaEurekaServerApplication.class, args);
	}
}
