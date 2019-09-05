
public class CrudStudent {
	//Crud Statements
	StudentDetails sd ;
	StudentMarks sm;
	StudentDatabase sdb;
	StudentResults sr;
	StudentReSultsPage srp;

	public void  saveStudentDetails(String sname,int rnum,int cName,String pname,String[]subjects,int[] marks) {

		sd  = new StudentDetails(sname,pname,rnum,cName);
		sm  = new StudentMarks(subjects,marks);
		sdb = new StudentDatabase();
		sr  = new StudentResults();
	
		System.out.println();
		System.out.println("Congratulations !!! Student Details Has Been Saved Succuesfully.");
		System.out.println();
		System.out.println("Here is the Student Result");
		System.out.println();
		StudentResults.setTotResult(marks);
		sr.setMarks(marks);
		//srp.setSr(sr);
		sr.setCs(this);

	
		/*
		 * int[] m = sm.getMarks(); System.out.println("marks "+m[0]);
		 */
		//sdb.setStudentatDetails(sd);
	}
	
	public void getStudentDetails() {

		System.out.print("Student Name: "+sd.getStudentName()+" || "); 
		System.out.print("Student Roll Num: "+sd.getRollNum()+" || ");
		System.out.print("Student Class Name: "+sd.getClassName()+" || ");
		System.out.println("Student Parent Name: "+sd.getParentName()+" ");

	}
	public void getStudentMarks() {
		
		System.out.println("Here is your Student Marks.");
		System.out.println();
	
		for(int i =0;i<sm.subject.length;i++) {

			System.out.println(sm.subject[i]+" :"+sm.marks[i]+" ");
			
		}
	
	}
	
	  public static void main(String[] args) {
		  
		  CrudStudent cs1 = new CrudStudent();
		
		
		  System.out.println("Sdetials "+ cs1.sd);
		  System.out.println( "StudentMarks "+ cs1.sm);
		  System.out.println( "StudentsResltpage "+ cs1.srp);
		 
		  System.out.println( cs1.hashCode());
		  
		  
	  
	  }

}
