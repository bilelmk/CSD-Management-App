package com.gestiondepartement.magementapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class MagementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagementAppApplication.class, args);
	}

}
