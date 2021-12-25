package training;

public class ConvertibleCar extends Car{
	private boolean isTopRaised;
	public ConvertibleCar(String model) {
		super(model);
		this.engine = new SmallEngine();
		this.isTopRaised = false;
	}
	
	public void raiseTop() {
		this.isTopRaised = true;
	}
	
	public void lowerTop() {
		this.isTopRaised = false;
	}
	
	public boolean topStatus() {
		if(this.isTopRaised) {
			System.out.println("Top is up");
			return isTopRaised;
		}else {
			System.out.println("Top is down");
			return isTopRaised;
		}
	}
}
