package classObjectMethod;

public class A {
	
	A(){
		System.out.println("Constuctor of A");
	}
	
	void Amethod() {
		System.out.println("Method of A");
	}
	

		
	public static void main(String[] args) {
		A obj_A = new A();
		B obj_B = new B();
		
//		obj_A.Amethod();                              // If we are calling method but still constructor gonna call
//		obj_B.Bmethod();                              // If we are calling method but still constructor gonna call
	
	
	}

}
	
	class B{

	B(){
			System.out.println("Constructor of B");
		}
	void Bmethod() {
		System.out.println("Method of B");
	}
	
	
	}

