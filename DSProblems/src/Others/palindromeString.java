package Others;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
		
		String rev = "";
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your Own String:  ");
		String str = sc.next();
		
		int len = str.length();
		for (int i = len - 1; i >= 0 ; i--) {
			rev =rev+ str.charAt(i);		
		}
		
//		if (str != rev) {
		if (str.equals(rev)) {
			System.out.println(str+ " " + "is Pelindrome String");
		} else {
			System.out.println(str + " " +"is not Pelindrome String and Type new String");
		}

	}

}
