
public class StudentAdminPage {

	public static void main(String[] args) {
		// Admin Entry
		CrudStudent cs= new CrudStudent();
		StudentResults sr = new StudentResults();
		//StudentReSultsPage srp = new StudentReSultsPage();
	
		//srp.setSr(sr);
	
		
		System.out.println("**********Hello Admin Welcome to SSC Board**********");
		System.out.println();
		System.out.println("Please Enter The Student Details.");
		int[] marks = {35,45,65,76,45,68};
		String[] subjects = {"Telugu","Hindi","English","Maths","Science","Social"};//Should be constatnts
	    cs.saveStudentDetails("Nani",1,10,"Moses",subjects,marks);
	    System.out.println();
	    System.out.println("Here is your Student Details");
	    System.out.println();
	    cs.getStudentDetails();
	    System.out.println();
	    cs.getStudentMarks();
		//sr.setCs(cs);
		/*
		 * int[] mark = sm.getMarks(); System.out.println(mark); // sr.getResult(1);
		 * 
		 */	    
	  // sr.getStudentResult(1);
	    System.out.println( cs.hashCode());
	    System.out.println( sr);
	}

}
