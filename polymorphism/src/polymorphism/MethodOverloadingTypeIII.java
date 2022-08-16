package polymorphism;

		/*
		 *  Method 3 : method Overloading by The Order of the parameters of methods.
		 */
public class MethodOverloadingTypeIII {
	
	public void person(int id , String name) {
		System.out.println("geekName :" + name + " "+ "Id :" + id);
	}
	
	public void person( String name , int id ) {
		System.out.println("Id :" + id + " " + "geekName :" + name);
	}

	public static void main(String[] args) {
		
		MethodOverloadingTypeIII geekName = new MethodOverloadingTypeIII() ;
		
		geekName.person(1, "Kathan");
		geekName.person("Yash" , 2);
	}

}
