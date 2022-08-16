package Others;

import java.util.Random;

public class generateRandomNumbers {

	public static void main(String[] args) {
		

		Random rand = new Random();

	//Logic-1  Using Random methods
		
		double rand_dbl = rand.nextDouble();
		System.out.println(rand_dbl);
		
		int rand_int = rand.nextInt(10);
		System.out.println(rand_int);
		
		int rand_int1 = rand.nextInt(100);
		System.out.println(rand_int1);
		
		int rand_int2 = rand.nextInt(1000);
		System.out.println(rand_int2);
		
	
		
		
	//Logic-2  using Math in-build Method
		
		System.out.println(Math.random());
	}

}
