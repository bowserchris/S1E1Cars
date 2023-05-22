package n1ejercicio2Coches;

public class App {

	public static void main(String[] args) {
		
		Car.brake();				//method doesnt require an object but needs a class
		
		Car car = new Car(1200);
	
		car.accelerate();			//method requires an object to be created
		
		System.out.println(car);

	}

}

/*
Create a class "Car" with the attributes: make, model and power. Brand must be static final, 
model static and power final. Show the difference between the three. Is there one that can be 
initialized in the class constructor?

Add two methods to the "Car" class. A static method called slow() and a non-static method called
 accelerate(). The accelerate method must show by console: "The vehicle is accelerating" and the
  brake() method must show: "The vehicle is braking".

Demonstrate how to invoke static and non-static method from main() of main class.

*/