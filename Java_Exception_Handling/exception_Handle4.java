package Java_Exception_Handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception_Handle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		 //try with multiple catch block
		
		 try { 
			 int data1 = Integer.parseInt(br.readLine());
			 System.out.println(data1);
		}
		 catch(NumberFormatException|IOException e) {
			 e.printStackTrace();
		 }
	}

}
