package Java_Polymorphism_Function_Overriding;
class Animal{
	public void movement() { //Define Movement Method In The Parent Class
		System.out.println("Animals Can Move!");
	}
}
class Dog extends Animal{
	@Override
	public void movement() { //Redefine The Movement Method For The Dog Class
		System.out.println("Dogs Can Walk And Run Also!\n");
	}
}
class Frog extends Animal{
	@Override
	public void movement() { //Redefine Movement Method
		System.out.println("Calling From Parent Class!");
		super.movement(); //Call The Movement Method Of The Parent Class first
		//Then Print The Current Movement Method
		System.out.println("Frogs can Jump! \n");
	}
}
public class Polymorphism_Function_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal animal = new Animal(); //set animal as object of Animal class
    animal.movement();
    
    //set animal reference variable to point Dog object
    animal = new Dog();
    animal.movement();
    
    //set animal reference variable to point Frog object
    animal = new Frog();
    animal.movement();
	}

}
