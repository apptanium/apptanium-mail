package com.apptanium.apps.mailserver.controllers;

import com.apptanium.apps.mailserver.exceptions.ItemNotFoundException;
import com.apptanium.apps.mailserver.repositories.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * This is the system-level info controller, it allows other mail servers to contact this server for standard information
 * about availability, versions, etc.
 *
 * Created by sgupta on 12/28/14.
 */
@Controller
@RequestMapping(value = "/info/**", produces = "application/json")
public class InfoController {

/*
  @Autowired
  private LabelRepository labelRepository;
*/

  @RequestMapping("/")
  @ResponseBody
  public String get() {
    throw new ItemNotFoundException("this is a test");
  }
}
