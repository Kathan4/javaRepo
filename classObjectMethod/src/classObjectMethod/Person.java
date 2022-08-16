package classObjectMethod;




public class Person {
	
	
	int unique_id;
	String name;
	int age;
	String City;
	char gender;

	public static void main(String[] args) {
		Person person = new Person();
		person.unique_id = 1;
		person.name = "kathan";
		person.age =24;
		person.City = "panjab";
		person.gender = 'M';
		
		
		
		System.out.println(person.unique_id);
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.City);
		System.out.println(person.gender);
	}

}
