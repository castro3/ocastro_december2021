package modaldialog;
import org.openqa.selenium.WebDriver;

public class ModalPage {
	
	protected WebDriver driver;
	private final String url = "https://demoqa.com/modal-dialogs";

	public ModalPage(WebDriver driver) {
		this.driver = driver;
		driver.navigate().to(url);
	}

}
