package com.Microservice_Eureka_Server_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("this is the eureka server");
		SpringApplication.run(MicroserviceEurekaServerApplication.class, args);
	}

}
