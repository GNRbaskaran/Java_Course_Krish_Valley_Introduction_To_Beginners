package Java_Queue;
import java.util.Queue;
import java.util.LinkedList;
public class Queue_in_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue<Integer> queue = new LinkedList<>(); //Queue Object Of Type LinkedList
   
   //Push Items Into Stack
   queue.add(10);
   queue.add(20);
   queue.add(30);
   queue.add(40);
   queue.add(50);
   
   //Display The Size Of The Queue
   System.out.println("The Size Of The Queue is: " + queue.size());
   
   //Display The First Element Of The Queue
   System.out.println("The First Element Of The Queue is: " + queue.peek());
   
   //Display The Contents Of The Queue
   System.out.println("The Content Of The Queue is: " + queue);
   
   //Until The Queue Is Not Empty , remove and print elements
   while(!queue.isEmpty()) {
	   System.out.println("Removed_Items: " + queue.remove());
   }
   
   //Display The Contents Of The Queue
   System.out.println("The Content Of The Queue is: " + queue);
   
   
 /*  System.out.println("The Content Of The Queue is: " + queue.hashCode());
   System.out.println("The Content Of The Queue is: " + queue.toString());
   System.out.println("The Content Of The Queue is: " + queue.element());
   System.out.println("The Content Of The Queue is: " + queue.poll());
   System.out.println("The Content Of The Queue is: " + queue.addAll(queue));
   System.out.println("The Content Of The Queue is: " + queue.containsAll(queue));
   System.out.println("The Content Of The Queue is: " + queue.equals(queue));
   System.out.println("The Content Of The Queue is: " + queue.iterator());
   System.out.println("The Content Of The Queue is: " + queue.offer(null)); */
   //System.out.println("The Content Of The Queue is: " + queue.removeAll(queue));
   //System.out.println("The Content Of The Queue is: " + queue.removeIf(null));
 /*  System.out.println("The Content Of The Queue is: " + queue.spliterator());
   System.out.println("The Content Of The Queue is: " + queue.stream());
   System.out.println("The Content Of The Queue is: " + queue.toArray());
   System.out.println("The Content Of The Queue is: " + queue); */
   //System.out.println("The Content Of The Queue is: " + queue.toArray(queue));
   //System.out.println("The Content Of The Queue is: " + queue.clear());
   //System.out.println("The Content Of The Queue is: " + queue.forEach(queue));
   //System.out.println("The Content Of The Queue is: " + queue.notify());
   //System.out.println("The Content Of The Queue is: " + queue.notifyAll());
   //System.out.println("The Content Of The Queue is: " + queue.wait());
	}

}
