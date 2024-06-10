package Java_Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception_Handle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   
   //try with catch block
	
	  try { 
		  int data1 = Integer.parseInt(br.readLine());
		  System.out.println("Data1: " + data1);
		  } 
	  catch(NumberFormatException e) { 
		// TODO Auto-generated catch block
	  e.printStackTrace(); 
	  } 
	  catch (IOException e) { 
	// TODO Auto-generated catch
	  e.printStackTrace(); 
	  }
	 
   //the try block to enclose the statements which can throw exceptions
//  try {
//	  int data1=0;
//	int result = data1/2;
//	   System.out.println("result = " + result);
//   }
//   catch(ArithmeticException arithEx) {
//		//catch the exception and handle it in correct way
//		System.out.println("Dividing By 0 is not allowed");
//		System.out.println("The Exception is: " + arithEx);
//	}
	finally { //the finally block always executes
		System.out.println("operation performed");
	}
	System.out.println("End Of The Program...");
	}

}
