package test;

import java.util.TreeSet;

public class TreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
	TreeSet t = new TreeSet();
	t.add("String");
	t.add(10);//classcastexception
	t.add("Object");
	t.add("Class");
	
	System.out.println(t);
	
	}

}
