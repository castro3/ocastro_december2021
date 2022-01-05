import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Slider {
	
	private WebDriver driver;

	public Slider(WebDriver driver) {
		this.driver = driver;
	}

	public void setValue(int values) {
		driver.findElement(By.id("sliderValue")).sendKeys("value", String.valueOf(values));
		
	}

	public String getValue() {
		return driver.findElement(By.id("sliderValue")).getAttribute("value");
	}

}
