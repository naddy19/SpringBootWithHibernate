package com.naveedmomin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

        SpringApplication.run(TestMainClass.class, args);
    }
}
