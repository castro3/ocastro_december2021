package training;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarTests {
	@Test
	public void canBuildCar() {
		Car corvette = new Car("Corvette");
		corvette.start();
		assertTrue(corvette != null);
	}
	
	@Test
	public void canDriveCar() {
		Car bmw = new Car("BMW");
		bmw.drive();
		assertTrue(bmw.getOdometer()>0);
		assertTrue(bmw != null);
	}
}
