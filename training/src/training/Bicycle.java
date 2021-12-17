package training;

public class Bicycle extends Vehicle{
	public Bicycle() {
		
	}
	
	public void drive() {
		System.out.println("Driving bicycle...");
		increaseOdometer();
	}
}
