package com.example.headfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HeadFirstApplication {

    public static void main(String[] args) {
        Number ixt = new Integer(1);
        List<? super Integer> abf = new ArrayList<Number>();
        SpringApplication.run(HeadFirstApplication.class, args);
    }

}
