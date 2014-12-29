package com.apptanium.apps.mailserver.repositories;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by sgupta on 12/28/14.
 */
public class IdGeneratorStrategy {

  private static final char[] CHARS = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
  private static final Random RANDOM = new SecureRandom();

  public static String generateId() {
    char[] randChars = new char[8];
    for (int i = 0; i < randChars.length; i++) {
      randChars[i] = CHARS[RANDOM.nextInt(CHARS.length)];
    }
    //the toString operation is already lowercase
    return Long.toString(System.currentTimeMillis(), 36) + new String(randChars);
  }
}
