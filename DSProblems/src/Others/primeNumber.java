package Others;

import java.util.Scanner;

/*	Question: Prime number or not prime number.
 *  Rules: 1. Natural Number > 1.
 *   	   2. Which has only 2 factors 1 and itSelfs.
 * 
 * 	Ex:  19 => 1 and 19.  		 Prime number
 * 		 28 => 1,2,4,7,14, 28.   Not a Prime Number.
 * 
 * 	try this: 1.)print first 10 prime number
 * 			  2.)print first 10 non prime number
 * 
 * 
 *  prime Number : 2, 3,7,11,13, 17, 19,....
 */
public class primeNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Check your Number is Prime or not");
		int num = sc.nextInt();	
		
		int count = 0; 
		
		if(num>1) {
			for (int i = 1; i <= num; i++) {
				if(num % i ==0 ) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println("This is Prime number");
			}
			else {
				System.out.println(num + "  is not Prime number, Please Provide Different Number!!!");
			}
		}
		else {
			System.out.println(num + "  is not Prime number, Please Provide Different Number!!!");
		}
	}

}
