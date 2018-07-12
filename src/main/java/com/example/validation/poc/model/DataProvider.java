package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class DataProvider  {

    private String hostName;
    private String port;
    private HttpRequestInfo httpRequest;
    private ResponseProcessing responseProcessing;
    private Integer pageSize;
    
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public DataProvider withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public DataProvider withPort(String port) {
        this.port = port;
        return this;
    }

    public HttpRequestInfo getHttpRequest() {
        return httpRequest;
    }

    public void setHttpRequest(HttpRequestInfo httpRequest) {
        this.httpRequest = httpRequest;
    }

    public DataProvider withHttpRequest(HttpRequestInfo httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }

    public ResponseProcessing getResponseProcessing() {
        return responseProcessing;
    }

    public void setResponseProcessing(ResponseProcessing responseProcessing) {
        this.responseProcessing = responseProcessing;
    }

    public DataProvider withResponseProcessing(ResponseProcessing responseProcessing) {
        this.responseProcessing = responseProcessing;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public DataProvider withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    
}
