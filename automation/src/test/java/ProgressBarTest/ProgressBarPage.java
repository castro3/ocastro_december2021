package modaldialog.ProgressBarTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage {
	private WebElement element;
	private WebDriver driver;
	ProgressBar progressBar;

	public ProgressBarPage(WebDriver driver) {
		this.driver=driver;
	}
	public void navigate() {
		this.driver.navigate().to("https://demoqa.com/progress-bar");
		element = driver.findElement(By.xpath(".//div[@id='progressBarContainer']"));
		progressBar = new ProgressBar(element);
	}
	public void start() {
		progressBar.startStop();
	}
	public void stop(int time) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(time, TimeUnit.SECONDS);
		wait.pollingEvery(time, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);

		wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.xpath(".//div[@role='progressbar']"),"aria-valuenow" , "0")));
		progressBar.startStop();
	}
	public void reset() {
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		wait.until(ExpectedConditions.attributeToBe(By.xpath(".//div[@role='progressbar']"),"aria-valuenow" , "100"));

		progressBar.reset();
	}
	public int getValue() {
		return Integer.parseInt(progressBar.getValue());
	}
}