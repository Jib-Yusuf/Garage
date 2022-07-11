package com.qa.garage;

public class Motorcycle extends Vehicle  {
	
	private double pipeSize;
	
	public void startEngine() {
		System.out.println("VROOM VROOOM");
			
			}
	public Motorcycle(String brand, int year,int tyres ,double fuel, double pipeSize){
		super(brand, year, tyres, fuel);
		setPlaneSize(pipeSize);
		
	}
	public Motorcycle(String brand, int year, int tyres, double fuel){
		super(brand, year, tyres, fuel);
	}
	
	public String toString() {
		
		String str = "Brand: " + super.getBrand();
		str+= "\nYear: " + super.getYear();
		str +="\nTyres: " + super.getTyres();
		str += "\nFuel: " + super.getFuel();
		str +="\nPipesize: " + getPipeSize();
		
		return str;
	
	

} 

public double getPipeSize() {
	return pipeSize;
} 


public void setPlaneSize(double pipeSize) {
	this.pipeSize = pipeSize; }
}
