package Java_Switch_Case_Statement;
import java.util.Scanner;
public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Character: ");
    char ch = sc.next().charAt(0); //Take The First Character From The Given String
    
    switch(ch) {
    case 'A':
      case 'a':
    	  System.out.println("You Have Typed a Letter A!");
    	  break;
    case 'B':
      case 'b':
    	System.out.println("You Have Typed a Letter B!");
    	break;
    case 'C':
       case 'c':
    	System.out.println("You Have Typed a Letter C!");
    	break;
    case 'D':
       case 'd':
    	System.out.println("You Have Typed a Letter D!");
    	break;
    default:
    	System.out.println("You Have Typed Letters Other Than (A,B,C,D).");
    	break;
	}
    sc.close();
    System.out.println("....!End Of The Program!...");

}
}
