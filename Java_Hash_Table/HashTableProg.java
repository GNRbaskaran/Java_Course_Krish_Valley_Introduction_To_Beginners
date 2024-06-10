package Java_Hash_Table;
import java.util.Hashtable;
public class HashTableProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Hashtable<String,Integer> stHash = new Hashtable<String,Integer>();
   
   //put names and marks in the hash table
   stHash.put("Ayan", 65);
   stHash.put("Dipak", 80);
   stHash.put("Joy", 55);
   stHash.put("Tarun", 75);
   stHash.put("Rahul", 70);
   
   System.out.println("The Student HashTable: \n" + stHash + "\n\n");
   String maxKey = "";
   int maxMark = 0;
   for(String key : stHash.keySet()) { //for all keys in the keyset
	   if(maxMark < stHash.get(key)) {
		   maxKey = key;
		   maxMark = stHash.get(key);
	   }
   }
   System.out.println("The Student: " + maxKey + " got highest marks, marks: " + maxMark);
	}

}
