package com.apptanium.apps.mailserver.payloads;

/**
 * Created by sgupta on 12/30/14.
 */
public class UserPublicKeyResponse {

  private final String username;

  private final String publicKeyBase64;

  public UserPublicKeyResponse(String username, String publicKeyBase64) {
    this.username = username;
    this.publicKeyBase64 = publicKeyBase64;
  }

  public String getUsername() {
    return username;
  }

  public String getPublicKeyBase64() {
    return publicKeyBase64;
  }
}
