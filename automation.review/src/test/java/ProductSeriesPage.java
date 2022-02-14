import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSeriesPage extends PageObject {

	public ProductSeriesPage(WebDriver driver) {
		super(driver);
	}

	public ProductDetailsPage goToProductDetails() {
		this.getDriver().findElement(By.xpath("//a[@href='svt810e/']")).click();
		return new ProductDetailsPage(this.getDriver());
	}
}
