package Others;

import java.util.Scanner;

public class palindromeNumber {

	public static void main(String[] args) {
		
		int rev = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number:   ");
		int Orig_nums = sc.nextInt();
		
		int nums = Orig_nums;
		
		while (nums!=0) {
			rev = (rev * 10) + (nums% 10);
			nums = nums/10;
		}
		System.out.println(rev);
		
		if(Orig_nums == rev) {
			System.out.println("This is Pelindrome number");
		}
		else {
			System.out.println("This is not Pelindrome number");
			System.out.println("type new number");
		}
		
		
		
	}

}

