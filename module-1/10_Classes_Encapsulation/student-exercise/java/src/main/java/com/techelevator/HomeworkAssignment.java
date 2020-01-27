package com.techelevator;

public class HomeworkAssignment {
//INSTANCE VARIABLES//
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	
	
	//CONSTRUCTOR//
public HomeworkAssignment(int possibleMarks) {
	this.possibleMarks = possibleMarks;
}


	//GETTER/SETTER//
	public int getEarnedMarks() {
		return earnedMarks;
	}




	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}




	public String getSubmitterName() {
		return submitterName;
	}




	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}




	public int getPossibleMarks() {
		return possibleMarks;
	}




	public String getLetterGrade() {
		 
		if((earnedMarks + ((earnedMarks / possibleMarks) * 100)) >= 90) {
			return "A";
		}
		else if (((earnedMarks + ((earnedMarks / possibleMarks) * 100)) < 90) && ((earnedMarks + ((earnedMarks / possibleMarks) * 100)) > 79)) {
			return "B";
		}
		else if (((earnedMarks +  ((earnedMarks / possibleMarks * 100)) < 80) && ((earnedMarks + ((earnedMarks / possibleMarks) * 100)) >= 70))) {
			return "C";
		}
		else if (((earnedMarks + ((earnedMarks / possibleMarks  * 100)) < 70) && ((earnedMarks + ((earnedMarks / possibleMarks) * 100)) >= 60))) {
			return "D";
		}
		else return "F";
	}
		
//		if(((1.0 * earnedMarks / possibleMarks) * 100) >= 90) {
//			return "A";
//			
//		}
//		else if ((((double)earnedMarks / possibleMarks) * 100) >= 80) {
//			return "B";
//		}
//		else if (((1.0 * earnedMarks/possibleMarks) * 100) >= 70) {
//			return "C";
//			
//		}
//		else if (((1.0 * earnedMarks/ possibleMarks ) * 100) >= 60) {
//			return "D";
//		}
//		else { 
//			return "F";
//		}
//		}
	
	



	
	
	
}
