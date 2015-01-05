package com.apptanium.apps.mailserver.repositories;

import com.apptanium.apps.mailserver.om.SystemProperty;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * Created by sgupta on 1/1/15.
 */
public class SystemService {

  public static enum PropertyType {
    SystemKeyPair,
    SystemDomain,
    SystemAdminPassword,
  }

  private Map<PropertyType,SystemProperty> cache;

  @Autowired
  private SystemPropertyRepository systemPropertyRepository;

  @PostConstruct
  public void initialize() {
    SystemProperty keyPairProperty = systemPropertyRepository.findOne(SystemService.PropertyType.SystemKeyPair.name());
    if(keyPairProperty == null) {
      keyPairProperty = new SystemProperty(SystemService.PropertyType.SystemKeyPair.name());
      keyPairProperty.getProperties().put("public_key", "");
      keyPairProperty.getProperties().put("private_key", "");

    }

  }


}
