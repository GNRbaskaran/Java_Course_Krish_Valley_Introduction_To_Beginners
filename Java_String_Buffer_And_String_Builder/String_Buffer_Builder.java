package Java_String_Buffer_And_String_Builder;

public class String_Buffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //The Default Of The Capacity is 16
	StringBuffer sBuffer = new StringBuffer();
    System.out.println("The Capacity Of StringBuffer is: " + sBuffer.capacity());
    
    //the Default Capacity + Length Of The sBuffer
    sBuffer=new StringBuffer("My String Buffer");
    System.out.println("The Capacity Of The String Buffer is: " + sBuffer.capacity());
    
    //Return The Value Of The String Buffer
    System.out.println("The String Buffer is: " + sBuffer);
    
    //String Builder is same as string Buffer
    StringBuilder sBuilder = new StringBuilder();
    sBuilder=new StringBuilder("My String Builder");
    
    //Return The Value Of String Builder
    System.out.println("The StringBuilder is: " + sBuilder);
    
    //append the value of Both String Builder And String Buffer
    sBuffer.append(". Appended With String Buffer");
    sBuilder.append(". Appended With String Builder");
    System.out.println("After Appending The String Buffer: " + sBuffer);
    System.out.println("After Appending The String Builder: " + sBuilder);
    
    //Inserting The Values Of Both String Buffer And String Builder
    sBuffer = new StringBuffer("pqrst");
    sBuilder = new StringBuilder("abaabcabac");
    sBuffer.insert(3, "AAABBBCCC");
    sBuilder.insert(4, "HGANRASNHEISTWHAARAN");
    System.out.println("After Inserting The Position In String Buffer: " + sBuffer);
    System.out.println("After Inserting The Position In String Builder: " + sBuilder);
    
    //Reverse The String
    System.out.println("Reversed StringBuffer: " + sBuffer.reverse());
    System.out.println("Reversed StringBuilder: " + sBuilder.reverse());
	}

}
