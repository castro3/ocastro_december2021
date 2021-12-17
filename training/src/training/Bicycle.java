package training;

public class Bicycle{

	private int odometer;
	
	public Bicycle() {
		this.odometer = 0;
	}

	public int getOdometer() {
		return odometer;
	}
	
	public void drive() {
		System.out.println("Driving bicycle...");
		odometer++;
	}
}
