package com.example.validation.poc.exceprion;

import java.util.Set;
import lombok.Getter;

public class ValidationException extends RuntimeException {

  @Getter
  private String message;

  @Getter
  private Set<String> violationMessages;

  public ValidationException(String message, Set<String> violationMessages) {
    this.message = message;
    this.violationMessages = violationMessages;
  }
}
