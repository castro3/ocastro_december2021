package training;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicycleTest {

	@Test
	public void canDriveBicycle() {
		Bicycle bmx = new Bicycle();
		bmx.drive();
		assertTrue(bmx.getOdometer() > 0);
		assertTrue(bmx != null);
	}
}
