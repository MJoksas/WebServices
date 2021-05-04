package com.majo.webservices.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NotesNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(NotesNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	ErrorMessage noteNotFoundHandler(NotesNotFoundException ex) {
		return new ErrorMessage(HttpStatus.NOT_FOUND.value(), "Internal Server Error", ex.getMessage(), null);
	}

	@ExceptionHandler(Throwable.class)
	public String catchOtherExceptions() {
		return "/error";
	}

}
