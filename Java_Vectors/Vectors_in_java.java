package Java_Vectors;
import java.util.Vector;
public class Vectors_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> numvector = new Vector<>();

//Inserting the Values In numvector[Vector]
numvector.add(10);
numvector.add(20);
numvector.add(30);
numvector.add(40);
numvector.add(50);

//Display The Size Of The Vector
System.out.println("The  Size Of The Vector is: " + numvector.size());

//Display The Content Of The Vector
System.out.println("The Value Of NumVector is: " + numvector);

//Display The Content Vector One By One
for(Integer vector:numvector) {
	System.out.println(vector);
}

//Insert The Vector in the position 3
numvector.add(3,100);

//Display The Content Of The Vector
System.out.println("The Value Of NumVector is: " + numvector);

//Display The Size Of The Vector
System.out.println("The Size Of The NumVector is: " + numvector.size());
	}

}
