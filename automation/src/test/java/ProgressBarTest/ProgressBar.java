
package ProgressBarTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProgressBar {
	private WebElement element;

	public ProgressBar(WebElement element) {
		this.element = element;
	}
	public void startStop() {
		element.findElement(By.xpath(".//button[@id='startStopButton']")).click();
	}
	public void reset() {
		element.findElement(By.xpath(".//button[@id='resetButton']")).click();
	}
	public String getValue() {
		return element.findElement(By.xpath(".//div[@role='progressbar']")).getAttribute("aria-valuenow");
	}
}
