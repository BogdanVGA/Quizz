package com.cursC16.quizz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {

    @RequestMapping(value = "/add/first/{first}/second/{second}", method = RequestMethod.GET)
    public ResponseEntity<Integer> addNumbers(@PathVariable int first, @PathVariable int second) {
        Integer result = first + second;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}