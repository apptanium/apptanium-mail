package com.apptanium.apps.mailserver.exceptions;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sgupta on 12/30/14.
 */
@ControllerAdvice
public class ExceptionControllerAdvisor {

  private ObjectMapper objectMapper = new ObjectMapper();


  public ExceptionControllerAdvisor() {
    objectMapper.getFactory().configure(JsonGenerator.Feature.ESCAPE_NON_ASCII, true);
  }

  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  @ExceptionHandler(ItemNotFoundException.class)
  public void handle404(HttpServletRequest request, HttpServletResponse response, ItemNotFoundException e) throws IOException {
    ObjectNode objectNode = objectMapper.createObjectNode();
    objectNode.put("status", "error");
    objectNode.put("message", e.getMessage());
    objectNode.put("code", HttpStatus.NOT_FOUND.value());
    objectMapper.writeValue(response.getWriter(), objectNode);
  }

  @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
  @ExceptionHandler(UnauthorizedException.class)
  public void handle401(HttpServletRequest request, HttpServletResponse response, UnauthorizedException e) throws IOException {
    ObjectNode objectNode = objectMapper.createObjectNode();
    objectNode.put("status", "error");
    objectNode.put("message", e.getMessage());
    objectNode.put("code", HttpStatus.UNAUTHORIZED.value());
    objectMapper.writeValue(response.getWriter(), objectNode);
  }

  @ResponseStatus(value = HttpStatus.FORBIDDEN)
  @ExceptionHandler(SignatureMismatchException.class)
  public void handleSignatureMismatch(HttpServletRequest request, HttpServletResponse response, SignatureMismatchException e) throws IOException {
    ObjectNode objectNode = objectMapper.createObjectNode();
    objectNode.put("status", "error");
    objectNode.put("message", e.getMessage());
    objectNode.put("code", HttpStatus.FORBIDDEN.value());
    objectMapper.writeValue(response.getWriter(), objectNode);
  }
}
