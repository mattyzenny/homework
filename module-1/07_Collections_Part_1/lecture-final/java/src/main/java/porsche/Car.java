package porsche;

import java.util.ArrayList;
import java.util.List;

public class Car {

	//class variables
	private String color = "red";
	
	public boolean isStarted() {
		return isStarted;
	}
	private String model;
	private int year;
	private boolean isStarted;
	private boolean isDriving;
	private List <Tire> tires = new ArrayList<Tire>();
	
//	private Engine  engine = new Engine();
	
	
	
	public boolean startCar() {
		isStarted = true;
		driveCar();
	return isStarted;
	}
	public void driveCar() {
		System.out.print("Vroom Vroom");
	
}
	
	

	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Tire> getTires() {
		return tires;
	}
	public void setTires(List<Tire> tires) {
		this.tires = tires;
	}
	
	
	
	
}

