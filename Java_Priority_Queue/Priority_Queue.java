package Java_Priority_Queue;
import java.util.*;
class Student implements Comparable<Student>{
	private int rank;
	private String name;
	public Student(String name,int rank) { //constructor to set name and rank of the student
		this.rank = rank;
		this.name = name;
	}
	@Override
	public int compareTo(Student st) { //compare rank of the student with another srudent
		if(rank<st.rank) {
			return -1;
		}	
			else if(rank > st.rank) {
				return 1;
			}
			return 0;
		}
	@Override
	public String toString() {
		String result = "Student name: " + name + ", rank: " + rank;
		return result;
	}
	}
public class Priority_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Student> studentQ = new PriorityQueue<>();
		
		
		studentQ.add(new Student("Asish", 5));
		studentQ.add(new Student("Barun", 3));
		studentQ.add(new Student("Manish", 1));
		studentQ.add(new Student("Souvik", 4));
		studentQ.add(new Student("Rahul", 2));
		
		System.out.println("Size Of The Queue: " + studentQ.size());
		
		Iterator<Student> it = studentQ.iterator(); //iterator to iterate through queue
		while(it.hasNext()) {
			//delete and display the first element from the queue
			System.out.println("The Item Of The Queue: " + studentQ.poll().toString());
		}

	}

}