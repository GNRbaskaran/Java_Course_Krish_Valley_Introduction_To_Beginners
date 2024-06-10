package Java_Character_Type_Data;

public class DataTypes_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   char mychar; //Character Data Types Size 2-Bytes
   
   mychar='A'; //Direct Assign Character A with Single Quote
   
   System.out.println("The Value Of My Char: " + mychar); //display the value of mychar
   
   mychar=70; //ASCII value of a character F
   
   System.out.println("The Value Of My Char: " + mychar);
   
   mychar = '\u0041'; //Unicode HexaDecimal Value for Integer (From 0000 to FFFF)
   
   System.out.println("The Value Of My Char: " + mychar);
	}

}
