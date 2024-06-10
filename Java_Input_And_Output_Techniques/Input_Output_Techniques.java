package Java_Input_And_Output_Techniques;
import java.util.Scanner;
public class Input_Output_Techniques {
       public static void main(String[] args) {
    	   //The Following Line Will Print The Given String In The Console
    	   System.out.println("This Is An Output Line");
    	   
    	   int x=10;
    	   //With The String, + is used to display value of the variable
    	   System.out.println("Value Of X: " + x);
    	   
    	   //The Lines Will Print The Same Line for using Print() method
    	   System.out.println("First String ");
    	   System.out.println("Second String ");
    	   
    	   //formatted output string using format specifier
    	   System.out.printf("This is the value of x= %d, PI=%f \n", x, 22f/7);
    	   
    	   Scanner sc=new Scanner(System.in); //Scanner Class Object to read from input Devices
    	   System.out.print("Enter Data Using Keyboard: ");
    	   int data=sc.nextInt(); //It will take integer as input value and store to data
    	   
    	   System.out.println("The Data, that has been read: " + data);
    	   
    	   sc.close(); // close the scanner object when inputs are obtained
       }
}
