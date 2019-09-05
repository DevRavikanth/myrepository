
public class StudentDatabase {
	
	 StudentDetails[] studentatDetails;
	 StudentMarks[] studentMarks;
	 
	 
	public StudentDatabase() {};
	
	public StudentDatabase(StudentDetails[] studentatDetails, StudentMarks[] studentMarks) {
		//super();
		this.studentatDetails = studentatDetails;
		this.studentMarks = studentMarks;
	}

	public StudentDetails[] getStudentatDetails() {
		return studentatDetails;
	}

	public void setStudentatDetails(StudentDetails[] studentatDetails) {
		this.studentatDetails = studentatDetails;
	}

	public StudentMarks[] getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(StudentMarks[] studentMarks) {
		this.studentMarks = studentMarks;
	}
	
	
	
}
