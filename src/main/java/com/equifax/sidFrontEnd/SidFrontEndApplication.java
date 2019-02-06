package com.equifax.sidfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SidFrontEndApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World Version 2";
    }

    public static void main(String[] args) {
        SpringApplication.run(SidFrontEndApplication.class, args);
    }

}