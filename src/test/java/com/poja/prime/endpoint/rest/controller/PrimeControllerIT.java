package com.poja.prime.endpoint.rest.controller;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.poja.prime.conf.FacadeIT;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class PrimeControllerIT extends FacadeIT {
  @Autowired PrimeController primeController;
  @Test
  public void probably_prime() {
    String number = primeController.getPrime();
    assertTrue(new BigInteger(number).isProbablePrime(100));
  }
}
