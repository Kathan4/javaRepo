package singleInheritance;

public class AreaAndPerimeter {
	
	
	
	static void areaRectangle(int length, int height) {
		
	int area = length * height;
	System.out.println("Area of your land is:    " + area);
	
	}
	
	static void perimeterRectangle(int length, int height) {
		
		int perimeter =  2 * (length + height);
		System.out.println("Perimeter of your land is:  " + perimeter);
		
		}

}
