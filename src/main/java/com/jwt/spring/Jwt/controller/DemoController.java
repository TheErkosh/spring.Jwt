package com.jwt.spring.Jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url");
    }

    @GetMapping("/admindashboard")
    public ResponseEntity<String> adminPage() {
        return ResponseEntity.ok("This page visible only ADMIN");
    }



}
