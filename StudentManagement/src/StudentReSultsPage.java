
public class StudentReSultsPage {
	StudentResults sr;
	
	
	public StudentResults getSr() {
		return sr;
	}
	public void setSr(StudentResults sr) {
		this.sr = sr;
	}
	public void get() {
		
		
		sr.getStudentResult(1).getCs().getStudentMarks();
	}
 public static void main(String[] args) {
	 
	
	 StudentReSultsPage srp = new StudentReSultsPage();
	 CrudStudent cs = new CrudStudent();
	 System.out.println(cs.hashCode());
	 srp.get();
 }
}
