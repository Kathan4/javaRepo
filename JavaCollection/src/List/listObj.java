package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class listObj {
	


	public static void main(String[] args) {
	
		
		@SuppressWarnings("rawtypes")
		List<Comparable> list = new ArrayList<Comparable>();                                                 // Declare list object for mix Data type( int, String, Char, Boolean, float)
		

		
 	
	//1.) add new elements to list	
	list.add("Patel");
	list.add(101);
	list.add('Y');
	list.add(true);
	list.add(98.99);
	System.out.println(list);
	
	
	//2.) total element size of list Object 
	System.out.println("Number of elements in list:  " + list.size());
	
	//3.) Remove
	list.remove(2);                                                                              			// Removing Index element 2
	list.remove(98.99);                                                                              		// Removing any element providing Direct value
	
	System.out.println(" After removing element from list: " + list);								
	
	//4.) insert new element anywhere in list Providing Via Object
	list.add(0, "Kathan");
	list.add(null);																							// Even we can add null value in ArrayList more then once's
	list.add(null);																							// Even we can add null value in ArrayList more then once's
	System.out.println(" After insertion new Value: " + list);
	
	//5.) Retrieve specific element
	System.out.println(list.get(0));                                                                        // kathan
	System.out.println(list.get(3));																		//true
	
	
	// 6.) Change element/replace
	list.set(0, "kat");
	System.out.println("After Change/Replace element in Arraylist:" +list);                               
	 
	//7.)  Search Contain Elements 
	System.out.println("Search element in Arraylist: " + list.contains("kat"));                             // Return Value in True or False
	System.out.println("Search element in Arraylist: " + list.contains("false"));							
	
	//8.)  isEmpty()
		System.out.println("Is ArrayList Empty or not??? " + list.isEmpty());                             // Return Value in True or False

	// 9.) Clear All element from ArrayList
	//	list.clear();
	//	System.out.println(list);
	
	
	
	
	// Reading elements via LOOPS 
	// 1.) For LOOP
			
		
	System.out.println(" 1.)   Running For LOOP");

	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}

	// 2.) For...Each LOOP

	System.out.println(" 2.)   Running For...Each LOOP");
	for (@SuppressWarnings({ "rawtypes", "unused" })
	Comparable ar1 : list) {
		System.out.println(ar1);
	}

	// 3.) iterator()
	System.out.println(" 3.)   Running elememts using iterator method");

	@SuppressWarnings({ "unused", "rawtypes" })
	Iterator<Comparable> ar2 = list.iterator();
	while (ar2.hasNext()) {

		System.out.println(ar2.next());
	}
			
	}
}



	

/*  Important NOTES
 * 	=> Declare ArrayList 
 * 
 * 
 *	ArrayList list = new ArrayList();
 *  ArrayList<Integer> list1 = new ArrayList<Integer>();                             Declare ArrayList only for Integer Object 
 *	ArrayList<String> list2 = new ArrayList<String>();                               Declare ArrayList only for String Object 
 *	ArrayList<Boolean> list3 = new ArrayList<Boolean>();                             Declare ArrayList only for Boolean Object 
 * 	
 * 
 * 
 * 
 * 
 * 
 *  Extra Methods/ Collection Methods 
 *  addAll, removeAll, Sort, Shuffle, reverseOrder
 * 
 * 
 * 
 * 
 * 
 * 
 */
