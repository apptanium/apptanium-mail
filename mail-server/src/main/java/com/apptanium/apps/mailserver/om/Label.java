package com.apptanium.apps.mailserver.om;

import com.apptanium.apps.mailserver.repositories.IdGeneratorStrategy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * Created by sgupta on 12/28/14.
 */
@Entity
public class Label {

  @Id
  private String id;

  private String name;



  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @PrePersist
  public void generateId() {
    if(this.id == null) {
      id = IdGeneratorStrategy.generateId();
    }
  }
}
