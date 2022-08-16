package Others;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		

		int count = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter your number:  ");
		int str = sc.nextInt();
		
		while(str != 0) {
			str = str/10;
			count++;
		}
		System.out.println(count);
		
		
		
//		List<Integer> sk = new ArrayList<>();
//		
//		int k = sk.addAll(l);
// 
//		while (en.hasMoreElements()) {
//			type type = (type) en.nextElement();
			
//		}
	}

}
