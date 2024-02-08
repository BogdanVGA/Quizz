package com.cursC16.quizz.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class AddController {

    @RequestMapping(value = "/add/first/{first}/second/{second}", method = RequestMethod.GET)
    public ResponseEntity<BigInteger> addNumbers(@PathVariable long first, @PathVariable long second) {
        BigInteger bigFirst = BigInteger.valueOf(first);
        BigInteger bigSecond = BigInteger.valueOf(second);
        BigInteger bigResult = bigFirst.add(bigSecond);
        return new ResponseEntity<>(bigResult, HttpStatus.OK);
    }
}
