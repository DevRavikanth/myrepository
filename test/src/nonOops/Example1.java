/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nonOops;
public class Example1
{
    public static void main(String[] args)
    {       
        // Using Console to input data from user
        System.out.println("Please Enter the Name:");
        String name = System.console().readLine();
        System.out.println(name);
    }
}