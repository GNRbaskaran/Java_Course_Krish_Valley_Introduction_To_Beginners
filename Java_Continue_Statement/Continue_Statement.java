package Java_Continue_Statement;

public class Continue_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=0;
    while(true) { //infinite loop using while
    	
    	//when the value of a in range 5 to 10, ignore bottom, go for next iteration
    	if(a>=5 && a<=10) {
    		a++; //increase the value of a, then skip to next iteration
    		continue;
    	}
    	System.out.println("The Value Of a: " + a);
    	
    	//when the value of a is 15, come out from the loop with break statement
    	if(a == 15) {
    		break;
    	}
    	a++; //increase the value of a
    }
    System.out.println("End Of The Program...");
	}

}
