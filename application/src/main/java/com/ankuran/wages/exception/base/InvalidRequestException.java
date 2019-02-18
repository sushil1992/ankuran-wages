package com.ankuran.wages.exception.base;

import com.ankuran.wages.enums.ErrorCode;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
public class InvalidRequestException extends WagesException {
    public InvalidRequestException(String errorMessage, ErrorCode errorCode, Exception e) {
        super(errorMessage, errorCode, e);
    }

    public InvalidRequestException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage, errorCode);
    }

    public InvalidRequestException(String errorMessage) {
        super(errorMessage);
    }
}
