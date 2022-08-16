package map;

import java.util.HashMap;

public class hashMapStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    //Creating an empty HashMap
		HashMap<Integer, String> stuData = new HashMap<Integer, String>();
		
		//1.) Inserting pairs in above Map  using put() method
		stuData.put(101, "Kathan");
		stuData.put(102, new String("Yash"));
		stuData.put(new Integer(103), "Pruthvi");
		System.out.println(stuData);

		// 2.) Size == return the number of key/value pairs
		System.out.println(stuData.size());
		
		//3.) replacing Exiting Elements
		stuData.put(102, "Yash Patel");
		System.out.println(stuData);
	}

}
