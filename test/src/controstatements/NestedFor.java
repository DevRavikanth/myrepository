/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controstatements;
public class NestedFor {  
public static void main(String[] args) {  
//loop of i  
for(int i=1;i<=3;i++){  
    System.out.print("the I is "+i+"\n"); 
    //loop of j
for(int j=1;j<=3;j++){  
        System.out.println("   the J is "+j);  
}//end of i  
}//end of j  
}  
}  
