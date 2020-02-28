package Threads;

public class Table{  
	 void printTable(int n){//synchronized method  
		 
		System.out.println("Nani");
		System.out.println("sunny");
		System.out.println("srujna");
		 
		 synchronized(this) {
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
		 }
	  
	 }  
	}  
