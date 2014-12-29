package com.apptanium.apps.mailserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Provides endpoints for establishment of trust between two entities, verification of messages
 * and other trust-related actions
 *
 * Created by sgupta on 12/29/14.
 */
@Controller
@RequestMapping(value = "/{userId}/trust/**", produces = "application/json")
public class TrustController {


}
