package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResponseProcessing  {

    private String responseTransformationScript;
    private String responseTransformationScriptUrl;
    private String pathToRecordCount;
    private String pathToRecordList;
    private String recordTransformationScript;
    private String recordTransformationScriptUrl;
    private String pathToDocId;

    public String getResponseTransformationScript() {
        return responseTransformationScript;
    }

    public void setResponseTransformationScript(String responseTransformationScript) {
        this.responseTransformationScript = responseTransformationScript;
    }

    public ResponseProcessing withResponseTransformationScript(String responseTransformationScript) {
        this.responseTransformationScript = responseTransformationScript;
        return this;
    }

    public String getResponseTransformationScriptUrl() {
        return responseTransformationScriptUrl;
    }

    public void setResponseTransformationScriptUrl(String responseTransformationScriptUrl) {
        this.responseTransformationScriptUrl = responseTransformationScriptUrl;
    }

    public ResponseProcessing withResponseTransformationScriptUrl(String responseTransformationScriptUrl) {
        this.responseTransformationScriptUrl = responseTransformationScriptUrl;
        return this;
    }

    public String getPathToRecordCount() {
        return pathToRecordCount;
    }

    public void setPathToRecordCount(String pathToRecordCount) {
        this.pathToRecordCount = pathToRecordCount;
    }

    public ResponseProcessing withPathToRecordCount(String pathToRecordCount) {
        this.pathToRecordCount = pathToRecordCount;
        return this;
    }

    public String getPathToRecordList() {
        return pathToRecordList;
    }

    public void setPathToRecordList(String pathToRecordList) {
        this.pathToRecordList = pathToRecordList;
    }

    public ResponseProcessing withPathToRecordList(String pathToRecordList) {
        this.pathToRecordList = pathToRecordList;
        return this;
    }

    public String getRecordTransformationScript() {
        return recordTransformationScript;
    }

    public void setRecordTransformationScript(String recordTransformationScript) {
        this.recordTransformationScript = recordTransformationScript;
    }

    public ResponseProcessing withRecordTransformationScript(String recordTransformationScript) {
        this.recordTransformationScript = recordTransformationScript;
        return this;
    }

    public String getRecordTransformationScriptUrl() {
        return recordTransformationScriptUrl;
    }

    public void setRecordTransformationScriptUrl(String recordTransformationScriptUrl) {
        this.recordTransformationScriptUrl = recordTransformationScriptUrl;
    }

    public ResponseProcessing withRecordTransformationScriptUrl(String recordTransformationScriptUrl) {
        this.recordTransformationScriptUrl = recordTransformationScriptUrl;
        return this;
    }

    public String getPathToDocId() {
        return pathToDocId;
    }

    public void setPathToDocId(String pathToDocId) {
        this.pathToDocId = pathToDocId;
    }

    public ResponseProcessing withPathToDocId(String pathToDocId) {
        this.pathToDocId = pathToDocId;
        return this;
    }

    
}
