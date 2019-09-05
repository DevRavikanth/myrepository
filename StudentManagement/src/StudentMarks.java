
public class StudentMarks {
	
	 String[] subject;
	 int[] marks;
	
	StudentMarks(){};
	
	public StudentMarks(String[] subject, int[] marks) {
		//super();
		this.subject = subject;
		this.marks = marks;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	
}
