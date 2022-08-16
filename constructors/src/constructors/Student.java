package constructors;

public class Student {

	int id;
	String name;
	int Rollno;
	
	Student(){
		System.out.println("this is my Default Constructor");
		System.out.println(id+ "" +  name);
	}
	
	Student(int i, String n){
		id =  i;
		name = n;
		
		System.out.println("this is my parametered Constructor");
		System.out.println(id + "" + name);
	}
	
	public void display(int id, String name) {
		System.out.println( id + " " +name);
	}
	
	public static void main(String[] args) {
		 
		Student stu = new Student();                    // Default Constructor
		Student stu1 = new Student(2,"yash");			// Parameterized Constructor
		Student stu2 = new Student();      
		
	
		stu1.id = 1;                                    // access using dot(.) variable ==>  reference variable to access id   
		stu1.name = "Kathan";
		System.out.println(stu1.id);                    // after assigning stu1's id 1, it print updated id 1
		System.out.println(stu1.name);   			    // after assigning stu1's Kathan, it print updated name Kathan.
		System.out.println(stu.id);               
		System.out.println(stu.name);     
		
		

		stu2.display(3, "pruthvi");                     //  Student Object called display method
	}

}
