package com.project.young.restaurant.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = { "com.project.young.restaurant.service.dataaccess", "com.project.young.dataaccess" })
@EntityScan(basePackages = { "com.project.young.restaurant.service.dataaccess", "com.project.young.dataaccess" })
@SpringBootApplication(scanBasePackages = "com.project.young")
public class RestaurantServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
