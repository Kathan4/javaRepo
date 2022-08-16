package polymorphism;


	/*
	 *  Method 2 : method Overloading by The data types of the parameters of methods.
	 */

public class MethodOverloadingTypeII {
	
	public int add( int x, int y, int z) {        													// Adding three integer values
		return x +y +z;
		
	}
	
	public double add( double x, double y, double z) {                                              // adding three double values.
		return  x + y +z;
		
	}
	
	
	

	public static void main(String[] args) {
		
		
		MethodOverloadingTypeII  addition = new MethodOverloadingTypeII() ; 
		
		
		 int sum1 = addition.add(3, 7, 9);
		 double sum2 = addition.add(3.5, 3.1, 9.6);

		 System.out.println(sum1);
		 System.out.println(sum2);
		
		
	}

}
