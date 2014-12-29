package com.apptanium.apps.mailserver.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Nullable;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by sgupta on 12/28/14.
 */
@Controller
@RequestMapping(value = "/{userId}/attachments/**", produces = "application/json")
public class AttachmentsController {

  @RequestMapping(value = "/{attachmentId}", method = RequestMethod.GET)
  @ResponseBody
  public void get(@PathVariable("userId") String userId,
                  @PathVariable("attachmentId") String attachmentId,
                  @RequestParam(value = "headOnly", required = false, defaultValue = "false") Boolean headOnly,
                  HttpServletResponse response) {
  }
}
