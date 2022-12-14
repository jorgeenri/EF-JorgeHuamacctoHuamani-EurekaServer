package com.idat.EFJorgeHuamacctoTurista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfJorgeHuamacctoEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfJorgeHuamacctoEurekaServerApplication.class, args);
	}

}
