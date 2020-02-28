package testStrings;

import java.util.LinkedList;

public class NumberSplit {

	public static void main(String[] args) {
		System.out.println("Hello");
		/*
		 * int number = 1234; // = some int int total =0;
		 * 
		 * while (number > 0) { System.out.println( number % 10); number = number / 10;
		 * // total = total+number; }
		 */

		
		/*
		 * int number = 0; // = and int LinkedList<Integer> stack = new
		 * LinkedList<Integer>(); while (number > 0) { stack.push( number % 10 ); number
		 * = number / 10; }
		 * 
		 * while (!stack.isEmpty()) { System.out.print(stack.pop()); }
		 */
		/*
		 * String someInt = "1234"; String number = String.valueOf(someInt);
		 * 
		 * char[] digits1 = number.toCharArray(); // or: String[] digits2 =
		 * number.split("(?<=.)");
		 */
	
	}
	public static void printDigits(int num) {
	    if(num / 10 > 0) {
	        printDigits(num / 10);
	    }
	    System.out.printf("%d ", num % 10);
	}

}
