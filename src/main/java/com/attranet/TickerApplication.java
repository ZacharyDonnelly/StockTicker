package com.attranet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TickerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TickerApplication.class, args);
    }
}
