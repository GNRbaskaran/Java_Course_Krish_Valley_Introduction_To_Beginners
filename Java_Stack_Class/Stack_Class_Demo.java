package Java_Stack_Class;
import java.util.Stack;
public class Stack_Class_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> stack = new Stack<>(); //Define Stack For Integer Type

//push items into the stack
stack.add(10);
stack.add(20);
stack.add(30);
stack.add(40);
stack.add(50);

//Displaying The Size Of The Stack
System.out.println("The Size Of The Stack is: " + stack.size());

//Displaying The Top Of The Element in The Stack 
System.out.println("The Top Of The Element is: " + stack.peek());

//Displaying The Values Of The Stack
System.out.println("The Content Of The Element is: " + stack);

//Until The Stack is not empty, pop and print elements
while(!stack.isEmpty()) {
	System.out.println("Popped_Items: " + stack.pop());
}

//Displaying The Values Of The Stack
System.out.println("The Content Of The Element is: " + stack); //Null Element Exist In The Stack
	}

}
