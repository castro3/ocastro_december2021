import org.testng.annotations.Test;

import modaldialog.ProgressBarTest.ProgressBarPage;

import org.testng.annotations.BeforeMethod;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ProgressBarTests {

	private WebDriver driver;

	@Test
	public void canClickStartandStop() {
		int input = 9;
		ProgressBarPage progressBar = new ProgressBarPage(this.driver);
		progressBar.navigate();
		progressBar.start();  
		progressBar.stop(input); 

		Assert.assertNotEquals(progressBar.getValue(), 0);
	} 
	@Test
	public void canClickStartandReset() {
		ProgressBarPage progressBar = new ProgressBarPage(this.driver);
		progressBar.navigate();
		progressBar.start();  
		progressBar.reset();

		Assert.assertEquals(progressBar.getValue(), 0);
	}
	@BeforeMethod
	public void setup() {
		canLaunchWebDriver();
	}

	@AfterMethod
	public void cleanup() {
		this.driver.quit();
	}
	public void canLaunchWebDriver() {
		Path resourceDirectory = Paths.get("src","test","resources");
		String absolutePath = resourceDirectory.toFile().getAbsolutePath();
		Path driverFile = Paths.get(absolutePath, "chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", driverFile.toFile().getAbsolutePath());

		this.driver = new ChromeDriver(); 

		long pageLoadTimeout = 3;
		this.driver.manage().timeouts().implicitlyWait(pageLoadTimeout , TimeUnit.SECONDS);
	}  
}