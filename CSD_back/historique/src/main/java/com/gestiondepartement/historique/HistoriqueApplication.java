package com.gestiondepartement.historique;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class HistoriqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoriqueApplication.class, args);
	}

}
