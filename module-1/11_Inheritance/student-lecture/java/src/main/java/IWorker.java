
public interface IWorker {

	
	//Attribute Name//
	public String getFirstName();
	public String getLastName();
	
	
	
	
	//method//
	public double caculateWeeklyPay(int hoursWorked);
	
	
	
	
	
	
}



//****New Class***//
//SalaryWorker//


//*****CONSTRUCTOR***//
//SalaryWorker(String firstName, String lastName, double annualSalary) {
//}


//***IMPLIMENT IWorker//
//String getFirstName();
//String getLastName();
//private double annualSalary();

//*****New Class*****//
//HourlyWorker//

//*****CONSTRUCTOR*****//
//HourlyWorker(String firstName, String lastName, double hourlyRate) {
//}


//****IMPLIMENT IWORKER//
//getFirstName();
//getLastName();
//private double annualSalary();





//***Volunteer Worker***//






















//PROGRAM-APP//
//Sample data//
//List<IWorker> listOfWork = new ArrayList {
//for (int n : IWorker) {
//

//}
//put total Hours and total Pay outside of loop, put employee/hours worked/pay inside loop//
/////CODE for lining things up//////
//in lecture code --> in BankOfSteve --> System.out.println(String.format("%-10s | %-10s | %-12s | %-5s, "IWorker.get(FIRSTNAME)", "LASTNAME", "SALARY", "HOURS WORKED"));

//POSTAGE CALCULATOR//
//IDeliveryDriver// - calculateShipping();.......create type of IDelivery (first/second/third each individual classes)(ground/business/nextday all individual class)
//
