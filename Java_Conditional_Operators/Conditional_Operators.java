package Java_Conditional_Operators;

public class Conditional_Operators {
 public static void main(String args[]) {
	 boolean bool1,bool2,result;
	 bool1=true;
	 bool2=false;
	 result= bool1 || bool2; //True When At Least One Value Is True
	 System.out.println("The Result is:" + result);
	 
	 result = bool1 && bool2; //True When Both Values are True
	 System.out.println("The Result is:" + result);
 }
}
