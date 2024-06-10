package Java_Inheritance;

class Employee{ 
	
	//Employee Class As Base Class
	protected double Salary = 30000D;
	Employee(){
		System.out.println("This is Constructor Of Employee Class");
	}
}
class Developer extends Employee{ 
	
	//Developer is child class of Employee
	double bonus = 10000;
	
	//This Constructor will execute after executing employee constructor
	public Developer() {
		System.out.println("This is Constructor Of Developer Class");
	}
	
	public void displaySalary() {
		
		//The Variable 'Salary' is in the base class
		System.out.println("The Salary Of Developer is: " + (Salary + bonus));
	}
}
class Tester extends Employee{ 
	
	//Tester is another child class of Employee.
	double bonus = 20000;
	
	//this constructor will execute after executing Employee constructor
	public Tester() {
		System.out.println("This is Constructor Of Tester Class");
	}
	
	public void displaySalary() {
		System.out.println("The Salary Of Tester is: " + (Salary + bonus));
	}
}
class Inheritanceinjava{
	public static void main(String args[]) {
		
		//The Constructors of base and derived class will be called respectively
		Developer dev = new Developer();
		dev.displaySalary();
		
		Tester tester = new Tester();
		tester.displaySalary();
	}
}