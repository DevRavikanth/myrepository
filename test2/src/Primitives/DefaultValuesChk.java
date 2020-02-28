package Primitives;

public class DefaultValuesChk {
	String s ;
	Integer it;
	
	
	DefaultValuesChk(){
		
		System.out.println("Testing");

		new String();
		
		new Integer("10");
		//it.hashCode();
		System.out.println(it.hashCode());
 
 //////why we cant access from here?
		/*
		 * Testing Exception in thread "main" java.lang.NullPointerException at
		 * Primitives.DefaultValuesChk.<init>(DefaultValuesChk.java:16) at
		 * Primitives.DefaultVlDemo.main(DefaultVlDemo.java:6)
		 */
  
	}
  
  
	

}
