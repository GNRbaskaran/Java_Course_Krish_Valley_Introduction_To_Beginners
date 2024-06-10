package Java_This_Keyword;

class MyClass{
	private int a,b;
	public MyClass(int a,int b) {
		//constructor parameter name same as member variables
		this.a=a; //This .a points the member variable a. (a=a) is ambiguous,so this keyword used
		this.b=b;
	}
	public MyClass() {
		this(0,0); //it will call parametrized constructor with value 0 and 0
	}
	public void setData(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public void display() {
		System.out.println("The Value Of a and b are: " + a + " and " + b);
	}
}


public class Keyword_This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MyClass myobj = new MyClass();
    myobj.display();
    myobj.setData(23, 46);
    myobj.display();
	}

}
