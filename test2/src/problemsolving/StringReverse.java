package problemsolving;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str = "ravikanth";
			
			StringBuffer sb = new StringBuffer();
			StringBuffer rev = sb.append(str).reverse();// String to String buffer conversion using append and reverse
			System.out.println(rev);
		/*
		 * String s = rev.toString();//converting from stringbuffer to toString
		 * System.out.println(s);
		 */
			
			//String Builder
			StringBuilder sbq = new StringBuilder();
			StringBuilder rev1 =sbq.append(str).reverse();
			System.out.println(rev1);
			
			
			
		
			
			
	}

}
