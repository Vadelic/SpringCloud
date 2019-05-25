package com.greenbalance.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class ClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ClientApplication.class).web(true).run(args);
//        SpringApplication.run(ClientApplication.class, args);
    }

}
