package com.websystique.springboot.dzone.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="No Tiger found....................")
public class TigersNotFoundException extends RuntimeException {
	//public class DogsNotFoundException extends Exception {

	TigersNotFoundException(String errMsg){
			super(errMsg);
		}
	}
