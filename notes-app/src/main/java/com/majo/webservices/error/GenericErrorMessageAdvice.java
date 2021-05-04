package com.majo.webservices.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GenericErrorMessageAdvice {
	
	@ResponseBody
	@ExceptionHandler(GenericErrorMessageException.class)
	ErrorMessage noteNotFoundHandler(GenericErrorMessageException ex) {
		return new ErrorMessage(ex.getStatus(), "Internal Server Error", ex.getMessage(), ex.getStackTrace());
	}
    
}