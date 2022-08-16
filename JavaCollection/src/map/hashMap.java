package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


/*
 * 
 * put, putAll, get, remove,containsKey, containsValue,isEmpty,size,clear
 * 
 * HashMap Methods:   keySet => return key object, values => return type is Collection., entrySet => Return all entries, 
 * 
 * ENTRY Interface's method available in Hashmap interface => getKey(), getValue(), setValue(), 
 */

public class hashMap {

	@SuppressWarnings("removal")
	public static void main(String[] args, Object loop) {
		

        // Creating an empty HashMap
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		@SuppressWarnings("rawtypes")
		HashMap<Comparable, Comparable> hm = new HashMap<>();

		//1.) Inserting pairs in above Map  using put() method
		hm.put(101, "Kathan");
		hm.put(102, new String("Yash"));
		hm.put(new Integer(103), "Pruthvi");
		hm.put(102, new String("Rutvi"));													//This is duplicate key, So this will be not print
		hm.put(104, new String("Anal"));
		hm.put(105, new String("Ishani"));
		hm.put(106, 1011);
		hm.put(107, 152);
		System.out.println(hm);

		// 2.) Size == return the number of key/value pairs
		System.out.println(hm.size());
		
		//3.) replacing Exiting Elements
		hm.put(102, "Yash Patel");
		System.out.println(hm);
		
		//4.) get value from hashMap providing key
		System.out.println(hm.get(105));
		System.out.println(hm.get(101));
		
		//5.) Remove pair from HashMap
		
		hm.remove(105);
		System.out.println(hm);
		
		hm.remove(106, 1011);
		System.out.println(hm);
		
		//6.) Replace any value in hashMap proving by new value
		hm.replace(103, "Pruthavi Patel");
		System.out.println(hm);
		
		//7.) ContainKey() => Check key is present or not, Return True/False
		
		System.out.println(hm.containsKey(102));
		System.out.println(hm.containsKey(105));
		
		//8.)  ContainValue() => Check key is present or not, Return True/False
		System.out.println(hm.containsKey("Patel"));
		System.out.println(hm.containsValue("Yash Patel"));

		//9.) isEmpty(), Return True/False
		System.out.println(hm.isEmpty());
		
		//10.) Retrieve only key from hashMap as SET
		System.out.println(hm.keySet());
		
		//10.) Retrieve only Value from hashMap as COLLECTION
		System.out.println(hm.values());
				
		//11.) Entry as Set =? Return all entry as SET
		System.out.println(hm.entrySet());		
			
				
		//Entry Methods
		//*************
		
		System.out.println("Using entry method");
		
		for ( @SuppressWarnings("rawtypes") Map.Entry<Comparable, Comparable> entry: hm.entrySet()) {
			
			System.out.println(entry.getKey() + "        " + entry.getValue());
		}
				
		//1.) For...Each Loop
		
		for (@SuppressWarnings("rawtypes") Comparable i : hm.keySet()) {
			System.out.println(i);
			
		}
		

		for (@SuppressWarnings("rawtypes") Comparable j : hm.values()) {
			System.out.println(j);
			
		}		
				
		for (@SuppressWarnings("rawtypes") Comparable k : hm.keySet()) {
			System.out.println(k + "   " + hm.get(k));
			
		}		
		
		
		//2.) Iterator loop
		
//		for (@SuppressWarnings("rawtypes")
//		Iterator iter = iterator.hasNext();) {
//			Object loop =  iter.next();
//			
//		}
		
				
				
				
	}

}


