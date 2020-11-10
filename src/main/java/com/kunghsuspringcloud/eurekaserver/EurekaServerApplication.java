package com.kunghsuspringcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class KunShareEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KunShareEurekaServerApplication.class, args);
	}

}
