package Java_String_Functions;

public class String_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="HELLO" , str1 = "Hello";
        
        //length function to get number of characters in the string
        System.out.println("The Length Of The String Is: " + str.length());
        
        //equal method to check both strings are same of not (Case Sensitive)
        if(str.equals(str1)) {
        	System.out.println(str1 + " & " + str1 + " are same ");
        }
        else {
            System.out.println(str1 + " & " + str1 + " are not same ");
        }
        
      //equal method to check both strings are same of not (Case inSensitive)
        if(str.equalsIgnoreCase(str1)) {
        	System.out.println(str1 + " & " + str1 + " are same (ignoring case) ");
        }
        else {
        	System.out.println(str1 + " & " + str1 + " are not same (ignoring case) ");
        }
        
        //find the character at the given index
        System.out.println("The Character At Position 2 is: " + str1.charAt(2));
        
        //compare the first string with second, it returns distance of first mismatched characters
        System.out.println("Comparing " + str + " & " + str1 + " Distance: " + str.compareTo(str1));
        
        //compare the first string with second, it returns distance of first mismatched characters(case insensitive)
        System.out.println("Comparing " + str + " & " + str1 + " Distance(Case InSensitive): " + str.compareToIgnoreCase(str1));
        
        str1= "AABBCABBAA";
        String str2= "JAVA String Functions";
        
        //check whether the string starts with or ends with given substring or not
        System.out.println("The String " + str1 + "is starts with (AAB) : " + str1.startsWith("AAB"));
        System.out.println("The String " + str1 + "is Ends with (AAB) : " + str1.endsWith("ACA"));
        
        //find the location of first and last occurence of a substring
        System.out.println("First Index of (BB) in " + str1 + " is: " +str1.indexOf("BB"));
        System.out.println("Last Index of (BB) in " + str1 + " is: " +str1.lastIndexOf("BB"));
        
        //replacing a substring with new String
        System.out.println("Replacing (ABB) to (XY) of " + str1 + " is: " + str1.replace("ABB","XY"));
        
        //get substring from a given string
        System.out.println("Substring Of " + str2 + "From 5-15 is: " + str2.substring(5,11));
        
        //split the string by using (-) as delimiter
        str1="This is a test string";
        String[] splitArr = str1.split(" ");
        System.out.println("The Splitted Parts Are: ");
        for(String sp : splitArr) { // for each element splitted string set
        	System.out.println(sp);
        }
        
        //trim the blank spaces from starting and ending of the string
        str2 = "       Lot's Of Spaces         ";
        System.out.println("Before Trimming: (" + str2 + ")");
        System.out.println("After Trimming: (" + str2.trim() + ")");
	}

	
}
