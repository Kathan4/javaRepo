package Others;

import java.util.Iterator;

public class sumOfArray {

	public static void main(String[] args) {
		int a[]= {2,4,9,32,99};
		int sumArray =0;
		
//		//approach-1 for loop
//		for (int i = 0; i < a.length; i++) {
//			sumArray =sumArray + a[i];
//		}
//		System.out.println("Sum of Array's Elememts:  " +sumArray);
//		
		// Logic-2 enhanced For loop
		for (int value : a) {                                                                        // int i ==> this is not gonna work with   sumArray = sumArray + a[i]; 
			sumArray = sumArray + value;															 // sumArray = sumArray + a[i]; a[i]  is error Index 9 out of bounds for length 5
 		}
		System.out.println("Sum of Array's Elememts:  " +sumArray);
	}

}
