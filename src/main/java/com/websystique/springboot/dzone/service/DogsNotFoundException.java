package com.websystique.springboot.dzone.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No Dog found....................")
public class DogsNotFoundException extends RuntimeException {
//public class DogsNotFoundException extends Exception {

	public DogsNotFoundException(String errMsg){
		super(errMsg);
	}
}
