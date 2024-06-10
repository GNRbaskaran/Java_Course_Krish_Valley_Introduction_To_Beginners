package Java_Math_Package;

public class Math {
public double Add(double a, double b) {
	return a+b; //Result Of Double Addition
}
public double Sub(double a, double b) {
	return a-b; //Result Of Double Subtraction
}
public double Mul(double a,double b) {
	return a*b; //Result Of Double Multiplication
}
public double div(double a,double b) {
	return a/b; //Result Of Double Division
}
public long Factorial(int num) {
	if(num<=1) {
		return 1;
	}
	else {
		return num*Factorial(num-1); //Factorial Using Recursion
	}
}

}
