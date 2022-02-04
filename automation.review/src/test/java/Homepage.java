import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	private WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	public Homepage navigate() {
		this.driver.navigate().to("https://ampeg.com/index.html");
		return this;
	}

	public ProductsPage goToProductsPage() {
		this.driver.findElement(By.xpath("//a[@title='Products']")).click();
		return new ProductsPage(this.driver);
	}
}
