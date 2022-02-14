import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {

	private WebDriver driver;

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getArtistName() {
		return this.driver.findElement(By.cssSelector("div[id='artist']>p>b")).getText();
	}
}
