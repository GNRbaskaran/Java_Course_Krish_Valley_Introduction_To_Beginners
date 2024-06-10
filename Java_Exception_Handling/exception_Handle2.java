package Java_Exception_Handling;

public class exception_Handle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int result = 22/2; //'a' number divided by 0 is illegal
			System.out.println("result = " + result);
		}
		catch(ArithmeticException arithEx) {
			//catch the exception and handle it in correct way
			System.out.println("Dividing By 0 is not allowed");
			System.out.println("The Exception is: " + arithEx);
		}
		finally { //the finally block always executes
			System.out.println("operation performed");
		}
		System.out.println("End Of The Program...");
	}

}
