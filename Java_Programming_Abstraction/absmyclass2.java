package Java_Programming_Abstraction;

public class absmyclass2 extends absmyclass1{
  @Override
  void myFunction12() {
	  System.out.println("My Function12 is executing....");
  }
  public static void main(String args[]) {
	  absmyclass2 ob1 = new absmyclass2();
	  ob1.myFunction11();
	  ob1.myFunction12();
	  
	  absmyclass1 ob2 = new absmyclass1() { //Unimplementation method
		  @Override
		  void myFunction12() {
			  System.out.println("My Function12 is executing....");
		  }
	  };
	  ob2.myFunction11();
	  ob2.myFunction12();
  }
}
