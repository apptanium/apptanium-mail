package com.apptanium.apps.mailserver.om;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.Date;

/**
 * Created by sgupta on 12/30/14.
 */
public class MessageHistoryItem {

  @Id
  private final String id;

  @Indexed
  private final Date date;

  public MessageHistoryItem(String id, Date date) {
    this.id = id;
    this.date = date;
  }
}
