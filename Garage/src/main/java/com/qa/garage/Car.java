package com.qa.garage;

public class Car extends Vehicle {
	
	 
	//Variable
	private double weight;
	
	//Method
	public Car(){
		System.out.println("A new car");
		
	///Constructor	
	}
	public Car(String brand, int year, int tyres, double fuel, double weight){
		super(brand, year, tyres, fuel);
		setWeight(weight);
	}
	
	public String toString() {
		
		
		String str = "Brand: " + super.getBrand();
		str+= "\nYear: " + super.getYear();
		str +="\nTyres: " + super.getTyres();
		str += "\nFuel: " + super.getFuel();
		str +="\nWeight: " + getWeight();
		
		return str;
	}
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	

} }
