package Java_For_Loop;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a;
     int sum=0;
     
     //for loop assign value of a and checks the condition, also increment a
     for(a = 0; a < 10; a++) {
    	 System.out.println("The Value Of a: " + a); //print the value of a
    	 sum = sum + a; //add a with the sum and assign the results into sum again
     }
     System.out.println("The Sum Of Numbers From 0 to 9: " + sum);
     System.out.println("a= " + a);
	}

}
