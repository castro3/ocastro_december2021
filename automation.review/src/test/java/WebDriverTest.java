import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WebDriverTest {
	ChromeDriver driver;

	@Test
	public void canLaunchChromeDriver() {
		// arrange
		
		// act
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
		// assert
		Assert.assertNotNull(driver, "ChromeDriver is null");
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
		if (this.driver != null) {
			this.driver.quit();
		}
	}
}
