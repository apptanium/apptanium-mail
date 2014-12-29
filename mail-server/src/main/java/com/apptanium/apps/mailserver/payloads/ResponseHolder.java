package com.apptanium.apps.mailserver.payloads;

/**
 * Created by sgupta on 12/28/14.
 */
public class ResponseHolder<T> {
  private ResponseStatus status;
  private T data;

  public ResponseHolder() {
  }

  public ResponseHolder(ResponseStatus status, T data) {
    this.status = status;
    this.data = data;
  }

  public ResponseStatus getStatus() {
    return status;
  }

  public void setStatus(ResponseStatus status) {
    this.status = status;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}