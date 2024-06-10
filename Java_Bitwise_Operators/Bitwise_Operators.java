package Java_Bitwise_Operators;

public class Bitwise_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte val1=12;    //0000 1100
        byte val2=10;    //0000 1010
        byte res;
        
        //12 = 8+4 = 0000 1100 => 1111 0011 => -(0000 1100 + 1) = -(12+1) = -13
        res=(byte)~val1; //BitWise Complement val1
        System.out.println("The Result is: " + res);
        
        res=(byte) (val1 & val2); //Bitwise AND Operation
        System.out.println("The Result is: " + res);
        
        res=(byte) (val1 | val2); //Bitwise OR Operation
        System.out.println("The Result is: " + res);
        
        res=(byte) (val1 ^ val2); //Bitwise XOR Operation
        System.out.println("The Result is: " + res);
        
        // 0000 1100 << 2 = 0011 0000 = 32+16 = 48
        res=(byte) (val1 << 2); //Shift 2 bits to the left
        System.out.println("The Result is: " + res);
        
        // 0000 1100 >> 2 = 0000 0011 = 2+1 = 3
        res=(byte) (val1 >> 2); //Shift 2 bits to the right
        System.out.println("The Result is: " + res);
        
	}

}

