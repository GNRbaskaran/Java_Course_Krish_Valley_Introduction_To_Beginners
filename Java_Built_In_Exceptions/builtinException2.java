package Java_Built_In_Exceptions;

public class builtinException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] myArray = {10, 20, 30, 40, 50}; //five elements in the array
		    String myString = "abcd"; //initially set the string as null
		    
		    try { //this is try block to handle ArrayIndexOutOfBoundsException
		    	System.out.println("The Value Of myArray[1]: " + myArray[1]);
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		    	System.out.println("Invalid index of the array.");
		    	//e.printStackTrace();
		    }
		    
		    try { //this is try block to handle NullPointerException
		    	System.out.println("Character At 0 of the string: " + myString.charAt(0));
		    }
		    catch(NullPointerException e) {
		    	System.out.println("The String is pointing a null value.");
		    }
		    
		    try { //this is try block to handle  NumberFormatException
		    	int number = Integer.parseInt("123");
		    	System.out.println("The Number Is: " + number);
		    }
		    catch(NumberFormatException e) {
		    	System.out.println("It Is Not a Valid Number.");
		    }
	}

}
