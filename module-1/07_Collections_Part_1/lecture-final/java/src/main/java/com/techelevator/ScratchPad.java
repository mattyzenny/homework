package com.techelevator;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;

//
//
//
//
	public class ScratchPad {
//
//	public static void main(String[] args) {
	
		public List<String> no4LetterWords(String[] stringArray) {
			
			
			List<String> no4Letters = new ArrayList<String>();
			
			for(String s : stringArray) {
				if(s.length() !=4) {
					no4Letters.add(s);
				}
					return  no4Letters; 	
			}
			System.out.println(no4Letters);
			return no4Letters;
		}
	}
	
	
		
		
		// TODO Auto-generated method stub
//		
//		String [] fruits = new String [3];
//		fruits[0] = "Mango";
//		fruits[1] = "Apple";
//		fruits[2] = "Strawberry";
//		System.out.println(fruits[1]);
//	}
//
//	List<String> fruitsArrayList = new ArrayList<String>();
//		fruitList.add("Mango");
//		fruitList.add("Apple");
//		fruitList.add("Strawberry");
//		System.out.println(fruitList);
//}
//		
//		
//		
		
//		
//		
//		
//		
//		
//		//Lists
//		List<String> names = new ArrayList<String>();
//		
//		//add to our list
//		names.add("Sean");
//		names.add("Joe");
//		names.add("Brian");
//		names.add("Yoda");
//		names.add("Bubba");
//		
//		System.out.println(names.size());
//		
//		if (names.size() != 0) {
//			System.out.println(names.get(0));
//		}
//		
//		for (int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
//		names.remove(0);
//		
//		for (int i=0; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
//		//or using a foreach loop
//		for (String name : names) {
//			if (name.equals("Yoda")) {
//				System.out.println(name);
//			}
//			else {
//				System.out.println(name + " is not Yoda");
//			}
//
//		}
//		
//		//ALSO WORKS WITH PRIMITIVES
//		int[] scores = new int[] {12,33,44,55,66,45,67};
//		for (int score: scores) {
//			System.out.println("score is: " + score);  
//		}
//		
//		
//		
//		while(!names.isEmpty()) {
//			
//		}
//		
//		List<String> students = new ArrayList<String> ();
//		if (students != null) {
//			while (!students.isEmpty()) {
//				
//			}
//		}
//
//
//		
//
//		
//		
//		
//		
//
//		
//		//QUEUES
//		Queue<String> priorities = new LinkedList<String>();
//		
//		priorities.offer("Clean the dishes");
//		priorities.offer("Wash the counters");
//		priorities.offer("Sweep the floor");
//		priorities.offer("Scrub the floor");
//
//		// PROCESSING ITEMS IN A QUEUE
//		while (priorities.size() > 0) {
//			String nextPriority = priorities.poll();
//			System.out.println("NEXT PRIORITY " + nextPriority);
//		}	
//		
//		Queue<Boolean> myBQueue = new LinkedList<Boolean>();
//		
//		boolean isCheese = true;
//		myBQueue.offer(new Boolean(isCheese));
//		
//		System.out.println(myBQueue.poll());
//		
//		
//		// STACKS
//		Stack<String> browserStack = new Stack<String>();
//		
//	
//		// PUSHING ITEMS TO THE STACK
//		browserStack.push("http://www.google.com");
//		browserStack.push("http://www.cnn.com");
//		browserStack.push("http://www.google.com");
//		browserStack.push("http://www.techelevator.com");
//		browserStack.push("http://www.si.com");
//
//
//		// POPPING THE STACK
//		while (browserStack.size() > 0) {
//			String previousPage = browserStack.pop();
//			System.out.println("PREVIOUS PAGE: " + previousPage);
//		}
//
//
//	}
//
//}
