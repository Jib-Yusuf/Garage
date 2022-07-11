package com.qa.garage;

import java.util.ArrayList;

public class Garagetest {
	public ArrayList<Vehicle> garageList;
	
	// Adding vehicles to garage
	public void addVehicle(Vehicle vehicle) {
		garageList.add(vehicle);
	}
	
	// Removing vehicles from garage 
	public void removeVehicle(Vehicle vehicle) {
		garageList.remove(vehicle);
	}
	
	// Updating vehicles from garage
	public void updateVehicle(int index, Vehicle vehicle) {
		garageList.set(index, vehicle);
	}
	
	// Reading vehicle
	public Vehicle getVehicle(int index) {
		return garageList.get(index);
	}
	
	// Removing all vehicles from garage
	public void clearGaragetest() {
		garageList.clear();
	}
	// Running vehicle.fixVehicle() custom method
		public void fixVehicle(int index) {
			getVehicle(index).repairVehicle(); }
	

	public Garagetest() {
		super();
		this.garageList = new ArrayList<Vehicle>(); }
	
	
	
	public static void main(String[] args) {
		
		
		
	
	
		ArrayList<Car> car = new ArrayList<Car>();
		Car car1 = new Car("BMW",2015,4,9,250);
		car.add(car1);
		Car car2 = new Car("KIA",2014,4,6,320);
		car.add(car2);
		Car car3 = new Car("Honda", 2022,4,7,440);
		car.add(car3);
		
		ArrayList<Plane> plane = new ArrayList<Plane>();
		Plane plane1 = new Plane("CGI",2018,3, 3.2, 100);
		plane.add(plane1);
		Plane plane2 = new Plane("UMI",2016,3,10,360);
		plane.add(plane2);
		Plane plane3 = new Plane("ROYCE", 2021,3,78,140);
		plane.add(plane3);
		
		ArrayList<Motorcycle> motorcycle = new ArrayList<Motorcycle>();
		Motorcycle motor1 = new Motorcycle("Yamaha",2017,2,4.3,200);
		motorcycle.add(motor1);
		Motorcycle motor2 = new Motorcycle("BMW",2016,2,3.2,140);
		motorcycle.add(motor2);
		Motorcycle motor3 = new Motorcycle("BEOIILE", 2021,2,4.5,740);
		motorcycle.add(motor3);
		
	
		
		
		
		for(int i = 0; i < car.size(); i++){
			System.out.println(car.get(i));
			
			for(int i1 = 0; i1 < plane.size(); i1++){
				System.out.println(plane.get(i1));
				
				for(int i2 = 0; i2 < motorcycle.size(); i2++){
					System.out.println(motorcycle.get(i2));
				
				System.out.println("------------------");
				System.out.println(car);
				System.out.println("------------------");
				System.out.println(plane);
				System.out.println("------------------");
				System.out.println(motorcycle);  }
			
				
				
				
				
				
	
			
		} }
		
		
		
	} 
	  } 







	
	


