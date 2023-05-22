package n1ejercicio2Coches;

public class Car {
	
	private final static String MAKE;
	private static String model;
	private final int power;
	
	static {					//must be called in a static method in order to access and assign value
		MAKE = "ford";
		model = "focus";
	}
	
	public Car (int power) {
		this.power = power;
	}
	
	public String getMake() {
		return MAKE;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPower() {
		return power;
	}
	
	static void brake() {
		System.out.println("The vehicle is braking.");
	}
	
	public void accelerate() {
		System.out.println("The vehicle is accelerating.");
	}
	
	public String toString() {
		return "The make of the car is: " + MAKE + ".\r"
				+ "The model of the car is: " + model + ".\r"
				+ "The power of the car is: " + power + ".\r";
	}

}
