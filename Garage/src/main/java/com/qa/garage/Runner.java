package com.qa.garage;

public class Runner {
	
	private static Car car;
	private static Plane plane;
	private static Motorcycle motorcycle;
	
	public static void main(String[] args) {
		
	
		
		car = new Car("BMW",2015,4,9,250);
		plane = new Plane("CGI",2018,3, 3.2, 100);
		motorcycle = new Motorcycle("Yamaha",2017,2,4.3,200);
		
		car.getBrand();
		plane.getBrand();
		motorcycle.getBrand();
		
		System.out.println("------------------");
		System.out.println(car);
		System.out.println("------------------");
		System.out.println(plane);
		System.out.println("------------------");
		System.out.println(motorcycle);
		
		
		
		
		
		
			
			
		
		
		
		
	}

}
