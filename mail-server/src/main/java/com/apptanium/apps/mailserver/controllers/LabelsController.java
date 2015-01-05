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
@RequestMapping(value = "/{userId}/labels/**", produces = "application/json")
public class LabelsController {


  @RequestMapping(value = "/threads/{id}", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity register(@PathVariable("id") String id) {
    return new ResponseEntity(HttpStatus.OK);
  }

}
