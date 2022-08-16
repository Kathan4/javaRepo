package Others;

import java.util.Scanner;

public class largestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of first Number :");
		int num1 = sc.nextInt();
		
		System.out.println("Type of Second Number:");
		int num2 = sc.nextInt();
		
		System.out.println("Type of Third Number:");
		int num3 = sc.nextInt();
		
		
		//Logic-1 Approach 1 if else Condition  
		
//		if((num1 > num2)  && (num1 > num3)) {
//			System.out.println(num1+ "is greater number in all 3 numbers..");
//		} 
//		else if(num2 > num1  && num2 > num3) {
//			System.out.println(num2+ "is greater number in all 3 numbers..");
//		}
//		else {
//			System.out.println(num3+ "is greater number in all 3 numbers..");
//		}
		
		//logic -2  Ternary Operator
		
//		  a > b ? a : b;
		
		 int  largest =  num3 > (num1 > num2 ? num1 : num2) ? num3 : (num1 > num2 ? num1 : num2);
		
		System.out.println(largest);
	}

}

//fdgrghreher
