package Others;

import java.util.Scanner;

public class CountEvenAndOddDigits {



	public static void main(String[] args) {
	
		int even_count = 0;
		int odd_count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your number:  ");
		int num = sc.nextInt();
			
		while(num > 0) {
			
			int rem = num % 10;
				
				if(rem % 2 ==0) {
					even_count++;
				}
				else {
					odd_count++;
				}
				
			num = num/10;
		}
		System.out.println(even_count);
		System.out.println(odd_count);
		
	}
}
