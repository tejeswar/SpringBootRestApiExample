package com.websystique.springboot.dzone.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.websystique.springboot.dzone.model.Dog;
import com.websystique.springboot.dzone.model.Tiger;

@Service
public class TigersService {

private static final AtomicLong counter = new AtomicLong();
	
	private static List<Tiger> tigers;
	
	static{
		tigers= populateDummyTigers();
	}

	public List<Tiger> getTigers() throws TigersNotFoundException, TigersServiceException {
		
		int value  = (int) ((Math.random())*10);
		System.out.println(value+"=============================");
		if(value<6)
	    throw new TigersNotFoundException("No Tiger Found Here..");
		else 
			throw new TigersServiceException("TIGER sql connection problem....");
	}

//	public void enquiryAboutDog() throws DogsServiceException {
//		
//		try {
//		   System.out.println("TIGER    Code will throw sql exception...");
//		   throw new SQLException("TIGER connection problem....");
//		} catch (SQLException sqle) {
//		    throw new DogsServiceException(sqle.getMessage());
//		}
//	}
	
	private static List<Tiger> populateDummyTigers() {
		List<Tiger> tigers = new ArrayList<Tiger>();
		tigers.add(new Tiger(counter.incrementAndGet(),"Sam",30));
		tigers.add(new Tiger(counter.incrementAndGet(),"Tom",40));
		tigers.add(new Tiger(counter.incrementAndGet(),"Jerome",45));
		tigers.add(new Tiger(counter.incrementAndGet(),"Silvia",50));
		return tigers;
	}
}
