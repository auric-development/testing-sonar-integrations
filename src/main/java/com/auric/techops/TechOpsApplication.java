package com.auric.techops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechOpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TechOpsApplication.class, args);
    }

    public void testmethod() {
        System.out.println("test");
    }

}
