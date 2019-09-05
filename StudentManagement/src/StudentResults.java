
public class StudentResults {
	
	private int[] marks;
	private CrudStudent cs;
	StudentMarks sm ;
	StudentReSultsPage arp;
	
	public StudentResults(StudentReSultsPage arp) {
		
		this.arp = arp;
		
	}

	public StudentResults() {
		// TODO Auto-generated constructor stub
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public CrudStudent getCs() {
		return cs;
	}

	public void setCs(CrudStudent cs) {
		this.cs = cs;
	}

	public StudentMarks getSm() {
		return sm;
	}

	public void setSm(StudentMarks sm) {
		this.sm = sm;
	}
	
	
	public static void total(int[] m) {

		double tot = 0;

		for(int i =0; i<m.length; i++) {

			tot = tot+m[i];
		}

		System.out.println("Your Marks in Total is : "+tot);
		
		
		
		avg(tot);
		//return tot;
	}

	public static void avg(double scored) {
		
		int total = 600;
		
		double avrge = ((scored/total)* 100);

		System.out.println("Your Percentage is : "+avrge);
		
		grade(avrge);
		//return avrge;		
	}

	public static void grade(double grade) {

		if(grade<35) {
			
			System.out.println("We are Very Soryy You are Failed !!");
			
		}else if(grade>35 && grade <50) {

			System.out.println("You are Passed in Third Class !!");
			
		}else if(grade>50 && grade < 60) {
			
			System.out.println("You are Passed in Second Class !!");

		}else {

			System.out.println("Congrtulation ... You are Passed in First Class !!");
		}

	}

	public static void setTotResult(int[] marks) {
		
	total(marks);
	
	}
	
	public static void setStudentMarks() {
	}
	
	public StudentResults getStudentResult(int i) {

		
		
		System.out.println("**********Hello  Raja Welcome to SSC Results**********");
		
		System.out.println(cs);
		cs.getStudentMarks();
		return this;
		
	}


	
	
	
	
// Testing
	
	
	  public static void main(String[] args) {
	  
		  StudentResults sr = new StudentResults();
		
		  System.out.println("Crud "+  sr.cs);
		  System.out.println(  "StudentMarks "+ sr.sm);
		  System.out.println( "StudentsResltpage "+  sr.arp);
		  System.out.println(sr);
		 
		  
	  
	  }
	 

}
