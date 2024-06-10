package Java_Functions;
public class function {
	
	 //User Defined Function, <return_type> function_name(<argument_list>)
	
	public static int add(int a,int b) { //function add takes two integer input and return another integer value
		int sum; //sum is local variable of the function hold
		sum= a+b;
		return sum; //return the result as integer data
	}
	
	public static int factorial(int num) { //another recursive function to get factorial of a number
		if(num<=1) {
			return num; //when number is 1 or less than that, factorial is 1
		}
		else {
			return num*factorial(num-1); //recursion call of the function factorial
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num=5,res;
   
   res=(int) Math.pow(num, 3); //pre-defined function pow to get number raise to the power of another number
   System.out.println(num + "^3 : " + res);
   
   res=add(15,20); //call the user defined function add with two integer arguments
   System.out.println("Result: " + res);
   
   System.out.println("The Value Of 6! = " + factorial(6)); //Calling Of Factorial Function
	
	}

}
