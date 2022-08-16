package constructors;

public class Car {

	private String color;
	int price;

	Car() {
		System.out.println("This is Default Constructor.");
		System.out.println(color + "    " + price);
	}

	Car(String c, int p) {

		color = c; // IF YOU DEFINE => color c; it will give this error => price cannot be resolved
					// to a type
		price = p;

		System.out.println("This is paramenter Constructor    ");
		System.out.println(color + "     " + price);
	}

	public static void display(int m) {

		int model = m;
		System.out.println("model :" + model);
	}

	public static void main(String[] args) {

		display(50);

		new Car();
		new Car("kathan", 5);

	}

}
