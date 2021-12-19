package training;
public class Car {
	private int odometer;
	public String model;
	public IEngine engine;
	
	public Car(String model) {
		engine = new LargeEngine();
		this.model = model;
	}
	
	public void start() {
		engine.Start();
	}
	
	public int getOdometer() {
		return odometer;
	}
}
