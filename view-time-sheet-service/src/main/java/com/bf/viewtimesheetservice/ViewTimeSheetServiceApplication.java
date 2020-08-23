package com.bf.viewtimesheetservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ViewTimeSheetServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ViewTimeSheetServiceApplication.class, args);
    }

}
