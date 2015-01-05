package com.apptanium.apps.mailserver.om;

import org.springframework.data.annotation.Id;

/**
 * Created by sgupta on 12/30/14.
 */
public class Contact {

  @Id
  private final String id;

  public Contact(String id) {
    this.id = id;
  }
}
