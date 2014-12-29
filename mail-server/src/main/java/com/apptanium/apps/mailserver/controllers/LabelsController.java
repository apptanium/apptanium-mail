package com.apptanium.apps.mailserver.controllers;

import com.apptanium.apps.mailserver.payloads.ResponseHolder;
import com.apptanium.apps.mailserver.payloads.ResponseStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sgupta on 12/28/14.
 */
@Controller
@RequestMapping(value = "/{userId}/labels/**", produces = "application/json")
public class LabelsController {


  @RequestMapping(value = "/threads/{id}", method = RequestMethod.POST)
  @ResponseBody
  public ResponseHolder register(@PathVariable("id") String id) {
    return new ResponseHolder<>(ResponseStatus.ok, null);
  }

}
