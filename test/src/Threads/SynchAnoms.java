package Threads;

class Table1{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	public class SynchAnoms{  
	public static void main(String args[]){  
	final Table1 obj = new Table1();//only one object  
	  
	Thread t1=new Thread(){  
	public void run(){  
	obj.printTable(5);  
	}  
	};  
	Thread t2=new Thread(){  
	public void run(){  
	obj.printTable(100);  
	}  
	};  
	
	Thread t3=new Thread(){  
			/*
			 * public void run(){ obj.printTable(1000); }
			 */  
		};
	  
	t1.start();  
	t2.start(); 
	t3.start();
	}  
	}  