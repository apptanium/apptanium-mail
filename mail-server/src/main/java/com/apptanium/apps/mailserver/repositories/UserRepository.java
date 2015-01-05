package com.apptanium.apps.mailserver.repositories;

import com.apptanium.apps.mailserver.om.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sgupta on 12/30/14.
 */
public interface UserRepository extends MongoRepository<User, String> {

  public User findByUsername(String username);
}
