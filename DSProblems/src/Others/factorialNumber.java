package Others;

import java.util.Scanner;

/*
 *   Factorial of 5! = 5 * 4! = 5 * 4 * 3 * 2 * 1 = 120
 *  
 *  
 *  Try this:  10! -7! /4!
 */
public class factorialNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Type your number for find factorial:  ");
		int num = sc1.nextInt();
		long factorial = 1;
		
		//Approach-1 using For loop
		//for loop Ascending Order
//		for (int i= 1; i <= num ; i++) {
//			factorial = factorial * i;
//		}
//		System.out.println("Factorial of your Number is: " + factorial);
		
		// for loop-descending order
		for( int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of your Number is: " + factorial);
		
		
		//Approach-2 Using While loop
		while (condition) {
			
		}

	}

}
