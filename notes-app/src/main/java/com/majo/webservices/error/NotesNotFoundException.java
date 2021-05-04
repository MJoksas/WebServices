package com.majo.webservices.error;

public class NotesNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NotesNotFoundException(Long id) {
	    super("Could not find notes " + id);
	  }
}