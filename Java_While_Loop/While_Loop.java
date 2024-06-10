package Java_While_Loop;

public class While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,sum=0;
while(a<10) { //while loop check whether 'a' is less than 10 or not
	System.out.println("The Value Of a: " + a); //print the value of a
	sum=sum+a; //add 'a' with the sum and assign the result into sum again 
	a++; //increase the value of a
}
System.out.println("The Sum Of Numbers From 0 to 9: " + sum);
System.out.println("The Values of a = " + a);
	}

}
