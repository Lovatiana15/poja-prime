package com.poja.prime.endpoint.rest.controller;
import com.poja.prime.service.prime.PrimeService;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.math.BigInteger;

@RestController
@RequestMapping("/new-prime")
public class PrimeController {
    private final PrimeService primeService;
    @Autowired
    public PrimeController(PrimeService primeService){
        this.primeService = primeService;
    }
    @GetMapping
    public String getNewPrime(){
        BigInteger prime = primeService.generatePrime();
        return "Probablement premier à 10_000 bits: " + prime.toString();
    }
}
