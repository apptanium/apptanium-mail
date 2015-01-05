package com.apptanium.apps.mailserver.exceptions;

/**
 * Created by sgupta on 12/30/14.
 */
public class SignatureMismatchException extends RuntimeException {
  public SignatureMismatchException() {
  }

  public SignatureMismatchException(String message) {
    super(message);
  }

  public SignatureMismatchException(String message, Throwable cause) {
    super(message, cause);
  }

  public SignatureMismatchException(Throwable cause) {
    super(cause);
  }

  public SignatureMismatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
}
