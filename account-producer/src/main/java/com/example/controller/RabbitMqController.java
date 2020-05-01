package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.service.RabbitMqService;

@RestController
public class RabbitMqController {
    @Autowired
    RabbitMqService rabbitMqService;

    @PostMapping("/accounts")
    public ResponseEntity<String> postMessage(@RequestBody Account account){
        rabbitMqService.sendMessage(account);
        return new ResponseEntity<String>("Item pushed to RabbitMQ",HttpStatus.CREATED);
    }
}
