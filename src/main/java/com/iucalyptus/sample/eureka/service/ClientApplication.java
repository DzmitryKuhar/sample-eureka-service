package com.iucalyptus.sample.eureka.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Date: 06/13/2017
 *
 * @author Dzmitry Dziokin
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientApplication {

    @Value("${message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }

    @RequestMapping(value = "/greeting/{greeting}")
    public String greeting(@PathVariable String greeting) {
        return "Hello, your greeting: " + greeting;
    }
}
