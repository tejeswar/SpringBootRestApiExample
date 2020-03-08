package com.websystique.springboot.dzone.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.websystique.springboot.dzone.model.Dog;

@Service
public class CatsService {
	
	private static final AtomicLong counter = new AtomicLong();

private static List<Dog> dogs;
	
	static{
		dogs= populateDummyDogs();
	}

	public List<Dog> getDogs() throws DogsNotFoundException, DogsServiceException {
		
		int value  = (int) ((Math.random())*10);
		System.out.println(value+"=============================");
		if(value<3)
	    throw new DogsNotFoundException("No cats Found Here..");
		else 
			throw new DogsServiceException("sql connection problem....");
	}

	public void enquiryAboutDog() throws DogsServiceException {
		
		try {
		   System.out.println("Code will throw sql exception...");
		   throw new SQLException("sql connection problem....");
		} catch (SQLException sqle) {
		    throw new DogsServiceException(sqle.getMessage());
		}
	}
	
	private static List<Dog> populateDummyDogs() {
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog(counter.incrementAndGet(),"Sam",30));
		dogs.add(new Dog(counter.incrementAndGet(),"Tom",40));
		dogs.add(new Dog(counter.incrementAndGet(),"Jerome",45));
		dogs.add(new Dog(counter.incrementAndGet(),"Silvia",50));
		return dogs;
	}
	
	
	
}
