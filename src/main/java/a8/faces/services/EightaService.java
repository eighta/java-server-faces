package a8.faces.services;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import a8.faces.model.Car;

public class EightaService {

	public List<Car> getCars(){
		
		List<Car> carList = new ArrayList<>();
		carList.add(new Car(10, Year.of(2017),"Suzuki","Black"));
		carList.add(new Car(11, Year.of(2017),"Chevrolet","Red"));
		carList.add(new Car(12, Year.of(2017),"Renault","White"));
		
		return carList;
	}
}
