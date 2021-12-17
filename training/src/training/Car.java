package training;

public class Car extends Vehicle{
	public String model;
	public IEngine engine;
	
	public Car(String model) {
		engine = new LargeEngine();
		this.model = model;
	}
	
	public void start() {
		engine.Start();
	}

	@Override
	public void drive() {
		System.out.println("Driving Car...");
		increaseOdometer();
	}
}
