import java.util.ArrayList;
import java.util.List;

public class Student {


	private String firstName;
	private String lastName;
	private String overallGrade;
	
	
	//create list of scores//
	private List<Integer> scores = new ArrayList<Integer>();
	
	
	public String getFirstName() {
		return firstName;
		
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}



	public String getLastName() {
		return lastName;
		
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
		
	}



	public String getOverallGrade() {

		
		//put logic here to calculate score;
		int sum = 0;
		
		for (int i : scores) {
		
			sum += i;
		}
		
	double avg = sum / scores.size();
	
	if (avg >  50) {
		return "A";
	}
	else {
		return "F"; 
	}
		
		}
	
		
		
	

	


// 	dont want people to set scores
	
//	public void setOverallGrade(String overallGrade) {
//		this.overallGrade = overallGrade;
//	}



	public List<Integer> getScores() {
		return scores;
	}


	// dont want people to set scores.
//	public void setScores(List<Integer> scores) {
//		this.scores = scores;
//	}

	public void addStudentScore (Integer score) {
		scores.add(score);
		System.out.println("Score: " + score + "added");
	}

	
	
	}
	


	

