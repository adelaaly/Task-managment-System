package com.arkx.userservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")

public class UserController {
    @GetMapping("/first")
    public ResponseEntity<String> helloOne(){
        return ResponseEntity.ok("hello this is the first 111111111 api");
    }

    @GetMapping("/second")
    public ResponseEntity<String> helloTow(){
        return ResponseEntity.ok("hello this is the second 2 api");
    }


}
