package Java_Static_Keyword;
class static_Demo{
	static int staticVar;
	int var;
	public static_Demo(){
		var=0; //initialize non static variable to zero
	}
	public static void setStaticVar(int x) { //static method can only access static variable
		staticVar = x;
	}
	public void increase() {
		staticVar++; //increase the value of static variable
		var++; //increase non static variable
	}
	public void display() {
		System.out.println("The Value Of Static Variable: " + staticVar); //display the value of the static variable
		System.out.println("The Value Of Non-Static Variable: " + var); //display the value of non static variable
	}
}
public class Static_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    static_Demo st1 = new static_Demo();
    static_Demo st2 = new static_Demo();
    
    //Increase The Static Variable two times using st1 object
    st1.increase();
    st1.increase();
    st1.display();
    
    //Increase The Static Variable Three Times Using st2 object
    st2.increase();
    st2.increase();
    st2.increase();
    st2.display();
    
    //Static Variable Can Also Accessed WithOut Any Object
    static_Demo.setStaticVar(50); //call static method without using any object
    System.out.println("Static Variable WithOut Any Object: " + static_Demo.staticVar);
	}

}

