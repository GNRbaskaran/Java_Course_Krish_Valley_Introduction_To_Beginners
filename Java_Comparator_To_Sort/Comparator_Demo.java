package Java_Comparator_To_Sort;
import java.util.ArrayList;
import java.util.Comparator;

class StringCompare implements Comparator<String>{ //Class to compare two strings for sorting lists

	@Override
	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		return str1.compareTo(str2); //use compareto method to compare second string with first string
	}
	
}
public class Comparator_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cityList = new ArrayList<String>(); //create an array list for string type object

//Add Items In The Array List
cityList.add("Delhi");
cityList.add("Kolkata");
cityList.add("Hyderabad");
cityList.add("Chennai");
cityList.add("Lucknow");

System.out.println("Cities Unsorted: " + cityList);

//sort the lists in alphabetical order
cityList.sort(new StringCompare()); //new string comparator object to compare

System.out.println("Cities Sorted: " + cityList);
	}

}
