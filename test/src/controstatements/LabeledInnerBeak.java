/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controstatements;

/**
 *
 * @author GMPF
 */
public class LabeledInnerBeak{  
public static void main(String[] args) {  
    outer:  
        for(int i=1;i<=3;i++){  
            System.out.println("outer I is "+i);
            inner:  
                for(int j=1;j<=3;j++){  
                    if(i==2&&j==2){  
                        System.out.println("I is "+i+" and J is also " +j+" so break is executed and stopped printing next two numbers from inner");
                        break inner;  
                    }  
                   System.out.println("inner J is "+j);    
                }  
        }  
}  
}  