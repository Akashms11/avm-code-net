package com.amv.net.codebaseavmwizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleApplication {

    @GetMapping("/health/test")
    public String health() {
        return "OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

}
