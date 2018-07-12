package com.example.validation.poc.model.validation;

import com.example.validation.poc.model.constraint.RecordsIncludedValidator;
import java.util.Arrays;
import java.util.List;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.apache.commons.collections4.CollectionUtils;


public class RecordsIncludedValidatorImpl implements
    ConstraintValidator<RecordsIncludedValidator, List<String>> {

  private RecordsIncludedValidator constraintAnnotation;

  @Override
  public void initialize(RecordsIncludedValidator constraintAnnotation) {
    this.constraintAnnotation = constraintAnnotation;
  }

  @Override
  public boolean isValid(List<String> recordsIncluded, ConstraintValidatorContext context) {
    context.disableDefaultConstraintViolation();

    if (CollectionUtils.isNotEmpty(recordsIncluded)) {
      List<String> records = Arrays.asList("ALL", "DROP_INS", "DROP_OUTS");
      if (!CollectionUtils.containsAll(records, recordsIncluded)) {
        addConstraintWithMessage(context, "Invalid field 'recordsIncluded' values");
        return false;
      } else {
        return true;
      }
    } else {
      addConstraintWithMessage(context, "Mandatory field 'recordsIncluded' should be not empty");
      return false;
    }
  }

  private void addConstraintWithMessage(ConstraintValidatorContext context, String message) {
    context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
  }

  public RecordsIncludedValidator getConstraintAnnotation() {
    return constraintAnnotation;
  }
}
