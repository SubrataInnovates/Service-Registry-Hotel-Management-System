package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryHotelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryHotelManagementSystemApplication.class, args);
	}

}
