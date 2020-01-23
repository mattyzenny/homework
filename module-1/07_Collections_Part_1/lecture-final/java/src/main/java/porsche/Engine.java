package porsche;

public class Engine extends Car {
	
	
	public Engine (int numberOfCylinders) {
		this.numberOfCylinders = 8;
	}
	
	private int numberOfCylinders = 0;
//	private String type = null;
//	
//	
//	
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}

	public int getNumberofCylinders() {
		return numberOfCylinders;
	}
	
	public void setNumberOfCylinders(int num) {
		this.numberOfCylinders = num;
		
	}
	
	
}
