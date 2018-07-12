package com.example.validation.poc.model;

import com.example.validation.poc.model.constraint.RecordsIncludedValidator;
import com.example.validation.poc.model.constraint.RendererValidator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@Data
@NotBlank
public class AlertType  {

    @NotBlank(message = "Mandatory field 'consumerApplicationId' is missing")
    private String consumerApplicationId;

    @NotBlank(message = "Mandatory field 'alertTypeId' is missing")
    private String alertTypeId;

    private String alertTypeName;

    @RecordsIncludedValidator(message = "test")
    private List<String> recordsIncluded;

    private DataProviders dataProviders;

    @Max(value = 10, message = "The number of records per email should be less than 10")
    private Integer maxRecordsPerEmail;

    private Integer maxEmailsPerAlertInstance;

    @RendererValidator(message = "All renderers should contain renderer id")
    private List<Renderer> renderers;

    private String defaultRendererId;


}
