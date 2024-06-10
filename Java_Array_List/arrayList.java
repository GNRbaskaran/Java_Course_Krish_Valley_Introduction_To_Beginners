package Java_Array_List;
import java.util.ArrayList;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<String> cityList = new ArrayList<>(); //create an array list for string type object
    
    //Add Items in The Array List
    cityList.add("Delhi");
    cityList.add("Kolkatha");
    cityList.add("Hyderabad");
    cityList.add("Chennai");
    cityList.add("Lucknow");
	
    System.out.println("The Size Of The Array List: " + cityList.size());
    
    //display The Content Of The ArrayList
    System.out.println("Cities:" + cityList);
    
    //display The Content Of The Array List One By One
    for(String City: cityList) {
    	System.out.println(City);
    }
    
    //insert another city at the index 2 in city list
    cityList.add(2,"Mumbai");
    
    System.out.println("Cities: " + cityList);
	}


}
