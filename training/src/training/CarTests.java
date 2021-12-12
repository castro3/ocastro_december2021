package training;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;
public class CarTests {
	@Test
	public void canBuildCar() {
		Car corvette = new Car("Corvette");
		assertEquals(corvette.getClass(), Car.class);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output));
		corvette.start();
		assertEquals("Engine Started!", output.toString().trim());
	}
}
