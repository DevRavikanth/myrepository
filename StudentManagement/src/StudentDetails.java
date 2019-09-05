
public class StudentDetails {
	
	private String studentName;
	private String parentName;
	private int rollNum;
	private  int className;
	
	public StudentDetails() {}
	
	public StudentDetails(String studentName, String parentName, int rollNum, int className) {
		//super();
		this.studentName = studentName;
		this.parentName = parentName;
		this.rollNum = rollNum;
		this.className = className;
	}

	/*
	 * public StudentDetails(String sname, String pname, int rnum, int cName) { //
	 * TODO Auto-generated constructor stub }
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getParentName() {
		return parentName;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public int getRollNum() {
		return rollNum;
	}

	
	public void setClassName(int className) {
		this.className = className;
	}
	public int getClassName() {
		return className;
	}
	
	
	
	
	
}
