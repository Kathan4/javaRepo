package classObjectMethod;

public class Person1 {
	
	
	int unique_id;
	String name;
	int age;
	String City;
	char gender;

//	public Person1() {
//		// TODO Auto-generated constructor stub
//	}
	
	public static void eat() {
		System.out.println("person is eating Food");
	}

	public static void study() {
		System.out.println("person is studing for EXAM");
	}
	
	public static void sleep() {
		System.out.println("person is Sleeping");
	}
	public static void play() {
		System.out.println("person is Playinjg Football");
	}
	public static void dance() {
		System.out.println("person is Dancing in Bar");
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		
		eat();
		study();
		sleep();
		play();
		dance();
		
		

	}

}
