package com.apptanium.apps.mailserver.payloads;

/**
 * Created by sgupta on 12/30/14.
 */
public class TrustConnectRequest {

  private String email;

  private String encryptedSharedKeyBase64;

  private String hmacSHA256Signature;

  public TrustConnectRequest() {
  }

  public TrustConnectRequest(String email, String encryptedSharedKeyBase64, String hmacSHA256Signature) {
    this.email = email;
    this.encryptedSharedKeyBase64 = encryptedSharedKeyBase64;
    this.hmacSHA256Signature = hmacSHA256Signature;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEncryptedSharedKeyBase64() {
    return encryptedSharedKeyBase64;
  }

  public void setEncryptedSharedKeyBase64(String encryptedSharedKeyBase64) {
    this.encryptedSharedKeyBase64 = encryptedSharedKeyBase64;
  }

  public String getHmacSHA256Signature() {
    return hmacSHA256Signature;
  }

  public void setHmacSHA256Signature(String hmacSHA256Signature) {
    this.hmacSHA256Signature = hmacSHA256Signature;
  }

}
