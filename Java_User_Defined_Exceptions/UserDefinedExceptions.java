package Java_User_Defined_Exceptions;
class BelowAgeException extends Exception{ //exception where given age is below 18
	BelowAgeException(){
		super("Age Is Under 18!"); //message from the exception
	}
}

class Application{
	private String name;
	private String course;
	private int age;
	public Application(String name, String course) { //Set name and course to given values
		this.name = name;
		this.course = course;
		age=18; //default age is 18
	}
	public Application() { //Set name and course to empty string
		this("","");
	}
	public void setAge(int age) throws BelowAgeException{ //this method can throw BelowAgeException
		//when the age is below 18, it throws exception
		if(age<18) {
			throw new BelowAgeException();
		}
		else {
			this.age=age;
		}
	}
	public void displayDetails() {
		System.out.println("The Name Of The Student: " + name);
		System.out.println("Applied for: " + course);
		System.out.println("Applicant's Age: " + age);
		System.out.println();
	}
}


public class UserDefinedExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Application application3 = new Application();
//    application3.displayDetails();
    Application application1 = new Application("Jhon", "JAVA Programming");
    Application application2 = new Application("Utpal", "Operating System");
    
    application1.displayDetails();
    try {
    	application2.setAge(17); //this method may throw exception
    }
    catch(BelowAgeException e) {
    	System.out.println(e.getMessage());
    	e.printStackTrace();
    }
	}

}
