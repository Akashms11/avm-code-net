package com.amv.net.codebaseavmwizard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ExampleApplication {


//    echo "# avm-code-net" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/Akashms11/avm-code-net.git
//    git push -u origin main

    @GetMapping("/health/test")
    public String health() {
        return "OK";
    }

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

}
