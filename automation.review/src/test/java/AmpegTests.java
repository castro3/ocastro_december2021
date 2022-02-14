import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AmpegTests {
	WebDriver driver;

	@Test
	public void canGetArtistName() {
		String expectedArtist = "Bootsy Collins";
		
		String artist = new Homepage(this.driver)
		.navigate()
		.goToProductsPage()
		.goToProductSeries()
		.goToProductDetails()
		.getArtistName();

		Assert.assertEquals(artist, expectedArtist);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		if (this.driver != null) {
			this.driver.quit();
		}
	}
}
