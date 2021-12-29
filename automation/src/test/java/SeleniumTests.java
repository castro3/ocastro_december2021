import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTests {
	private ChromeDriver driver;
	private String url = "https://www.selenium.dev";
	
  @Test
  public void canLaunchWebDriver() {
	  String currentURL = driver.getCurrentUrl();
	  Assert.assertEquals(currentURL, this.url);
  }
  
  @Test
  public void canClickButton() {
	  WebElement element = driver.findElement(By.cssSelector("a[href='/documentation/webdriver/']"));
	  element.click();
  }
  
  @BeforeMethod
	public void setup() {
	  String driverPath = "D:\\Downloads\\chromedriver_win32\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();

		driver.navigate().to(this.url);
	}

	@AfterMethod
	public void cleanup() {
		this.driver.quit();
	}
}
