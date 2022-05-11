package com.openclassrooms.testing.calcul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApp {

    public static void main(String[] args) {
    	// commentaire pour lancer sonarcloud
        SpringApplication.run(CalculatorApp.class, args);
    }
}
