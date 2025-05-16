package com.example.pow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PowController {
    @GetMapping("{number}")
    public double pow(@PathVariable int number) {
        return Math.pow(number, 2);
    }
}
