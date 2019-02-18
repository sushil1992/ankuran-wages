package com.ankuran.wages.exception.handler;

import com.ankuran.wages.exception.ApiErrorResponse;
import com.ankuran.wages.exception.base.InvalidRequestException;
import com.ankuran.wages.exception.base.WagesException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @author Sushil Mittal.
 * @Created At 18/02/19.
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleException(Exception ex) {
        WagesException reviewException = new WagesException(ex.getMessage());
//        LogUtil.getErrorLogger().error("Error ", reviewException);
        return new ResponseEntity<>(ApiErrorResponse.createError(reviewException), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidRequestException.class)
    protected ResponseEntity<Object> handleInvalidInputException(InvalidRequestException ex) {
        WagesException reviewException = new WagesException(ex.getMessage());
//        LogUtil.getErrorLogger().error("Error ", reviewException);
        return new ResponseEntity<>(ApiErrorResponse.createError(ex), HttpStatus.BAD_REQUEST);
    }
}
