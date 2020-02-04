package com.techelevator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//new file name alice.txt//



public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		
		try(Scanner userInput = new Scanner(System.in)){

			System.out.print("What is the file that should be searched? >>>");
			String myfilePath = userInput.nextLine();
			
			
			String searchAgain = "y";
			while(searchAgain.equalsIgnoreCase("y")) {
			
			
			System.out.print("What is the search word you are looking for? >>>");
			String searchItem = userInput.nextLine();
			
			System.out.print("Do you want the search to be case-sensative? (y/n)");
			String caseSensative = userInput.nextLine();
			
			boolean isCaseSensative = false;
			
			if (caseSensative.equalsIgnoreCase("y")) {
				isCaseSensative = true;
			}
		
			
		
//				String myFileLocation = "alice.txt";
//				File searchFile = new File(myFileLocation);
//				try(Scanner fileScanner = new Scanner(text)) {
					
					
				myfilePath = "alice.txt";
				File searchFile = new File(myfilePath);
				try(Scanner fileScanner = new Scanner(searchFile)) {
					
					int lineNumber = 0;
					
					while (fileScanner.hasNextLine()) {
						String searchedLine = fileScanner.nextLine();
						lineNumber++;
						if (isCaseSensative) {
							if(searchedLine.contains(searchItem)) {
								System.out.println("(" + lineNumber + ") " + searchedLine);
							}
							}
							else {
								if(searchedLine.toUpperCase().contains(searchItem.toUpperCase()) ) {
									System.out.println("(" +lineNumber + ") "+ searchedLine);
								}
							}
					}
					System.out.println("**************************************");
					System.out.println("Would you like to search again? (y/n)");
					searchAgain = userInput.nextLine();
					if(searchAgain.equalsIgnoreCase("n")) {
						System.out.println("Off with their heads!");
					}

//					
//						if(searchAgain.equalsIgnoreCase("n")) {
//							
//						}
//				}
//							System.out.println("Goodbye");
//						}

					}
				
	}
		}
	}
}



//System.out.println("**************************************");
//System.out.println("Would you like to search again? (y/n)");
//String searchAgain = userInput.nextLine();
//if(searchAgain.equalsIgnoreCase("y")) {
//	continue;
//}
//else {
//	break;	

			

		
		
		

		
//		WordSearch findWord = new WordSearch();
//		
//		String myFileLocation = "alices_adventures_in_wonderland.txt";
//		File text = new File(myFileLocation);
//		
//		try(Scanner fileScanner = new Scanner(text);
//				
//		System.out.println("Please enter path of file >>>");
//		myFileLocation = Scanner.nextLine();
//	}
//	}

		
//		File inputFile = findWord.getInputFileFromUser();
//		try(Scanner fileScanner = new Scanner(inputFile)) {
//			while(fileScanner.hasNextLine()) {
//				String line = fileScanner.nextLine();
//			}
//		
//		
//	}
//			
//		
//	
//	
//	
//	private File getInputFileFromUser() {	
//			Scanner userInput = new Scanner(System.in);
//					System.out.print("Please enter path to input file >>>");
//			String path = userInput.nextLine();
//			File inputFile = new File(path);
//			if(inputFile.exists()==false) {
//				System.out.println(path + "does not exist");
//				System.exit(1);
//				
//				return inputFile;
//			}
//				
//			}
//	
//	private boolean checkIsWordValid(String words) {
//		System.out.println("Check word for:" + words);
//		if
//		}
//		


