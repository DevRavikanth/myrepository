package problemsolving;
public class MyStringFormatter {  
public static String reverseString(String str){  
	
    char[] ch=str.toCharArray();  
   // String rev=""; 
    
    StringBuffer sb = new StringBuffer();
    for(int i=ch.length-1;i>=0;i--){  
       // rev=rev + ch[i];  
        sb.append(ch[i]);
    }  
   // return rev;  
 return sb.toString(); 
}  
 
public static void main(String[] args) {
	
	
System.out.println(MyStringFormatter.reverseString("hello"));
	
}

}