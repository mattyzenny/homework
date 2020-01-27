
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub

			//creating a student using default constructor;
			
			
			Student johnny = new Student();
			johnny.setFirstName("John");
			johnny.setLastName("Wayne");
			johnny.addStudentScore(100);
			johnny.addStudentScore(50);
			johnny.addStudentScore(75);
			
			
			System.out.println(johnny.getOverallGrade());
			
			
		}

	

	}


