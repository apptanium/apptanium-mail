package com.apptanium.apps.mailserver.om;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by sgupta on 1/1/15.
 */
public class SystemProperty {

  @Id
  private final String id;

  private String value;

  private Map<String, Object> properties;

  public SystemProperty(String id) {
    this.id = id;
    this.value = "";
    this.properties = new HashMap<>();
  }

  public SystemProperty(String id, String value, Map<String,Object> properties) {
    this.id = id;
    this.value = value;
    this.properties = properties;
  }

  public String getId() {
    return id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public Object getProperty(String key) {
    return properties.get(key);
  }

  public Map<String,Object> putProperty(String key, Object value) {
    properties.put(key, value);
    return properties;
  }
}
