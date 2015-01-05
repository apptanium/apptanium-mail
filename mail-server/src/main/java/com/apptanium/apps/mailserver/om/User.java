package com.apptanium.apps.mailserver.om;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;

/**
 * Created by sgupta on 12/30/14.
 */
public class User {

  @Id
  @JsonIgnore
  private final String id;

  @Indexed(unique = true)
  private String username;

  private String publicKeyBase64;

  @JsonIgnore
  private String privateKeyBase64;


  public User(@NotNull String id, @NotNull String username) {
    this.id = id;
    this.username = username;
  }

  public String getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPublicKeyBase64() {
    return publicKeyBase64;
  }

  public void setPublicKeyBase64(String publicKeyBase64) {
    this.publicKeyBase64 = publicKeyBase64;
  }

  public String getPrivateKeyBase64() {
    return privateKeyBase64;
  }

  public void setPrivateKeyBase64(String privateKeyBase64) {
    this.privateKeyBase64 = privateKeyBase64;
  }
}
