package com.apptanium.apps.mailserver.om;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;

/**
 * Created by sgupta on 12/30/14.
 */
public class UserContactSharedKey {

  @Id
  private final String id;

  private String aesBase64;

  @Indexed
  private final String userEmail;

  @Indexed
  private final String contactEmail;


  public UserContactSharedKey(@NotNull String userEmail, @NotNull String contactEmail, String aesBase64) {
    this.userEmail = userEmail;
    this.contactEmail = contactEmail;
    this.id = userEmail + ":" + contactEmail;
    this.aesBase64 = aesBase64;
  }

  public String getId() {
    return id;
  }

  public String getUserEmail() {
    return userEmail;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public String getAesBase64() {
    return aesBase64;
  }

  public void setAesBase64(String aesBase64) {
    this.aesBase64 = aesBase64;
  }
}
