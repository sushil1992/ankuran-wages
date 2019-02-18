package com.ankuran.wages;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * To run project as a Jar file remove extends SpringBootServletInitializer
 */
@SpringBootApplication
public class WagesApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(WagesApplication.class, args);
    }
}


