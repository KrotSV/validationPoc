package com.example.validation.poc.controller;

import static org.springframework.http.ResponseEntity.status;

import com.example.validation.poc.exceprion.ValidationException;
import com.example.validation.poc.model.AlertType;
import com.example.validation.poc.model.ExceptionResponse;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "validation/alertType")
public class AlertTypeController {

  private Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

  @PostMapping
  public String validate(@RequestBody AlertType alertType) {
    Set<ConstraintViolation<AlertType>> constraintViolations = validator.validate(alertType);
    if (CollectionUtils.isNotEmpty(constraintViolations)) {
      Set<String> errorMessages = constraintViolations.stream()
          .map(ConstraintViolation::getMessage)
          .collect(Collectors.toSet());
      throw new ValidationException("Validation failed", errorMessages);
    }
    return "this is fine";
  }

  @ExceptionHandler
  public ResponseEntity<ExceptionResponse> handleValidationException(ValidationException ex) {
    ExceptionResponse response = new ExceptionResponse(ex, ex.getMessage(), ex.getViolationMessages());
    return status(HttpStatus.BAD_REQUEST).body(response);
  }
}
