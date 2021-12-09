package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTests {

	@Test
	public void canBuildCar() {
		Car corvette = new Car("Corvette");
		corvette.start();
	}

}
