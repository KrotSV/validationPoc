package com.example.validation.poc.model.validation;

import com.example.validation.poc.model.Renderer;
import com.example.validation.poc.model.constraint.RendererValidator;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import lombok.Data;
import org.apache.commons.collections4.CollectionUtils;

@Data
public class RendererValidatorImpl implements ConstraintValidator<RendererValidator, List<Renderer>> {

  private RendererValidator constraintAnnotation;

  @Override
  public void initialize(RendererValidator constraintAnnotation) {
    this.constraintAnnotation = constraintAnnotation;
  }

  @Override
  public boolean isValid(List<Renderer> renderers, ConstraintValidatorContext context) {
    context.disableDefaultConstraintViolation();
    if (CollectionUtils.isNotEmpty(renderers)) {
      return renderers.stream()
          .filter(renderer -> renderer.getRendererId().isEmpty())
          .collect(Collectors.toList())
          .isEmpty();
    } else {
      addConstraintWithMessage(context, "List of renderers should be not empty");
      return false;
    }
  }

  private void addConstraintWithMessage(ConstraintValidatorContext context, String message) {
    context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
  }
}
