package com.poja.prime.service.prime;

import java.math.BigInteger;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class PrimeService {
    public BigInteger generatePrime(){
        return BigInteger.probablePrime(10000, new Random());
    }
}
