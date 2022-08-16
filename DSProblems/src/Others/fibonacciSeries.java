package Others;


import java.util.Scanner;


// Fibonacci's Number =  0, 1, 1, 2, 3, 5, 8, 13, 21, 34 

public class fibonacciSeries {
	
//	
//	public static int fib(int N) {
//		
//		if(N == 0) {
//			return 0;
//		}
//		
//		if(N == 1) {
//			return 1;
//		}
//		
//		return  N = fib(N -1) + fib(N-2);
//	}
	
	
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Type of first Number :");
		int N = sc.nextInt();
		

        int sum =0;
		
		if(N == 0) {
			System.out.println(N);
		}
		
		if(N == 1) {
			System.out.println(N);
		}
		
		int N1 = 0;
		int N2 = 1;
		
		System.out.print(N1 + " " + N2); 
		while(N > 2) {
			sum = N1 + N2;
			
			System.out.print( " " +sum);
			N1 = N2;
			N2 = sum;
			
			N--;
		}
		

	
	
	}

}


//
////logic-1
//		int n1 = 0, n2 = 1, series = 0;
//		System.out.print(n1 + " " +n2);
//		for (int i = 2; i < num; i++) {
//			series = n1 + n2;
//			System.out.print( " " +series);
//			n1 = n2;
//			n2 = series;
//			
//		}