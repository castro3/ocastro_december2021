package training;

public abstract class Vehicle {
	private int odometer = 0;

	public int getOdometer() {
		return odometer;
	}
	
	public void increaseOdometer() {
		odometer++;
	}
	
	abstract void drive();	
}
