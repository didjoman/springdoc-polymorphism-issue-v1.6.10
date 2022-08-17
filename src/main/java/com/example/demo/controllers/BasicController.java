package com.example.demo.controllers;

import io.swagger.v3.oas.annotations.Operation;

import com.example.demo.model.Animal;
import com.example.demo.model.Dog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class BasicController {

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "get", description = "Provides an animal.")
    public Animal get() {

        return new Dog("Foo", 12);
    }
}
