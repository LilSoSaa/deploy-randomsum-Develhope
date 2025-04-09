package com.develhope.deploy_randomsum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;


@RestController
public class RandomSumController {

    @GetMapping("/sum")
    public String randomSum() {
        double a = Math.random() * 100;
        double b = Math.random() * 100;
        double sum = a + b;

        // Aggiungi un log di debug
        System.out.println("Somma generata: " + sum);

        // Restituisce la somma formattata a 2 decimali
        return String.format("Sum: %.2f", sum);
    }
}
