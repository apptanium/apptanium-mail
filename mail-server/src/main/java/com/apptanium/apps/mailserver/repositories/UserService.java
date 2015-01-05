package com.apptanium.apps.mailserver.repositories;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * Created by sgupta on 12/30/14.
 */
public class UserService {

  @Autowired
  private UserRepository userRepository;

  @PostConstruct
  public void initialize() {

  }

  public UserRepository getUserRepository() {
    return userRepository;
  }
}
