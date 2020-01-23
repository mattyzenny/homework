package porsche;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyCarApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car stevesCar = new Car ();
		
		stevesCar.setModel("2020");
		stevesCar.setModel("911");
		
//		stevesCar.setTires(tires);
		
		
		Engine engine = new Engine(8);
		engine.setNumberOfCylinders(8);
		
		System.out.println(engine.getNumberofCylinders());
		System.out.println(stevesCar.startCar());
		
		System.out.println(stevesCar.getColor() + "" + stevesCar.getModel() + "" + stevesCar.getYear());
		
//		stevesCar.driveCar();
		
		
		Car joesCar = new Car();
		joesCar.setModel(" Focus ");
		joesCar.setYear( 2019 );
		System.out.println(joesCar.getColor() + "" + joesCar.getModel() + "" +joesCar.getYear());
		
		
		List<Car> carList = new ArrayList<Car> ();
		carList.add(joesCar);
		carList.add(stevesCar);
		System.out.println(carList.size());
		
		
		Map<String, Car> myCarMap = new HashMap<String, Car> ();
		myCarMap.put("Steve", stevesCar);
		myCarMap.put("Joe", joesCar);
	}
	
}

