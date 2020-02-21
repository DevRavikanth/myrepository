/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controstatements;

/**
 *
 * @author GMPF
 */
public class LabeledFor {  
public static void main(String[] args) {  
    //Using Label for outer and for loop  
    outer:  
        for(int i=1;i<=3;i++){ 
            System.out.println("outer I is "+i);
            inner:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){ 
                        System.out.println("I is "+i+" and J is also " +j+" so break is executed");
                        break outer;  
                    }  
                    System.out.println("inner J is "+j);  
                }  
        }  
}  
}  
