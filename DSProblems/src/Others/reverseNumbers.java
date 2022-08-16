package Others;

import java.util.Scanner;

public class reverseNumbers {

	public static void main(String[] args) {
		

		
		
//		1.) using Algorithm
		
		
		int rev = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter any number:   ");
		int Orig_nums = sc.nextInt();
		
		while(Orig_nums!=0) {
			rev = (rev*10) + (Orig_nums % 10);
			Orig_nums = Orig_nums/10;
		}
		
		System.out.println(rev);

		
//		2.) Using StringBuffer class using append()
		
		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Enter any number:   ");
		
		int num2 = sc2.nextInt();
		
		
		StringBuilder sb2 =  new StringBuilder();
		
		
		sb2.append(num2);
		
		StringBuilder rev2 = sb2.reverse();
		
		System.out.println(rev2);
		
		
		
		
//		3.) Using StringBuffer class using predefine method(reverse())

		@SuppressWarnings("resource")
		Scanner sc1 = new Scanner(System.in); 
		System.out.println(" Enter any number:   ");
		
		int nums = sc1.nextInt();
		
		
	
		StringBuffer sb = new StringBuffer(String.valueOf(nums));
		StringBuffer rev1 = sb.reverse();
		
		System.out.println(" Enter any number:   ");
		
		System.out.println(rev1);
		
		

	}

}
