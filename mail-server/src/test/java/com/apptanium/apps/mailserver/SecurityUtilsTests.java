package com.apptanium.apps.mailserver;

import com.apptanium.apps.mailserver.security.SecurityUtils;
import org.apache.commons.codec.binary.Base64;
import org.junit.Test;

import java.security.Key;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;

/**
 * Created by sgupta on 1/5/15.
 */
public class SecurityUtilsTests {

  @Test
  public void testKeyPair() throws NoSuchAlgorithmException {
    KeyPair keyPair = SecurityUtils.createKeyPair();

    //todo: this will be converted to an actual encryption/decryption test
    System.out.println("keyPair = " + keyPair);
    System.out.println("++ Base64.encodeBase64URLSafeString(keyPair.getPrivate().getEncoded()) = " + Base64.encodeBase64URLSafeString(keyPair.getPrivate().getEncoded()));
    System.out.println("++ Base64.encodeBase64URLSafeString(keyPair.getPublic().getEncoded()) = " + Base64.encodeBase64URLSafeString(keyPair.getPublic().getEncoded()));



  }

  @Test
  public void testAESKey() throws NoSuchAlgorithmException {
    Key key = SecurityUtils.createAESKey();

    //todo: this will be converted to an actual encryption/decryption test
    System.out.println("key.getEncoded().length = " + key.getEncoded().length);
    System.out.println("** Base64.encodeBase64URLSafeString(key.getEncoded()) = " + Base64.encodeBase64URLSafeString(key.getEncoded()));
  }
}
