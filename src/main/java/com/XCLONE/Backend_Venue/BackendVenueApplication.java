package com.XCLONE.Backend_Venue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@EnableTransactionManagement
@SpringBootApplication
public class BackendVenueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendVenueApplication.class, args);
	}

}
