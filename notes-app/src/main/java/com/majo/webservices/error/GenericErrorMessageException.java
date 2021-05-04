package com.majo.webservices.error;

import lombok.Getter;

public class GenericErrorMessageException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	@Getter private Integer status;

	public GenericErrorMessageException(Integer status) {
		this.status = status;
	}
	
}