import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyperlink {
	private WebDriver driver;
	private final String url = "https://demoqa.com/links";

	public Hyperlink(WebDriver driver) {
		this.driver = driver;
		this.driver.navigate().to(url);
	}

	public void click(String string) {
		driver.findElement(By.id(string)).click();
	}
}
