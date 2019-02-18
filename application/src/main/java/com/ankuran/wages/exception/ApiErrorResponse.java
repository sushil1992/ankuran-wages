package com.ankuran.wages.exception;

import com.ankuran.wages.exception.base.WagesException;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
public class ApiErrorResponse {

    private Integer errorCode;
    private String message;
    private String errorCodeDescription;

    public static ApiErrorResponse createError(WagesException customException) {
        ApiErrorResponse errorResponse = new ApiErrorResponse();
        if (customException.getErrorCode() != null) {
            errorResponse.setErrorCode(customException.getErrorCode().getCode());
            errorResponse.setErrorCodeDescription(customException.getErrorCode().getMessage());
        }
        errorResponse.setMessage(customException.getMessage());
        return errorResponse;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCodeDescription() {
        return errorCodeDescription;
    }

    public void setErrorCodeDescription(String errorCodeDescription) {
        this.errorCodeDescription = errorCodeDescription;
    }

}
