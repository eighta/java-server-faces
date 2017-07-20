package a8.faces.controllers;

import java.time.Year;
import java.util.List;

import javax.faces.bean.ManagedBean;

import a8.faces.model.Car;
import a8.faces.model.CustomField;
import a8.faces.services.EightaService;

@ManagedBean(name = "prime")
public class PrimeController {

	private CustomField custom;
	private Integer numero;
	private Year year;
	
	public List<Car> getCars(){
		System.out.println("PrimeController.getCars()...");
		return new EightaService().getCars();
	}

	public Year getYear() {
		return year;
	}

	public void setYear(Year year) {
		this.year = year;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public CustomField getCustom() {
		return custom;
	}

	public void setCustom(CustomField custom) {
		this.custom = custom;
	}
	
	
}
