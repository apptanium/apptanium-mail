package com.apptanium.apps.mailserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sgupta on 12/28/14.
 */
@Controller
@RequestMapping(value = "/oauth/**", produces = "application/json")
public class OauthController {
}
