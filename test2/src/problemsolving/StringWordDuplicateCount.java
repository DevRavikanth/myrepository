package problemsolving;

import java.util.Calendar;

public class StringWordDuplicateCount {
	 private static long startTime;
	 private  static long endTime;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello this is ravi ravi is a good bot but ravi hasnt craked the life yet how fool he is ravi ? ravi";
		String[] words = s.split(" ");
		int count=0;
		StringBuilder sb = new StringBuilder();
		
		 startTime = Calendar.getInstance().getTimeInMillis();
		for(int i=0;i<words.length;i++) {
			
			if(words[i].equals("ravi")) {
				
				count++;
			}
			//System.out.println(words[i]);
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println(endTime - startTime+" milliSeconds taken for execution  and the count is :"+ count);

	}

}
