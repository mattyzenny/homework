package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws IOException {

		File fizzBuzz = new File("FizzBuzz");
//		int counter = 0;

		try (PrintWriter writer = new PrintWriter(fizzBuzz)) {
			try (Scanner fileScanner = new Scanner(fizzBuzz)) {
				for (int i = 1; i <= 300; i++) {
					if (i % 3 == 0 & i % 5 == 0) {
						writer.println("FizzBuzz");
					} else if (i % 3 == 0 || Integer.toString(i).contains("3")) {
						writer.println("Fizz");
					} else if (i % 5 == 0 || Integer.toString(i).contains("5")) {
						writer.println("Buzz");
					} else {
						writer.println(i);
					}
				}
			}
		}
	}
}
