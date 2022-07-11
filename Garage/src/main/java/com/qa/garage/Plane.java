package com.qa.garage;

public class Plane extends Vehicle {
	
	private double planeSize;
	
	public Plane(){
		System.out.println("A new plane");
		
	}
	public Plane(String brand, int year,int tyres ,double fuel, double planeSize){
		super(brand, year, tyres, fuel);
		setPlaneSize(planeSize);
		
	}
public String toString() {
		
		String str = "Brand: " + super.getBrand();
		str+= "\nYear: " + super.getYear();
		str +="\nTyres: " + super.getTyres();
		str += "\nFuel: " + super.getFuel();
		str +="\nPlanesize: " + getPlaneSize();
		
		return str;
}

	public double getPlaneSize() {
		return planeSize;
	}

	public void setPlaneSize(double planeSize) {
		this.planeSize = planeSize;
	}
	public static void add(Plane p1) {
		// TODO Auto-generated method stub
		
	}

}
