package com.apptanium.apps.mailserver.controllers;

import com.apptanium.apps.mailserver.exceptions.ItemNotFoundException;
import com.apptanium.apps.mailserver.om.User;
import com.apptanium.apps.mailserver.payloads.OkResponse;
import com.apptanium.apps.mailserver.payloads.TrustConnectRequest;
import com.apptanium.apps.mailserver.payloads.UserPublicKeyResponse;
import com.apptanium.apps.mailserver.repositories.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Provides endpoints for establishment of trust between two entities, verification of messages
 * and other trust-related actions
 *
 * Created by sgupta on 12/29/14.
 */
@Controller
@RequestMapping(value = "/{username}/trust/**", produces = "application/json", consumes = "application/json")
public class TrustController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/public-key", method = RequestMethod.GET)
  @ResponseBody
  public ResponseEntity<UserPublicKeyResponse> publicKey(@PathVariable("username") String username) {
/*
    return new ResponseEntity<>(new UserPublicKeyResponse(username,
                                                          "jhwerlkjqhwelrkjhqwlerhqkjwehrqlk3jh45kj34htrkjewhgfdjk"),
                                HttpStatus.OK);
*/
    User user = userService.getUserRepository().findByUsername(username);
    if(user == null) {
      throw new ItemNotFoundException("user " + username + " not found");
    }
    return new ResponseEntity<>(new UserPublicKeyResponse(user.getUsername(),
                                                          user.getPublicKeyBase64()),
                                HttpStatus.OK);
  }

  @RequestMapping(value = "/connect", method = RequestMethod.POST)
  @ResponseBody
  public ResponseEntity<OkResponse> connect(@PathVariable("username") String username,
                                @RequestBody TrustConnectRequest connectRequest) {
    return new ResponseEntity<>(new OkResponse(), HttpStatus.OK);
/*
    User user = userService.getUserRepository().findByUsername(username);
    if(user == null) {
      throw new ItemNotFoundException("user " + username + " not found");
    }
*/

  }



}
