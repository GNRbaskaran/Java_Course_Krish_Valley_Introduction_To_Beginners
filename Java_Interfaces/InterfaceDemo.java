package Java_Interfaces;
interface Vehicle { //create an interface with some properties of Vehicle
	//methods will not be defined in the interfaces
	double maxSpeed();
	void wheelCount();
}

class Bike implements Vehicle{
	int wheel = 2;
	@Override
	public double maxSpeed() { //returns the max speed of the bike
		return 150;
	}
	
	@Override
	public void wheelCount() { //display number of wheels
		System.out.println("Number Of Wheels for bike: " + wheel);
	}
}

class Car implements Vehicle{
	int wheel = 4;
	@Override
	public double maxSpeed() { //returns the max speed of the car
		return 200;
	}
	
	@Override
	public void wheelCount() { //Display Number Of Wheels
		System.out.println("Number Of Wheels For car: " + wheel);
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bike bike = new Bike();
    Car car = new Car();
    
    System.out.println("Maximum speed of bike: " + bike.maxSpeed());
    bike.wheelCount();
    System.out.println("Maximum speed of car: " + car.maxSpeed());
    car.wheelCount();
	}

}
