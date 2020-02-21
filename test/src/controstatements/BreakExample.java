/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controstatements;

public class BreakExample {  
public static void main(String[] args) {  
    //using for loop  
    for(int i=1;i<=10;i++){  
        if(i==5){  
            //breaking the loop  
            break;  
        }  
        System.out.println(i);  
    }  
}  
}  