package com.bhavana.springbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBackendApplication {

    public static void main(String[] args) {
        System.out.println("Hi there");
        SpringApplication.run(SpringBackendApplication.class, args);
    }

}
