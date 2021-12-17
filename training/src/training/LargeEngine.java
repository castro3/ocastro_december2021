package training;

public class LargeEngine implements IEngine {
	private int cylinderCount;
	
	public LargeEngine() {
		this.cylinderCount = 8;
	}
	
	public void Start() {
		System.out.println("Large Engine Started!");
	}

	public int getCylinderCount() {
		return cylinderCount;
	}
}
