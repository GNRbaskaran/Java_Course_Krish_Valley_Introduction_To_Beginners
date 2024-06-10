package Java_Break_Statement;

public class breakstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=0;
    while(true) { //infinite using while loop
    	System.out.println("The Value Of a: " + a);
    	
    	//when the value of a is 10, come out from the loop with break statement
    	if(a == 10) {
    		break;
    	}
    	a++; //increase the value of a
    }
    System.out.println("End Of The Program....");
	}

}
