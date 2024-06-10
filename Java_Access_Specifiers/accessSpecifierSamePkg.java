package Java_Access_Specifiers;

class C{
	public int p;  //public member can be accessible by any class 
	int q; //default variable can be accessible from same package
	private int r;
	
	public C(int a, int b, int c) { //constructor to assign values
		p = a;
		q = b;
		r = c;
	}
	
	public void display() {
		System.out.println("The Value Of P: " + p);
		System.out.println("The Value Of Q: " + q); //q is default member of class C
		System.out.println("The Value Of R: " + r);
		System.out.println();
	}
}