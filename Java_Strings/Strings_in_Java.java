package Java_Strings;
import java.util.Scanner;
//import java.util.Arrays;
public class Strings_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char[] charString = {'S','T','R','I','N','G','S'}; // an array of characters
    //Arrays.sort(charString);
    Scanner sc = new Scanner(System.in);
    String str=new String(charString); //make string from the character array
    String str1=charString.toString();
    
    System.out.println("The Value Of STR is: " + str);
    System.out.println("The Value Of STR1 is: " + str1);
    
    System.out.print("Enter The String: ");
    str = sc.next(); // get the string from the user
    System.out.println("The Value Of STR is: " + str);
    
    str= "JAVA Strings"; //direct assign string to the string type object str
    System.out.println("The Value Of Str is: " + str);
    
    str = "String"  + " " + "Concatenate"; //concatenate three strings into single string
    System.out.println("The Value Of STR is: " + str);
    
    sc.close();
	}

}
