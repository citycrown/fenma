package com.fenma;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class FenmaEurekaConsumerApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/*public static void main(String[] args) {
		SpringApplication.run(FenmaEurekaConsumerApplication.class, args);
	}*/

	public static void main(String[] args) {
		new SpringApplicationBuilder(FenmaEurekaConsumerApplication.class).web(true).run(args);
	}
}
