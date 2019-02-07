package com.equifax.syntheticid.resource;

/**
 * Created by brian.aabel on 2/6/2019.
 */
public class Alert {


    private String correlationId;
    private String statusMessage;
    private Integer statusCode;
    private AlertFlags flags;

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public AlertFlags getFlags() {
        return flags;
    }

    public void setFlags(AlertFlags flags) {
        this.flags = flags;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }
}
