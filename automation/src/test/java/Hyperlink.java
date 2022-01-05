import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hyperlink {
	
	private WebDriver driver;

	public Hyperlink(WebDriver driver) {
		this.driver = driver;
	}

	public void click(String string) {
		driver.findElement(By.id(string)).click();
		String linkResponse = "linkResponse";
		driver.findElement(By.id(linkResponse)).toString();
	}

}
