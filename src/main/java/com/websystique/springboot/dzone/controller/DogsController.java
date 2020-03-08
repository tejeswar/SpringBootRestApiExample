package com.websystique.springboot.dzone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.websystique.springboot.dzone.model.Dog;
import com.websystique.springboot.dzone.service.DogsNotFoundException;
import com.websystique.springboot.dzone.service.DogsService;
import com.websystique.springboot.dzone.service.DogsServiceException;

//https://www.amitph.com/spring-rest-service-exception-handling/
//https://dzone.com/articles/spring-rest-service-exception-handling-1

@RestController
@RequestMapping("/dogs")


public class DogsController {
    @Autowired 
    private  DogsService service;
//    @GetMapping
//    public ResponseEntity<List<Dog>> getDogs() {
//        List<Dog> dogs;
//        try {
//            dogs = service.getDogs();
//        } catch (DogsServiceException ex) {
//            return new ResponseEntity<>(null, null, HttpStatus.INTERNAL_SERVER_ERROR);
//        } catch (DogsNotFoundException ex) {
//            return new ResponseEntity<>(null, null, HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(dogs, HttpStatus.OK);
//    }
    
    
    //https://www.baeldung.com/exception-handling-for-rest-with-spring
    @GetMapping(value = "/all")
    public ResponseEntity<List<Dog>> getDogs() {
        List<Dog> dogs;
       System.out.println("Control is coming...");
            dogs = service.getDogs();
       
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }
    
    @GetMapping(value = "/all/{id}")
    public ResponseEntity handleException1(@PathVariable int id) {
       System.out.println("dogs with id : "+id);
       
       
       if(id == 1) {
    	   throw new DogsServiceException("this is dogs service exception");
       }
       return new ResponseEntity<>("Hello", null, HttpStatus.OK);
       
    }
    
   
    @GetMapping(value = "/all1/{id}")
    public ResponseEntity handleException2(@PathVariable int id) {
    	  System.out.println("hello my dog ::"+id);
    	  if(id==1) {
    		  throw new DogsNotFoundException("Dog could not be found...");
    		  //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	  }
    	  return new ResponseEntity<>("Hi", null, HttpStatus.OK);
    }
    
     @ExceptionHandler({ DogsNotFoundException.class })
    public String handleException3(Exception e) {
  	  System.out.println("handleException1 properly:DogsNotFoundException ::"+e.getMessage());
  	  //return new ResponseEntity<>("Hi", null, HttpStatus.NOT_FOUND);
  	  return "DOGS NOT FOUND EXCEPTIONNN...";
  }
    
    @ExceptionHandler({ DogsServiceException.class })
   
    public String handleException4() {
       System.out.println("dogs with id : ");
       System.out.println("handleException4 properly:DogsServiceException ::");
       //return new ResponseEntity<>("Hello", null, HttpStatus.INTERNAL_SERVER_ERROR);
       return "SERVICE ERROR HAPEPND";
       
    }
}
