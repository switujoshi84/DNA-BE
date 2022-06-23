package com.tj.dna.response;

import static com.tj.dna.response.ExceptionCodes.CREATED;
import static com.tj.dna.response.ExceptionCodes.SUCCESS;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModuleResponse {

    private String statusCode;
    private String statusMessage;
    private String statusMessageDetail;
    private Object dist;
    private Object pagination;

    public ModuleResponse(String statusCode, String statusMessage, Object dist) {
        this.dist = dist;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public ModuleResponse(String statusCode, String statusMessage, Object dist, Object pagination) {
        this.dist = dist;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.pagination = pagination;
    }

    public ModuleResponse(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }

    public ModuleResponse(String statusCode, String statusMessage, String statusMessageDetail) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.statusMessageDetail = statusMessageDetail;
    }

    public static ModuleResponse generateCreateResponse() {
        return new ModuleResponse(String.valueOf(HttpStatus.CREATED.value()), CREATED.getStatusMessage());
    }

    public static ModuleResponse generateCreateResponse(Object dist) {
        return new ModuleResponse(String.valueOf(HttpStatus.CREATED.value()), CREATED.getStatusMessage(), dist);
    }

    public static ModuleResponse generateSuccessResponse() {
        return new ModuleResponse(String.valueOf(HttpStatus.OK.value()), SUCCESS.getStatusMessage());
    }

    public static ModuleResponse generateCustomResponse(HttpStatus status, String message) {
        return new ModuleResponse(String.valueOf(status.value()), message);
    }

    public static ModuleResponse generateSuccessResponse(Object dist) {
        return new ModuleResponse(String.valueOf(HttpStatus.OK.value()), SUCCESS.getStatusMessage(), dist);
    }

    public static ModuleResponse generateSuccessResponse(Object dist, Object pagination) {
        return new ModuleResponse(String.valueOf(HttpStatus.OK.value()), SUCCESS.getStatusMessage(), dist, pagination);
    }
}