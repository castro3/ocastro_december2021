import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestNGTest {
	WebDriver driver;
	WebDriver driver2;

	@Test
	public void canLaunchChromeDriver() {
		this.driver.navigate().to("https://ampeg.com/index.html");
	}
	
	@DataProvider(name = "getUrl")
	public Object[] getUrl() {
		return new Object [] { "https://ampeg.com/index.html"};
	}

	@Test(dataProvider = "getUrl")
	public void canLaunchChromeDriverAndClickProduct(String url) {
		this.driver2.navigate().to(url);
		this.driver2.findElement(By.xpath("//a[@title='Products']")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver2 = new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		this.driver.quit();
		this.driver2.quit();
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Starting Test Executions...");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Ending Test Executions...");
	}
}
