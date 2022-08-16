package Others;

import java.util.Scanner;

public class countSumOfDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of Number:");
		int num = sc.nextInt();
		
		int sumTotal = 0;
		while(num >0) {
			
			sumTotal = sumTotal +num%10;
			
			num = num /10;
		}
		
		System.out.println(sumTotal);
	}

}
