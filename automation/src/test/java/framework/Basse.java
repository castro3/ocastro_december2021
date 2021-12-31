package framework;

public class Basse {
	
	private String make;
	private String model;
	private int stringCount;
	
	public Basse(String make, String model, int stringCount) {
		this.make = make;
		this.model = model;
		this.stringCount = stringCount;
	}
	
	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getStringCount() {
		return stringCount;
	}
}
