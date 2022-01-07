package ProgressBarTest;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ProgressBarTests {
	
	private WebDriver driver;
  
@Test
  public void canClickStartandWait() {
	ProgressBarStart progressBarStart = new ProgressBarStart(this.driver);
	progressBarStart.start();  
	progressBarStart.reset();
	
	AssertJUnit.assertEquals(driver.findElement(By.xpath(".//div[@role='progressbar']")).getText(),"0%");
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
		  String driverPath = "/Users/tealek.alnutt/Downloads/chromedriver";
		  System.setProperty("webdriver.chrome.driver", driverPath);

		  String url = "https://demoqa.com/progress-bar";
		  driver = new ChromeDriver();

		  driver.navigate().to(url);
		  String currentURL = driver.getCurrentUrl();
		  AssertJUnit.assertEquals(url, currentURL);
	  }  
}