package Threads;
public class InterThreadDemo{  
public static void main(String args[]){  
final InterThreadCustomer c=new InterThreadCustomer();  
new Thread(){  
public void run(){c.withdraw(15000);}  
}.start();  
new Thread(){  
public void run(){c.deposit(10000);}  
}.start();  
  
}}  
