package Java_Sets;
import java.util.*;
public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1 = {1,5,2,6,5,2,12}; //Some Duplicate Datas Are Present
    int[] arr2 = {12,4,3,2,4,15};
    
    //Implements Of Interface Sets And Declared Integer as generic classes/Wrapper Class Objects
    Set<Integer> set1 = new HashSet<Integer>();
    Set<Integer> set2 = new HashSet<Integer>();
    
    //Add Items In Two Different Sets
    for(int item:arr1) {
    	set1.add(item);
    }
    
    //Add Items In Two Different Sets
    for(int item:arr2) {
    	set2.add(item);
    }
    
    //Display Sets
    System.out.println("The First Set is: " + set1);
    System.out.println("The Second Set is: " + set2);
    
    
    //The Union Of Two Sets
    Set<Integer> Union = new HashSet<Integer>(set1);
    Union.addAll(set2);
    System.out.println("The Union Of The Element is: "+ Union);
    
    //The Intersection Of Two Sets 
    Set<Integer> Intersection = new HashSet<Integer>(set1);
    Intersection.retainAll(set2);
    System.out.println("The Intersection Of The Element is: " + Intersection);
    
    //The Difference Of Two Sets
    Set<Integer> Difference = new HashSet<Integer>(set1);
    Difference.removeAll(set2);
    System.out.println("The Difference Of The Element is: " + Difference);
	}

}
