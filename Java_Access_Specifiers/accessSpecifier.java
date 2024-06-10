package Java_Access_Specifiers;

class A{
	public int x; //public member can be accessible by any class
	private int y; //private member can be accessible only in this class
	protected int z; //protected member can be accessed in derived class
	
	public A(int a, int b, int c) { //constructor to assign values
		x = a;
		y = b;
		z = c;
	}
	
	public void display() {
		System.out.println("The Value Of X: " + x);
		System.out.println("The Value Of Y: " + y);  //y is private member of class A
		System.out.println("The Value Of Z: " + z);
		System.out.println();
	}
}

class B extends A{
	public B(int a, int b, int c) { //from constructor of b,set member values of class A
		super(a, b, c);
	}
	public void display() {
		System.out.println("The Value of X: " + x); //x is public member values of class A
		System.out.println("The Value of Z: " + z); //z is protected member of class A
		System.out.println();
	}
}

public class accessSpecifier{
	public static void main(String[] args) {
		System.out.println("Data of class B");
		A classB = new B(5,10,15); //object of class B
		classB.display();
		
		System.out.println("Data of class A");
		A classA = new A(12, 24, 36); //object of class B
		classA.display();
		
		C classC = new C(3,16,25);
		classC.display();
		classC.p = 9; //access public member
		classC.q = 56;
		classC.display();
	}
}
