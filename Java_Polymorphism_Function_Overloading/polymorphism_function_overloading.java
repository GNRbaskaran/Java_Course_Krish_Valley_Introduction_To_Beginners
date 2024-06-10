package Java_Polymorphism_Function_Overloading;

public class polymorphism_function_overloading {
public static void area(float side) { //function to get area of square
	System.out.println("Area Of A Square is: " + (side*side));
}
public static void area(double radius) { //function to get area of circle
	System.out.println("Area Of A Circle is: " + (3.1415 * radius * radius));
}
public static void area(float l,float b) { //function to get area of circle
	System.out.println("Area Of A Rectangle is: " + (l*b));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    area(4,5); //overloaded area method to find area of triangle
    area(5F);  //overloaded area method to find area of square
    area(6D);  //overloaded area method to find area of circle
	}

}
