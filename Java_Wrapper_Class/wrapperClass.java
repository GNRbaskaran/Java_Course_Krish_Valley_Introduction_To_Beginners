package Java_Wrapper_Class;

public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int val=10;  //integer variable
    int res;
    
    //create Integer type object using int
    @SuppressWarnings("removal") 
	Integer integer = new Integer(val);
    res = integer.intValue();   //getting the int value from the Integer class Object
    System.out.println("The Value Of Res: " + res);
    
    Integer myInt = 50;  //automatically converts to myInt = new Integer(50)
    System.out.println("The Value Of myInt: " + myInt); //internally it uses myInt.intValue()
    
    res = Integer.parseInt("123"); //The String '123' is converted to integer 123
    System.out.println("The Value Of Res After Increasing: " + ++res);
    
    res = Integer.parseInt("FE", 16); //converting string to integer assuming string is in Hexadecimal form
    System.out.println("The Value Of Res: " + res); 
    /*              1             0
     * FE = 15 x 16    +  14 x 16     = 240 + 14 = 254   [F=15,E=14]
     */
    //use wrapper class to convert number to binary and hexadecimal form
    System.out.println("The Binary Of 91: " + Long.toBinaryString(91)); //here Long Wrapper class is used
    /*
     * (91)  =  64 + 16 + 8 + 2 + 1 = (1011011)
     *     2                                   2
     */
    System.out.println("The HexaDecimal Of 91: " + Long.toHexString(91));
    /*
     *                  1
     * (91)   =  5 x 16   + 11 = 91 => 5b   [b=11]
     *     16
     */
    String intString = integer.toString(); //integer is converted to string type variable
    System.out.println("The Value Of intString: " + intString);
	}

}
