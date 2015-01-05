package com.apptanium.apps.mailserver.security;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by sgupta on 1/5/15.
 */
public class SecurityUtils {
  public static SecureRandom RANDOM;

  static {
    try {
      RANDOM = SecureRandom.getInstance("SHA256PRNG");
    }
    catch (NoSuchAlgorithmException e) {

    }
  }

  public static KeyPair createKeyPair() throws NoSuchAlgorithmException {
    KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
    generator.initialize(2048, RANDOM);
    KeyPair keyPair = generator.generateKeyPair();
    return keyPair;
  }

  public static SecretKey createAESKey() throws NoSuchAlgorithmException {
    KeyGenerator generator = KeyGenerator.getInstance("AES");
    generator.init(256, RANDOM);
    SecretKey key = generator.generateKey();
    return key;
  }
}
