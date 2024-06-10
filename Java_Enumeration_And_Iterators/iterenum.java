package Java_Enumeration_And_Iterators;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Iterator;
public class iterenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] wordArr = {"Book", "Number" , "Place", "Lemon", "Apple", "Tree"};

Vector<String> wordList = new Vector<>(Arrays.asList(wordArr)); //direct convert array to vector

System.out.println("\n The Word list: \n" + wordList + "\n");

Enumeration<String> vectorEnum = wordList.elements(); //enumeration iterates through vector

//show elements one by one
while(vectorEnum.hasMoreElements()) { //when vectorEnum has more element to get
	System.out.println(vectorEnum.nextElement());
}

LinkedList<String> wordLinkedList = new LinkedList<>();
wordLinkedList.addAll(wordList); //add elements from vector to linked list
//add some additional items
wordLinkedList.add("Ball");
wordLinkedList.add("Mango");

System.out.println("\n The word list (LinkedList): \n" + wordLinkedList + "\n");

Iterator<String> it = wordLinkedList.iterator(); //the iterator it will point elements of the linked list
//show elements one by one
while(it.hasNext()) { //when vectorEnum has more element to get
	System.out.println(it.next());
}
}

}
