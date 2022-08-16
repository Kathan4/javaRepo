package Others;

public class swap2Nums {
	


	public static void main(String[] args) {
		
		int a = 30;
		int b = 5;
		
		System.out.println("before swapping a and b's Values: " + a +" "+ b);
		
		//logic-1 					//Third Variable
//		t = a;
//		b =t;
//		a =b;

		//logic-2 					// use + and - with using third variable
//		t = a+ b;               	// 10+20 =30
//		b= t-a; 					// 30 - 10 = 20
//		a= t-b;						// 30 - 20 = 10
		
		//logic-3 					// use + and - without using third variable
		
//		a = a + b;					// 10 + 20 = 30
//		b = a - b;					// 30 - 10 = 20
//		a = a -b;
		
		//logic-4 					use * and / without using third variable
	
//		a = a * b;					// 30 * 5 = 150;
//		b = a / b;
//		a = a / b;
		
//		logic-5        				Bitwise XOR(^)]
		
//		a = a^b;
//		b = a^b;
//		a = a^b;
		
		
//		logic-6 					single statement
		
		b = (a+b) - (a=b);    
		
		System.out.println("after swapping a and b's Values:  " + a +" "+ b);

	}

}
