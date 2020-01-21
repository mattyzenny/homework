package com.techelevator;




import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;



public class ScratchPadObjects {

	public static void main(String[] args) {
		
		
		try (Scanner scanner = new Scanner(System.in)) {
				
		//QUEUE//
		Queue<String> priorities = new LinkedList<String>();
		
		priorities.offer("Clean the dishes");
		priorities.offer("Wash the counters");
		priorities.offer("Sweep the floor");
		priorities.offer("Scrub the floor");
		
		//Processing Items In Queue//
		while (priorities.size() > 0) {
			String nextPriority = priorities.poll();
			System.out.println("NEXT PRIORITY" + nextPriority);
		}

		Queue<Boolean> myBQueue = new LinkedList<Boolean>();
		
		Boolean isThereWork = true;
		myBQueue.offer(new Boolean(isThereWork));
		System.out.println("Is there work?" + "" + myBQueue.poll());
	
		
		
		//STACK//
		Stack<String> browserStack = new Stack<String>();
		
		//Pushing items to the Stack//
		browserStack.push("http://www.google.com");
		browserStack.push("http://www.cnn.com");
		browserStack.push("http://google.com");
		browserStack.push("http://www.techelevator.com");
		browserStack.push("http://www.si.com");
		while (browserStack.size()>0) {
			String previousPage = browserStack.pop();
			System.out.println("Previous Page " + previousPage);
		}
			
			String value = scanner.nextLine();
			String pushedPage = browserStack.push("This is NSFW...are you sure you want to proceed? Press (y) for yes or (n) for no");

			if(value.equalsIgnoreCase("y")) {
				
			
			System.out.println(pushedPage);
		}
		

//		// TODO Auto-generated method stub
//		String name = "Tech Elevator";
//		String name2 = new String ("Irrelevant to use 'new' key word");
//		
//		
		//List//
		List<String> names = new ArrayList<String>();
		
		
		
		//Add object to list//
		names.add("John");
		names.add("Brian");
		names.add("Yoda");
		names.add("Sean");
		names.add("Joe");
		
		
		//This is the exact same as for loop///
		
		for (String name : names) {
			String plural = name +"'s";
		
		System.out.println(plural);
		}
		for (String name : names) {
			if (name.equalsIgnoreCase("yoda"))
				System.out.println("in this list Yoda is");
			
			if(name.equals("Darth Vader"))
				System.out.println("Sith Lord there is");
			else 
				System.out.println("Sith Lord there is not");
		}
		
		
		System.out.println(names.size());
		
		
		if (names.size() !=0) {
		System.out.println(names.get(0));
		
		}
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		names.remove(0);
		System.out.println(names.get(0));

		}
	}
}











//		while(!names.isEmpty()) {
//			List<String> students = new ArrayList<String> ();
//			
//			if (students != null) {
//				while(!students.isEmpty()) {
//				
//			}
//		}
//	}
		
//		
//		char lastValue = name.charAt(name.length()-1);
//		System.out.println(lastValue);
//	}
//}
//		char c = name.charAt(5);
//		System.out.println(c);
////		int nameCompared = name2.compareTo(name);
////		System.out.println(nameCompared);
////		int rs = name.compareTo(name2);
////		System.out.println(rs);
//		name = name.concat(name2);
//		System.out.println(name);
//		
//		
//		 int index = name2.indexOf('I');
//		 System.out.println(index);
//		
//		if(name.contains("ch")) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("Not Found");
//		}
//		if (name.endsWith("E")) {
//			System.out.println("No");
//		}
//		else
//			System.out.println("Yes");
//
//		String finalName = "Hello World";
////		System.out.println(finalName.r)
//	}
//}
//	
//		
//		
//		
//	//	
////		Map<String, Boolean> people = new HashMap<String, Boolean>();
////		people.put("Luke", true);
////		people.put("Han", false);
////		people.put("Chewbacca", false);
////		people.put("Yoda", true);
////		people.put("Leia", false);
////		boolean isLukeJedi = people.get("Luke");
////		System.out.println(isLukeJedi);
////		for(Map.Entry<String, Boolean> person : people.entrySet()) {
////		    if (person.getValue()) {
////		        System.out.println(person.getKey() + " is a Jedi.");
////		    } else {
////		        System.out.println(person.getKey() + " is not a Jedi.");
////		    }
////		}
//	////}
//	//Set<String> characters = new HashSet<String>();  
//	//characters.add("Luke");
//	//characters.add("Rey");
//	//characters.add("Ben");
//	//for(String character : characters) {
////			System.out.println(character);
////		}
//	//}
//	//}
//	//
//	//	
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
////		Queue<String> names = new LinkedList<String>();
////		names.offer("C3PO");  // names now contains C3PO
////		names.offer("R2-D2"); // names now contains C3PO, R2-D2
////		names.offer("BB-8");  // names now contains C3PO, R2-D2, BB-8
////		while(names.size() > 0) {
////		    String name = names.poll(); // the item is removed from the queue
////		    System.out.println(name);
////		}
////		}
//	//	
//	//	
////		public static void main(String[] args) {
////			Stack<String> names = new Stack<String>();
////			names.push("Obi-wan");
////			names.push("R2-D2");
////			names.push("Han Solo");
////			names.push("Leia");
////			//... push names on to the stack
//	//
////			while (names.size() > 0)
////			{    
////			    String name = names.pop(); // the next item is removed from the stack
////			    System.out.println(name);    
////			}
//			
////			String setOfNames = "Joe; John; Mike; Mark";
////			String splitNames[] = setOfNames.split(";");
////			String resetNames = String.join(",", splitNames);
////			System.out.println(resetNames);
//			// TODO Auto-generated method stub
////			int age = 1;
////			if (age >0) {
////				System.out.println("OK");
////				System.out.println (age ++);
////			}
////			System.out.println(age ++);
////			System.out.println(age --);
//	//	
//	//	
////			//int[] variable_name = new int[size];//
////			int [] ages = new int[100];
////		//setting 2nd and 5th element in array//
////			ages[1] = 5;
////			ages[4] = 90;
////			System.out.println("Ages at 1 element " + ages[1]);
////			
////			int mySize = ages.length;
////			System.out.println("Size: " + mySize);
////			//size of array//
////			
////			int lastElement = ages[ages.length -1];
////			System.out.println(lastElement);
////			//value is 0 because last element is not declared//
////			
////			
////			for (int i =0; i<=10; i++) {
////				if (i %2 ==0) {
////					System.out.println("Even: " + i);
////				}
////				else 
////					System.out.println("Odd " + i);
////				
////			int size = 10;
////			int [] ages = new int [size];
////			for (int i = 0; i < ages.length; i++) {
////				System.out.println("Element: " + i + " " + ages[i]);
////			}
//			
//			//TRY THIS LATER//
////			int sum = 0;
////		for (int i=0; i<10; i++) {
////			sum = sum + i;
////			while (sum <20) {
////		System.out.println(sum);
////		}
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
//
//
//	
