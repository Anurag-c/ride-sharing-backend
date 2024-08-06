package com.example.uberservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UberServiceDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(UberServiceDiscoveryApplication.class, args);
    }

}
