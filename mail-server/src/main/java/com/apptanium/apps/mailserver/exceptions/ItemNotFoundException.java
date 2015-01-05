package com.apptanium.apps.mailserver.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sgupta on 12/29/14.
 */
public class ItemNotFoundException extends RuntimeException {

  public ItemNotFoundException() {
    super();
  }

  public ItemNotFoundException(String message) {
    super(message);
  }

  public ItemNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  public ItemNotFoundException(Throwable cause) {
    super(cause);
  }
}
