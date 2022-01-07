package ProgressBarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarStart {
	private WebElement startButton;
	private WebDriver driver;
	
	public ProgressBarStart(WebDriver driver) {
		this.driver=driver;
		
		 startButton = driver.findElement(By.xpath(".//button[@id='startStopButton']"));
	}
	public void start() {
	
		startButton.click();
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		wait.until(ExpectedConditions.attributeToBe(By.xpath(".//div[@role='progressbar']"),"aria-valuenow" , "100"));

	}
	public void reset() {
		driver.findElement(By.xpath(".//button[@id='resetButton']")).click();
	}
}
