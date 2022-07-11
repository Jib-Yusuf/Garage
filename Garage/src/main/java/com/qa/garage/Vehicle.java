package com.qa.garage;

public class Vehicle {
	
	
	private String brand;
	private int year;
	private int tyres;
	private double fuel;
	private boolean damage;
	
	public void repairVehicle() {

        if (this.damage == true ) {

            System.out.println("Vechile needs to be repaired");

        }else {

            System.out.println("Repair not needed");

        }

    }
	
	public Vehicle(String brand, int year, int tyres, double fuel, boolean damage){
		setBrand(brand);
		setYear(year);
		setTyres(tyres);
		setFuel(fuel);
		setDamaged(damage);
		
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTyres() {
		return tyres;
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public double getFuel() {
		return fuel;
	}
	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	public boolean isDamage() {
		return damage;
	}
	public void setDamaged(boolean damage) {
		this.damage = damage;
	}
	
	
	
		
	
	
	

}
