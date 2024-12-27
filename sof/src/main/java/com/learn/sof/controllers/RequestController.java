package com.learn.sof.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/tasks/")
public class RequestController {

    @GetMapping(path="{name}")
    public ResponseEntity<String> message(@PathVariable String name){
        return new ResponseEntity<String>(String.format("Hi, %s", name), HttpStatus.OK);
    }

    @DeleteMapping(value="{name}")
    public ResponseEntity<String> delete(@PathVariable String name){
        return new ResponseEntity<String>(String.format("Hi, %s %s", name, ", your request has been accepted"), HttpStatus.OK);
    }
}
