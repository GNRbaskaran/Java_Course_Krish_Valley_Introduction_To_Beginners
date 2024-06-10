package Java_Class_And_Objects;

//definition of class named student
class Student{
	//member variables of the student course
	String Name;
	int id;
	String major;
	
	//member functions/methods declaration
	public void setName(String Sname) { //take the student name as string and assign to name variable
		this.Name=Sname;
	}
	void setmajor(String subject) { // Take major subject for the student and assign it
		this.major=subject;
	}
	void setStudentId(int no) { //take the studentId  as integer and assign to id variable
		this.id=no;
	}
	void display() {   //Display all the information of the subject
		System.out.println("The Student Name: " + Name);
		System.out.println("The Major Subject Is: " + major);
		System.out.println("The Id Is: " + id);
	}
}
public class Classes_And_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare two reference variable to point student type object
    
	Student S1 = new Student(); //s1 now points to the student type object
    Student S2 = new Student(); //s2 pointing another object of Student type
    
    //Use Member variables and methods to use them
    S1.setName("Gnani");
    S1.setmajor("mathemathics");
    S1.setStudentId(1);
    
    S2.setName("Ram");
    S2.setmajor("mathemathics");
    S2.setStudentId(2);
    
    //Display The Student Details
    S1.display();
    S2.display();
	}

}
