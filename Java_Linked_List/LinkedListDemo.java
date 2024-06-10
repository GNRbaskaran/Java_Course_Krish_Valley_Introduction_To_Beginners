package Java_Linked_List;

import java.util.LinkedList;

import java.util.ArrayList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//create a linked list for integer type data
		LinkedList<Integer> intList = new LinkedList<>();
		
		//insert integer data into the list
		intList.add(10);
		intList.add(20);
		intList.add(30);
		intList.add(40);
		intList.add(50);
		
		System.out.println("The Linked List Size: " + intList.size() + "\n content: " + intList + "\n");
		
		int[] array = {5, 15, 30, 80, 60, 25}; //an array of integers
		
		//create another array list with all of the items in the list
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int item : array) {
			arrList.add(item);
		}
		
		System.out.println("The Array List Size: " + arrList.size() + "\n content: " + arrList + "\n");
		
		//add arrayList directly to the linked list, at the index, 2
		intList.addAll(2, arrList);
		
		System.out.println("The Linked list size: " + intList.size() + "\n content: " + intList + "\n");
	}

}
