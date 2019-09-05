package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Arrlist {
	public static void main(String[] agrs) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1000000);
		al.add(100);
		al.add(1000);
		al.add(10000);
		al.add(10);
		al.add(100001);
		Collections.sort(al); 
		
		
	System.out.println(al);
	
	
		for(int i =0;i< al.size();i++) {
		
			
		System.out.println(al.get(i));
		}
		
	}

}
