/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nonOops;

class Console{    
public static void main(String args[]){    
    java.io.Console c=System.console();    
System.out.println("Enter your name: ");    
String n=c.readLine();    
System.out.println("Welcome "+n);    
}    
}