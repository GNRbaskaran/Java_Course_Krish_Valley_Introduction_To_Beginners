package Java_Interfaces;

public class MyClass3 implements MyInterface2 {

	@Override
	public void myFunction11() {
		// TODO Auto-generated method stub
    System.out.println("myFunction11() is executing with data11 = " + data11 + "...");
	}

	@Override
	public void myFunction12() {
		// TODO Auto-generated method stub
	System.out.println("myFunction12() is executing with data11 = " + data12 + "...");
	}

	@Override
	public void myFunction21() {
		// TODO Auto-generated method stub	
	System.out.println("myFunction21() is executing with data11 = " + data21 + "...");
	}

	@Override
	public void myFunction22() {
		// TODO Auto-generated method stub
	System.out.println("myFunction22() is executing with data11 = " + data22 + "...");
	}
	public static void main(String args[]) {
		MyClass3 ob1 = new MyClass3();
		ob1.myFunction11();
		ob1.myFunction12();
		System.out.println(ob1.myFunction13());
		System.out.println(MyInterface1.myFunction14());
		ob1.myFunction21();
		ob1.myFunction22();
	}

}
