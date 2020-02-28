package problemsolving;

public class StringMerger {
	
	public String stringMerge(String s1,String s2) {
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		char[] mergArray = new char[ch1.length+ch2.length];
		//StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<ch1.length || i<ch2.length;i++)
		{
			if(i<ch1.length)
			mergArray[i]= ch1[i];
			
			if(i<ch2.length)
			mergArray[i]= ch2[i];
			
			//if(i<ch1.length)
		//	sb.append(ch1[i]);
			//if(i<ch2.length)
			//sb.append(ch2[i]);
		}
		
		for(int i=0;i<mergArray.length;i++) {
			
			System.out.print(mergArray[i]);
		
		}
		System.out.println(mergArray.length);
	//return sb.toString();	
	return "";	
	}

}
