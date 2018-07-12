package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExceptionResponse {

  @JsonIgnore
  private RuntimeException exception;

  private String message;

  private Set<String> violationMessages;
}
