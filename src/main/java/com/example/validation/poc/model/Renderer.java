package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Renderer  {

    private String rendererId;

    
    public String getRendererId() {
        return rendererId;
    }

    public void setRendererId(String rendererId) {
        this.rendererId = rendererId;
    }

    public Renderer withRendererId(String rendererId) {
        this.rendererId = rendererId;
        return this;
    }


    
}
