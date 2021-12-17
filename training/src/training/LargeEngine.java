package training;

public class LargeEngine implements IEngine {
	int cylinderCount;
	
	@Override
	public void Start() {
		System.out.println("Engine Started!");
	}

	@Override
	public int getCylinderCount() {
		return cylinderCount;
	}
}
