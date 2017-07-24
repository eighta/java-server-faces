package a8.faces.controllers;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import a8.faces.model.Car;

@ManagedBean(name = "helloManagedBean", eager = true)
public class HelloManagedBean {

	private List<Car> cars; 
	
	@PostConstruct
	public void postConstruct(){
		cars = new ArrayList<>();
		cars.add(new Car(1,Year.of(2017),"Renault","Black"));
		cars.add(new Car(2,Year.of(2017),"Chevrolet","White"));
		
	}
	
	public String getMessage() {
		
		System.out.println("=FacesContext=");
		Package p = FacesContext.class.getPackage();
		System.out.println(">>Specification");
		System.out.println(p.getSpecificationTitle());
		System.out.println(p.getSpecificationVersion());
		System.out.println(p.getSpecificationVendor());
		System.out.println(">>Implementation");
		System.out.println(p.getImplementationTitle()); 
		System.out.println(p.getImplementationVersion());
		System.out.println(p.getImplementationVendor());
		
	
		//returns the major version (2.1)
		//System.out.println(FacesContext.class.getPackage().getImplementationVersion());

		/*
		MOJARRA
		System.out.println("=using Package.getPackage(\"com.sun.faces\")");
		
		//returns the specification version (2.1)
		System.out.println(Package.getPackage("com.sun.faces").getSpecificationVersion());

		//returns the minor implementation version (2.1.x)
		System.out.println(Package.getPackage("com.sun.faces").getImplementationVersion());
		
		*/
		
	      return "Hello From ManagedBean! " + FacesContext.class.getPackage().getImplementationVersion();
	   }


	public List<Car> getCars() {
		return cars;
	}


	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
}
