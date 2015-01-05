package com.apptanium.apps.mailserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sgupta on 12/29/14.
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "not authorized")
public class UnauthorizedException extends RuntimeException {
}
