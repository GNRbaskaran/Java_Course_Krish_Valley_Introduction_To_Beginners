package Java_Hash_Map;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<Integer,String> employeeHash = new HashMap<Integer,String>();
   
   //add items in the hashmap
   employeeHash.put(12, "Programmer");
   employeeHash.put(14, "Instructor");
   employeeHash.put(18, "Tester");
   employeeHash.put(13, "Programmer");
   employeeHash.put(21, "Casual");
   employeeHash.put(21, "Debugger");
   
   
   System.out.println("The Employee Hash Map: \n" + employeeHash + "\n\n");
   
   if(employeeHash.containsKey(18)) { //Checking The Key is present or not in the hashmap
	   System.out.println("The Type Of Employee: " + employeeHash.get(18));
   }
   else {
	   System.out.println("The Key Is Not Found!");
   }
	}

}
