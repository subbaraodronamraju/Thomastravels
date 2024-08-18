package com;


import java.util.ArrayList;

public class Driver {

  
private String category;
private int driverid;
private String drivername;
private double totaldistance;

   
  
  

public Driver() {
}
public Driver(int driverid,String category,String drivername,double totaldistance) {
this.category =category;
this.driverid=driverid;
this.drivername=drivername;
this.totaldistance=totaldistance;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getDriverid() {
	return driverid;
}
public void setDriverid(int driverid) {
	this.driverid = driverid;
}
public String getDrivername() {
	return drivername;
}
public void setDrivername(String drivername) {
	this.drivername = drivername;
}
public double getTotaldistance() {
	return totaldistance;
}
public void setTotaldistance(double totaldistance) {
	this.totaldistance = totaldistance;
}
}

