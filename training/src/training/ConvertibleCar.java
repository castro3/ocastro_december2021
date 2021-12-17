package training;

public class ConvertibleCar extends Car{
	public ConvertibleCar(String model) {
		super(model);
		this.engine = new SmallEngine();
	}
}
