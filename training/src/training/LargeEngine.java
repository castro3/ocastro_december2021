package training;

public class LargeEngine implements IEngine {
	int cylinderCount;
	
	public void Start() {
		System.out.println("Engine Started!");
	}

	public int getCylinderCount() {
		return cylinderCount;
	}
}
