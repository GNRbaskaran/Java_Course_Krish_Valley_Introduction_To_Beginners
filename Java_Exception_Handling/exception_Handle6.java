package Java_Exception_Handling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception_Handle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		 //the try block to enclose the statements which can throw exceptions
		try {
			System.out.println("Enter The First Number....");
			int data1=Integer.parseInt(br.readLine());
			System.out.println("Enter The Second Number....");
			int data2=Integer.parseInt(br.readLine());
			
			 //the try block to enclose the statements which can throw exceptions
			int result = data1/data2; // data1 is divided by data2
			System.out.println("result = " + result);
			
		} 
		catch(IOException ioe) {
			System.out.println("IO Exception Has Taken Place!" + ioe);
			ioe.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Exception exist: " +e);
			e.printStackTrace();
		}
		finally { //the finally block always executes
			System.out.println("operation performed");
		}
		System.out.println("End Of The Program...");
	}

}
