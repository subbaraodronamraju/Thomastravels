package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
	Travel t=new Travel();
	Driver d=new Driver(63,"CAR","subbarao",2333.3);
	Driver d1=new Driver(363,"bike","subbu",23.3);
	Driver d2=new Driver(233,"cycle","subash",33.3);
	Driver d3=new Driver(23,"lorry","subramanyam",233.3);
	ArrayList<Driver> arr=new ArrayList<>();
	arr.add(d);
	arr.add(d1);
	arr.add(d2);
	arr.add(d3);
	
    boolean answer =t.iscardriver(d);
    String answer2=t.retrivebydriverid(arr, 23);
    int answer3=t.retrivecoutofdriver(arr, "CAR");
    ArrayList<Driver> answer4=t.retrivedriver(arr, "CAR");
    for(Driver main : answer4) {
    	System.out.println("answer for the question 4   "   +    main.getDrivername());
    }
	Driver maximumdistance=t.retrivemaximumdistancetraveldriver(arr);
	
	
	
	System.out.println(answer);
	System.out.println(answer2);
	System.out.println("my answer "+answer3);
System.out.println("maximum distance travelled by  "+ maximumdistance.getDrivername());
	}
	

}
