package com.apptanium.apps.mailserver.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sgupta on 12/28/14.
 */
@Controller
@RequestMapping(value = "/{userId}/drafts/**", produces = "application/json")
public class DraftsController {

  @RequestMapping(value = "/get", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<String> get(@PathVariable("userId") String userId) {
    return new ResponseEntity<String>("drafts for user id: " + userId, HttpStatus.OK);
  }
}
