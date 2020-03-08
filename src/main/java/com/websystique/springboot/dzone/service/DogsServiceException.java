package com.websystique.springboot.dzone.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Service down................")
//public class DogsServiceException extends Exception {
public class DogsServiceException extends RuntimeException {

	public DogsServiceException(String msg){
		super(msg);
	}
}
