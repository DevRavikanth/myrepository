/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nonOops;

import java.util.Scanner;

class ScannerTest
{
    public static void main(String args[])
    {
                Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        int a = in.nextInt();
        System.out.println("You entered integer "+a);
        float b = in.nextFloat();
        System.out.println("You entered float "+b);
    }
}