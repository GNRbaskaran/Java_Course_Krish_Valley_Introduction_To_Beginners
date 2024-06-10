package Java_Final_Keyword;
class ClassA{
	final int finInteger;
	protected int myInt;
	public ClassA(int x,int y) {
		this.finInteger=x; //Initialize For Only One Time
		this.myInt=y;
	}
	public ClassA() {
		this(0,0);
	}
	final public void dispFinal() { //final methods cannot be overridden
		System.out.println("The Value Of Final Variable: " + finInteger);
	}
	public void dispMyInt() {
		System.out.println("The Value Of MyInt: " + myInt);
	}
}

final class ClassB extends ClassA{ //final class will not be extended
	protected int myInt;
	public void setMyInt(int x) {
		myInt=x;
	}
	@Override
	public void dispMyInt() { //overriden method
		System.out.println("The Value Of MyInt For class B: " + myInt);
	}
}
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		ClassA clA = new ClassA(10,15);
		clA.dispFinal();
		clA.dispMyInt();
		
		ClassB clB = new ClassB(); //object of class B
		clB.setMyInt(50);
		clB.dispMyInt();
	}

}
