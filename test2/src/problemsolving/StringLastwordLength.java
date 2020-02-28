package problemsolving;

public class StringLastwordLength {
	//Last word length in a given sentence
	public int lwLength(String input) {
		
		char[] ch = input.toCharArray();
		
		int count = 0;
		
		for(int i=ch.length-1;i>=0;i--)
		{
		
			//if(!Character.isWhitespace(ch[i])) {
				 if(ch[i]==' ') {
				
				break;
				 
				 }	 
				 else {
					 count++;
				 }
		}
		return count;
		} 
	}
	



