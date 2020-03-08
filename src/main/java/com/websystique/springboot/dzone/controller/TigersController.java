package com.websystique.springboot.dzone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.dzone.model.Dog;
import com.websystique.springboot.dzone.model.Tiger;
import com.websystique.springboot.dzone.service.DogsNotFoundException;
import com.websystique.springboot.dzone.service.DogsService;
import com.websystique.springboot.dzone.service.DogsServiceException;
import com.websystique.springboot.dzone.service.TigersNotFoundException;
import com.websystique.springboot.dzone.service.TigersService;
import com.websystique.springboot.dzone.service.TigersServiceException;

@RestController
@RequestMapping("/tigers")
public class TigersController {
	 @Autowired 
	    private  TigersService service;
//	    @GetMapping
//	    public ResponseEntity<List<Dog>> getDogs() {
//	        List<Dog> dogs;
//	        try {
//	            dogs = service.getDogs();
//	        } catch (DogsServiceException ex) {
//	            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
//	        } catch (DogsNotFoundException ex) {
//	            return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
//	        }
//	        return new ResponseEntity<>(dogs, HttpStatus.OK);
//	    }
	    
	    
	    //https://www.baeldung.com/exception-handling-for-rest-with-spring
	    @GetMapping
	    public ResponseEntity<List<Tiger>> getTigers() {
	        List<Tiger> tigers;
	       
	        tigers = service.getTigers();
	       
	        return new ResponseEntity<>(tigers, HttpStatus.OK);
	    }
	    @ExceptionHandler({ TigersServiceException.class })
	    public ResponseEntity handleException1() {
	       System.out.println("handleException1 :TigersServiceException");
	       return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
	       
	    }
	    
	    @ExceptionHandler({ TigersNotFoundException.class })
	    public ResponseEntity handleException2() {
	    	  System.out.println("handleException1 properly:TigersNotFoundException");
	    	  return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
	    }
}
