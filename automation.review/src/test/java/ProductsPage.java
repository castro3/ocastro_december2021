import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {

	private WebDriver driver;

	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	public ProductSeriesPage goToProductSeries() {
		this.driver.findElement(By.xpath("//img[@alt='Classic Series: Bass heads & enclosures']")).click();
		return new ProductSeriesPage(this.driver);
	}
}
