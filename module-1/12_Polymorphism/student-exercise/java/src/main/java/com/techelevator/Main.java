package com.techelevator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		SPU spu = new SPU();
		FirstClass firstClass = new FirstClass();
		SecondClass secondClass = new SecondClass();
		ThirdClass thirdClass = new ThirdClass();
		FedEx fedEx = new FedEx();
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the weight of the package:");
		double weight = Double.parseDouble(input.nextLine());
		System.out.println("What is the distance it will be travelling in miles?");
		int distance = Integer.parseInt(input.nextLine());
		
		System.out.println("(P)ounds or (O)ounces?");
		String poundsOrOunces = input.nextLine();
		
		if(poundsOrOunces.equalsIgnoreCase("p")) {
			weight = weight * 16;
			firstClass.calculateRate(distance, weight);
			secondClass.calculateRate(distance, weight);
			thirdClass.calculateRate(distance, weight);
			fedEx.calculateRate(distance, weight);
			spu.calculateRate(distance, weight);
			
			System.out.println(String.format("%-20s  %-20s", "Delivery Method", "Cost"));
			System.out.println("==================================================");
			System.out.println("FirstClass:" + "           "+ firstClass.getRate());
			System.out.println("SecondClass:" + "           " + secondClass.getRate());
			System.out.println("ThirdClass:"+ "            " + thirdClass.getRate());
			System.out.println("FedEx:" + "                 " + fedEx.getRate());
			System.out.println("4Day GroundShipping" + "   " + spu.getRate());
			System.out.println("2Day Business" + "        " + spu.getRate());
			System.out.println("Next Day" + "             " + spu.getRate());
		}
		else if(poundsOrOunces.equalsIgnoreCase("o")) {
			weight = weight /16;
			firstClass.calculateRate(distance, weight);
			secondClass.calculateRate(distance, weight);
			thirdClass.calculateRate(distance, weight);
			fedEx.calculateRate(distance, weight);
			spu.calculateRate(distance, weight);
		System.out.println(String.format("%-20s  %-20s", "Delivery Method", "Cost"));
		System.out.println("==================================================");
		System.out.println("FirstClass:" + "           "+ firstClass.getRate());
		System.out.println("SecondClass:" + "           " + secondClass.getRate());
		System.out.println("ThirdClass:"+ "            " + thirdClass.getRate());
		System.out.println("FedEx:" + "                 " + fedEx.getRate());
		System.out.println("4Day GroundShipping" + "   " + spu.getRate());
		System.out.println("2Day Business" + "        " + spu.getRate());
		System.out.println("Next Day" + "            " + spu.getRate());

	}
	
	

	}
}