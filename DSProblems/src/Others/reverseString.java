package Others;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		
//		1.) using + (Concatenation) operator
//		String rev = "";
//		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println(" Enter your Own String:  ");
//		String str = sc.next();
//		
//		int len = str.length();
//		for (int i = len - 1; i >= 0 ; i--) {
//			rev =rev+ str.charAt(i);		
//		}
//		System.out.println(rev);
		
//		2.) using Character array
		
		
//		String rev1 = "";
//		@SuppressWarnings("resource")
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println(" Enter your Own String:  ");
//		String str1 = sc1.next();	
//		
//		char a[] = str1.toCharArray();
//		int len1 = a.length;
//		
//		for (int i = len1 - 1; i >= 0 ; i--) {
//			rev1 =rev1 +  a[i];
//		}
//			System.out.println(rev1);

		
//		3.) Using StringBuffer class
		

		@SuppressWarnings("resource")
		Scanner sc2 = new Scanner(System.in);
		System.out.println(" Enter your Own String:  ");
		String str2 = sc2.next();	
		
		
		StringBuffer sb2 = new StringBuffer(str2);
		
		System.out.println(sb2.reverse());
		
		
		
		
	}

}
