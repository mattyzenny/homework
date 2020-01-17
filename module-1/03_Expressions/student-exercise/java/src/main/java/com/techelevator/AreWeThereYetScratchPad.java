package com.techelevator;

import java.util.Scanner;

public class AreWeThereYetScratchPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner in = new Scanner(System.in)){
			
			boolean there = false;
			
			while (!there) {
				System.out.println("Bart: Are we there yet? (Enter 'Y' or 'N')");
				
				String answer = in.nextLine();
				
				 if (answer.equals("Y") || (answer.equals("y"))) {
					 
				System.out.println("Yippie!!!");
				break;
			}
				 else {
						System.out.println("BOOO!!!!");

			}
			System.out.println("The value of answer: " + answer);
		}
		}
	}

			}
			
			
