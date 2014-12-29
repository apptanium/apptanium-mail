package com.apptanium.apps.mailserver.om;


import com.apptanium.apps.mailserver.repositories.IdGeneratorStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * This is the basic message object: it is composed by users, and has labels, attachments, and other
 * properties
 *
 * Created by sgupta on 12/28/14.
 */
@Entity
public class Message {

  @Id
  private String id;

  @PrePersist
  public void generateId() {
    if(this.id == null) {
      id = IdGeneratorStrategy.generateId();
    }
  }
}
