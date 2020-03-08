package com.websystique.springboot.dzone.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Tiger Service down................")
public class TigersServiceException extends RuntimeException {

	public TigersServiceException(String msg){
		super(msg);
	}
}