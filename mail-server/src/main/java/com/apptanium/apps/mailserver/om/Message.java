package com.apptanium.apps.mailserver.om;


import com.apptanium.apps.mailserver.repositories.IdGeneratorStrategy;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;


/**
 * This is the basic message object: it is composed by users, and has labels, attachments, and other
 * properties
 *
 * Created by sgupta on 12/28/14.
 */
public class Message {

  @Id
  private final String id;

  @Indexed
  private Date date;

  private Message() {
    this.id = null;
  }

  public Message(String id) {
    this.id = id;
  }



}
