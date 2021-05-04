package com.majo.webservices.error;

import java.util.Date;

public class ErrorMessage {
	public Integer status;
    public String error;
    public String message;
    public String timeStamp;
    public StackTraceElement[] trace;
    
	public ErrorMessage(Integer status, String error, String message, StackTraceElement[] trace) {
		super();
		this.status = status;
		this.error = error;
		this.message = message;
		this.timeStamp = (new Date()).toString();
		this.trace = trace;
	}
    
}
