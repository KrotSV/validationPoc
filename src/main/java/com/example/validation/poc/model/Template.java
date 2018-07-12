package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Template  {


    private String templateEngine;
    private List<String> templateHelpers;
    private String subjectTemplateText;
    private String subjectTemplateTextUrl;
    private String bodyTemplateText;
    private String bodyTemplateTextUrl;
    
    
    public String getTemplateEngine() {
        return templateEngine;
    }


    public void setTemplateEngine(String templateEngine) {
        this.templateEngine = templateEngine;
    }


    public Template withTemplateEngine(String templateEngine) {
        this.templateEngine = templateEngine;
        return this;
    }

    public List<String> getTemplateHelpers() {
        return templateHelpers;
    }


    public void setTemplateHelpers(List<String> templateHelpers) {
        this.templateHelpers = templateHelpers;
    }


    public Template withTemplateHelpers(List<String> templateHelpers) {
        this.templateHelpers = templateHelpers;
        return this;
    }


    public String getSubjectTemplateText() {
        return subjectTemplateText;
    }


    public void setSubjectTemplateText(String subjectTemplateText) {
        this.subjectTemplateText = subjectTemplateText;
    }


    public Template withSubjectTemplateText(String subjectTemplateText) {
        this.subjectTemplateText = subjectTemplateText;
        return this;
    }


    public String getSubjectTemplateTextUrl() {
        return subjectTemplateTextUrl;
    }

    public void setSubjectTemplateTextUrl(String subjectTemplateTextUrl) {
        this.subjectTemplateTextUrl = subjectTemplateTextUrl;
    }

    public Template withSubjectTemplateTextUrl(String subjectTemplateTextUrl) {
        this.subjectTemplateTextUrl = subjectTemplateTextUrl;
        return this;
    }

    public String getBodyTemplateText() {
        return bodyTemplateText;
    }


    public void setBodyTemplateText(String templateText) {
        this.bodyTemplateText = templateText;
    }

    public Template withBodyTemplateText(String templateText) {
        this.bodyTemplateText = templateText;
        return this;
    }

    public String getBodyTemplateTextUrl() {
        return bodyTemplateTextUrl;
    }

    public void setBodyTemplateTextUrl(String bodyTemplateTextUrl) {
        this.bodyTemplateTextUrl = bodyTemplateTextUrl;
    }

    public Template withBodyTemplateTextUrl(String bodyTemplateTextUrl) {
        this.bodyTemplateTextUrl = bodyTemplateTextUrl;
        return this;
    }

    
}
