package com.example.validation.poc.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HttpRequestInfo  {

    private String hostName;
    private String port;
    private String url;
    private String body;
    private String method;
    private List<HttpHeader> headers;
    private String serviceId;
    
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public HttpRequestInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public HttpRequestInfo withPort(String port) {
        this.port = port;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HttpRequestInfo withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public HttpRequestInfo withBody(String body) {
        this.body = body;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public HttpRequestInfo withMethod(String method) {
        this.method = method;
        return this;
    }

    public List<HttpHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<HttpHeader> headers) {
        this.headers = headers;
    }

    public HttpRequestInfo withHeaders(List<HttpHeader> headers) {
        this.headers = headers;
        return this;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public HttpRequestInfo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    
}
