package hierarchicalInheritance;

public class personClass {
	
	String name;
	String address;
	int age;

	public static void main(String[] args) {
		
		StudentHI student1 = new StudentHI();
		TeacherHI teacher1 = new TeacherHI();
		
		student1.rollNo = 1;
		teacher1.numCourses = 5;
		
		
		
		System.out.print(student1.rollNo + " \r\n");
		
		System.out.print(teacher1.numCourses);
		

	}

}
