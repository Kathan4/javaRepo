package polymorphism;


 /*
  *     Method 1 : method Overloading by The number of parameters in two methods.
  * 
  * 
  */

public class methodOverloadingTypeI {
	
	int x, y, z;
	
	public int add( int x, int y) {
		int result = x + y;
		return result;                                                                             // Print result via return
	}
	
	
	public int add(int x, int y, int z) {                                                     // if this method do not have any parameter, then it give you Compiler Error
		int result = x + y * z;
//		System.out.println(result);                                                              // Print result via System.out.println()
		return result;
	
	}

	public static void main(String[] args) {
		
		methodOverloadingTypeI addition = new methodOverloadingTypeI();                       // Creating object of above class inside main()
		
		int sum1 = addition.add(4, 4);                                                        // Calling method to add 2 numbers
		int sum2 = addition.add(4, 1, 2);                                                     // Calling method to add 3 numbers
		
		System.out.println(sum1);                                                                  // Printing sum of 2 numbers
		System.out.println(sum2);                                                                  // Printing sum of 3 numbers
	}
}
