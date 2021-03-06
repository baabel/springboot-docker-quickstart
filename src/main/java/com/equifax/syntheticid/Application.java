package com.equifax.syntheticid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@EnableSwagger2
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Synthetic ID World Version 1";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}