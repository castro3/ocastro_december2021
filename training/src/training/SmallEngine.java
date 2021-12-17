package training;

public class SmallEngine implements IEngine {
	private int cylinderCount;
	
	public SmallEngine() {
		this.cylinderCount = 4;
	}
	
	@Override
	public void Start() {
		System.out.println("Small Engine started!");
	}

	@Override
	public int getCylinderCount() {
		return cylinderCount;
	}

}
