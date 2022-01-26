package modaldialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModalPage {
	
	protected WebDriver driver;
	private final String url = "https://demoqa.com/modal-dialogs";

	public ModalPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(url);
	}
	
	public WebElement findElement(String id) {
		return this.driver.findElement(By.id(id));
	}

	public WebElement findSmallElement() {
		return this.driver.findElement(By.id("showSmallModal"));
	}

	public WebElement findLargeElement() {
		return this.driver.findElement(By.id("showLargeModal"));
	}
}
