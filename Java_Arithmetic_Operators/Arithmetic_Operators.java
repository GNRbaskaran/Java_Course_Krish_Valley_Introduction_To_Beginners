package Java_Arithmetic_Operators;
import java.util.Scanner;
//import java.util.Math;
public class Arithmetic_Operators {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   int a,b,result;
	   System.out.print("Enter The Value Of A:");
	   a=sc.nextInt();
	   System.out.print("Enter The Value Of B:");
	   b=sc.nextInt();
	   result=a+b;
	   System.out.println("The Addition Of The A and B:" + result); //Arithmetic Addition Of A and B
	   result=a-b;
	   System.out.println("The Subtraction Of The A and B:" + result); //Arithmetic Subtraction Of A and B
	   result=a*b;
	   System.out.println("The Multiplication Of The A and B:" + result);//Arithmetic Multiplication Of A and B
	   result=a/b;
	   System.out.println("The Division Of The A and B:" + result); //Arithmetic Division Of A and B
	   result=a%b;
	   System.out.println("The Remainder Of The A and B:" + result);//Remainder Operator To Get Remainder After Dividing A By B
	   result=(int)Math.floor(a/b);
	   System.out.println("The FloorDivision  Of The A and B:" + result); //Floor Division Of A and B
	   sc.close();
   }
}
