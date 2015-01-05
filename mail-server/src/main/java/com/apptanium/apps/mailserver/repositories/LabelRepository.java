package com.apptanium.apps.mailserver.repositories;

import com.apptanium.apps.mailserver.om.Label;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sgupta on 12/30/14.
 */
public interface LabelRepository extends MongoRepository<Label, String> {
}
