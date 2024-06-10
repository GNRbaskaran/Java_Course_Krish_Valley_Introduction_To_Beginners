package Java_Programming_Abstraction;
abstract class Employee{ //no object can be generated of abstract data
	void description() {
		System.out.println("It Is an employee ");
	}
	abstract void salary(); //abstract function of no body
}
class Programmer extends Employee{
	@Override
	void description() { //override Description method
		System.out.println("He Is An Programmer ");
	}
	void salary() { //the salary must be defined in the child class
		System.out.println("Salary Of Programmer is 25000");
	}
}
class Tester extends Employee{
	@Override
	void description() { //override Description method
		super.description(); //call description of parent class
		System.out.println("He Is A Tester ");
	}
	void salary() {  //the salary must be defined in any child class
		System.out.println("Salary Of A Tester Is 20000");
	}
}
public class abs_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee e = new Programmer();
    e.description();
    e.salary();
    
    e=new Tester();
    e.description();
    e.salary();
	}

}
