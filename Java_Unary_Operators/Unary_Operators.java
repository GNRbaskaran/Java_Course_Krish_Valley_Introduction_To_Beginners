package Java_Unary_Operators;
//import java.util.*;
public class Unary_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int var1,var2;
    var1=50;  //assign 50 into var1
    var2=-var1; //Unary Operator to invert the sign of the value of var1
    System.out.println("The Var1=" + var1 + ",var2=" + var2);
    var1=50;
    var2=var1++; //post Incrementing store previous value,then increases var1 by 1
    System.out.println("The Var1=" + var1 + ",var2=" + var2);
    var1=50;
    var2=++var1; //pre-Incrementing,increase var1 by 1,then assign to var2
    System.out.println("The Var1=" + var1 + ",var2=" + var2);
    var1=50;
    var2=var1--; //post Decrementing store previous value,then Decreases var1 by 1
    System.out.println("The Var1=" + var1 + ",var2=" + var2);
    var1=50;
    var2=--var1; //pre-Decrementing,Decrease var1 by 1,then assign to var2
    System.out.println("The Var1=" + var1 + ",var2=" + var2);
    boolean bool1,result;
    bool1=true; //assign as true
    result=!bool1; //not operator will invert the value of boolean variables
    System.out.println("The Bool1 Is:" + bool1);
    System.out.println("The Result Is:" + result);
	}

}
