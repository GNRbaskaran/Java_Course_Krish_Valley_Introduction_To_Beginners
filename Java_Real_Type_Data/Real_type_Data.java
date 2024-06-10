package Java_Real_Type_Data;

public class Real_type_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float myFloat;	//Floating Type Data, size 4-Bytes
    
	myFloat = 50.26F; //The letter F or f is needed to represent as float
    System.out.println("The Value Of myFloat: " + myFloat); //Display The Value Of myFloat
    
    myFloat = (float)50/3; //Type Casting To Change Integer To Float
    System.out.println("The Value Of myFloat: " + myFloat);
    
    double myDouble; //Also Floating type data, size is 8-bytes
    myDouble = -0.2356; //We can use D or d to represent double.
    System.out.println("The Value Of myDouble: " + myDouble);
    
    myDouble = /*(double)*/22D/7; //converting 22 as double
    System.out.println("The Value Of myDouble: " + myDouble);
	}

}
