package com.apptanium.apps.mailserver.om;

import com.apptanium.apps.mailserver.repositories.IdGeneratorStrategy;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

/**
 * Created by sgupta on 12/28/14.
 */
public class Label {

  @Id
  private final String id;

  private String name;

  private Label() {
    this.id = null;
  }

  public Label(@NotNull String id) {
    this.id = id;
  }

  public Label(@NotNull String id, @NotNull String name) {
    this(id);
    this.name = name;
  }


  public String getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
