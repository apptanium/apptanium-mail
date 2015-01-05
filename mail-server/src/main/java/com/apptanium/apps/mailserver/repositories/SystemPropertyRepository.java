package com.apptanium.apps.mailserver.repositories;

import com.apptanium.apps.mailserver.om.SystemProperty;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by sgupta on 1/1/15.
 */
public interface SystemPropertyRepository extends MongoRepository<SystemProperty, String> {


}
