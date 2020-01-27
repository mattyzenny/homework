package com.techelevator;

public class Employee {
//INSTANCE VARIABLES//
	private String firstName;
	private String lastName;
	private String fullName;
	private String department;
	private double annualSalary;
	private int employeeId;
	
	//CONSTRUCTOR//
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName= firstName;
		this.lastName= lastName;
		this.annualSalary = salary;
	}
	
	//METHOD//
	
	public void raiseSalary(double percent) {
		if (percent > 0) {
			annualSalary = annualSalary + ((percent * annualSalary) / 100);
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//GETTERS/SETTERS//
	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getFirstName() {
		return firstName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFullName() {
		
		return lastName + ", " + firstName;
	}


	public double getAnnualSalary() {
		
		return annualSalary;
	}

	
	
	
	
	
	
	
	
	
	
	
}
