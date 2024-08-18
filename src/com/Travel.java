package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Travel {

public boolean iscardriver(Driver driver) {
	String drivercategy=driver.getCategory(); 
	String ourdriver ="car";
	if (drivercategy.equalsIgnoreCase(ourdriver)) {
	return true;
	}else {
		return false;
		
	}
}
	
	
	
public String retrivebydriverid(ArrayList<Driver> ad,int driverid) {
	for (Driver driver : ad) {
		if(driver.getDriverid() == driverid) {
			return "name of the driver is"+ driver.getDrivername() +"id of the driver name"+driver.getDriverid();
		}

		
	}
	return null;
}
	
	


public int  retrivecoutofdriver(ArrayList<Driver> driversdata,String searchCategory)  {
	
	int count=0;
	for(Driver searchCat:driversdata) {
		if(searchCat.getCategory().equals(searchCategory)) {
			count++;
		}
	}
	
	return count;
}

public  ArrayList<Driver>   retrivedriver(ArrayList<Driver> cd,String nam ){
	ArrayList<Driver> selecteddrivers=new ArrayList<>();
	for(Driver name : cd) {
	if(name.getCategory().equals(nam)) {
		
		selecteddrivers.add(name);
		
		
		
	}
	}
	return selecteddrivers;
	
	
}


public Driver retrivemaximumdistancetraveldriver(ArrayList<Driver> dirverdistance) {
	Driver maximumdistance=dirverdistance.get(0);
	for(Driver totaldistance : dirverdistance) {
		if(totaldistance.getTotaldistance() > maximumdistance.getTotaldistance() ){
			maximumdistance=totaldistance;

			
		}
		
	}
	return maximumdistance;
	
	
	
}




}


