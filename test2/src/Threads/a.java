package Threads;

class MyThread2 extends Thread{ 
	int i ;
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
