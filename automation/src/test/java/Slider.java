import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Slider {
	private WebDriver driver;
	private final String url = "https://demoqa.com/slider";

	public Slider(WebDriver driver) {
		this.driver = driver;
		this.driver.navigate().to(url);
	}

	public void setValue(String value) {
		WebElement element = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
		JavascriptExecutor jse = (JavascriptExecutor)this.driver;
		jse.executeScript("arguments[0].value='"+value+"';", element);
	}

	public String getValue() {
		return driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']")).getAttribute("value");
	}
}
