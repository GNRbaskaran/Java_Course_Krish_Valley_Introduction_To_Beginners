package Java_Packages;
import Java_Math_Package.Math;
public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Math math = new Math(); //Define Object Of Math Class
   System.out.println("Result Of (140.23 + 23.15): " + math.Add(140.23,23.15));
   System.out.println("Result Of (140.23 - 23.15): " + math.Sub(140.23,23.15));
   System.out.println("Result Of (8.5 * 5): " + math.Mul(8.5,5));
   System.out.println("Result Of (55/7): " + math.div(55D, 7D));
   System.out.println("Result of (6!): " + math.Factorial(6));
	}

}
