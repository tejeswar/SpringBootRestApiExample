package com.websystique.springboot.dzone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;


import com.websystique.springboot.dzone.service.DogsNotFoundException;
import com.websystique.springboot.dzone.service.DogsServiceException;

@Controller
public class ExceptionHandlingController {
/*
	 @ExceptionHandler({ DogsServiceException.class })
	    public ResponseEntity handleException10() {
	       System.out.println("ExceptionHandlingController::::handleException10 properly:DogsServiceException");
	       return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
	       
	    }
	    
	    @ExceptionHandler({ DogsNotFoundException.class })
	    public ResponseEntity handleException21() {
	    	  System.out.println("ExceptionHandlingController:::::handleException21 properly:DogsNotFoundException");
	    	  return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
	    }
*/	
}
