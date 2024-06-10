package Java_Array;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] intArr = {10,20,30,40,50}; //Five Values Are Stored Directly In The Array
    
    float[] floatArr = new float[5]; //Float Type Array Created Whose Size Is 5
    
    char charArr[] = new char[5]; //An Array Of Character Stores Five Elements
    
    Scanner sc = new Scanner(System.in);
    
    //manually assign different float values in the array, indexes are starting from 0
    floatArr[0] = 2.5F;
    floatArr[1] = 7.23F;
    floatArr[2] = 5.6F;
    floatArr[3] = 8F;
    floatArr[4] = 7.125F;
    
    for(int i=0; i<charArr.length; i++) {
    	System.out.print("Enter Character for Index (" + i + "): ");
    	charArr[i] = sc.next().charAt(0); //take input and store to character array
    }
    System.out.println("Items Of Integer Array: ");
    for(int i=0;i<intArr.length;i++) {
    	System.out.print(intArr[i] + " "); //display array content using for loop
    }
    System.out.println(); //used to go for next line
    
    System.out.println("Items Of Float Array: ");
    for(float item: floatArr) {
    	System.out.print(item + " "); //display array content using for - each loop
    }
    System.out.println(); //Used To Go For Next Line
    
    System.out.println("Items Of Character Array: ");
    for(char ch: charArr) {
    	System.out.print(ch + " "); //display array content using for-each loop
    }
    sc.close();
	}

}
