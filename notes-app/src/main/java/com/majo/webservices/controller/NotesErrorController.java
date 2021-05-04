package com.majo.webservices.controller;

import java.util.Date;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import com.majo.webservices.error.ErrorMessage;
import com.majo.webservices.error.GenericErrorMessageException;
import com.majo.webservices.error.NotesNotFoundException;

@Controller
public class NotesErrorController implements ErrorController  {
	
	@Autowired
    private ErrorAttributes errorAttributes;

	@RequestMapping("/error")
	public void handleError(HttpServletRequest request, Exception ex) {
	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
	    Integer statusCode = Integer.valueOf(status.toString());
	    throw new GenericErrorMessageException(statusCode);
	}
	
    @Override
    public String getErrorPath() {
        return null;
    }
}