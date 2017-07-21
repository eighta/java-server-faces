package a8.faces.model;

import java.time.Year;

public class Car {
	
	private Motor engine;
	
	private Integer id;
	private Year year;
	private String brand;
	private String color;
	
	public Car(Integer id, Year year, String brand, String color) {
		this.id=id; 
		this.year=year;
		this.brand=brand;
		this.color=color;
		
		this.engine = new Motor();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Motor getEngine() {
		return engine;
	}
	public void setEngine(Motor engine) {
		this.engine = engine;
	}
}
