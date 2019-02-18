package com.ankuran.wages.exception.base;

import com.ankuran.wages.enums.ErrorCode;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
public class WagesException extends RuntimeException {
    private ErrorCode errorCode;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public WagesException(String errorMessage, ErrorCode errorCode) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public WagesException(String errorMessage, ErrorCode errorCode, Exception e) {
        super(errorMessage, e);
        this.errorCode = errorCode;
    }

    public WagesException(String errorMessage) {
        super(errorMessage);
    }
}
