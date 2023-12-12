package com.poja.prime.endpoint.rest.controller;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.ricka.base.conf.FacadeIT;
import java.math.BigInteger;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
public class PrimeControllerIT {
    @Autowired PrimeController primeController;
    @Test
    public void probably_prime() {
      String number = primeController.getPrime();
      assertTrue(new BigInteger(number).isProbablePrime(100));
    }
}
