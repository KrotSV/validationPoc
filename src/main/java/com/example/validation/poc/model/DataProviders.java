package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DataProviders  {

    private String hostName;
    private String port;
    private String scriptEngine;
    private DataProvider recordsProvider;
    private List<DataProvider> additionalFieldsProviders;
    private String recordMergeScript;
    private String recordMergeScriptUrl;

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public DataProviders withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public DataProviders withPort(String port) {
        this.port = port;
        return this;
    }

    public String getScriptEngine() {
        return scriptEngine;
    }

    public void setScriptEngine(String scriptEngine) {
        this.scriptEngine = scriptEngine;
    }

    public DataProviders withScriptEngine(String scriptEngine) {
        this.scriptEngine = scriptEngine;
        return this;
    }

    public DataProvider getRecordsProvider() {
        return recordsProvider;
    }

    public void setRecordsProvider(DataProvider recordsProvider) {
        this.recordsProvider = recordsProvider;
    }

    public DataProviders withRecordsProvider(DataProvider recordsProvider) {
        this.recordsProvider = recordsProvider;
        return this;
    }

    public List<DataProvider> getAdditionalFieldsProviders() {
        return additionalFieldsProviders;
    }

    public void setAdditionalFieldsProviders(List<DataProvider> additionalFieldsProviders) {
        this.additionalFieldsProviders = additionalFieldsProviders;
    }

    public DataProviders withAdditionalFieldsProviders(List<DataProvider> additionalFieldsProviders) {
        this.additionalFieldsProviders = additionalFieldsProviders;
        return this;
    }

    public String getRecordMergeScript() {
        return recordMergeScript;
    }

    public void setRecordMergeScript(String recordMergeScript) {
        this.recordMergeScript = recordMergeScript;
    }

    public DataProviders withRecordMergeScript(String recordMergeScript) {
        this.recordMergeScript = recordMergeScript;
        return this;
    }

    public String getRecordMergeScriptUrl() {
        return recordMergeScriptUrl;
    }

    public void setRecordMergeScriptUrl(String recordMergeScriptUrl) {
        this.recordMergeScriptUrl = recordMergeScriptUrl;
    }

    public DataProviders withRecordMergeScriptUrl(String recordMergeScriptUrl) {
        this.recordMergeScriptUrl = recordMergeScriptUrl;
        return this;
    }

    
}
