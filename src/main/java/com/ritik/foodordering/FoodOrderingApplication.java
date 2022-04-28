package com.ritik.foodordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.ritik.foodordering.util.FileStorageProperties;

@SpringBootApplication

@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FoodOrderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodOrderingApplication.class, args);
	}

}
