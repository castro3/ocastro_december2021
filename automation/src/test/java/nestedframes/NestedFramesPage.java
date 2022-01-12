package nestedframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import datepicker.PageObjectBase;

public class NestedFramesPage extends PageObjectBase{

	public NestedFramesPage(WebDriver driver) {
		super(driver);
		url = "https://demoqa.com/nestedframes";
	}
	
	@Override
	protected WebElement findElement() {
		WebElement element = this.driver.findElement(By.xpath(".//div[@id='frame1Wrapper']"));
		
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		return element;
	}
	
	public String getParentText() {
		return driver.switchTo().frame("frame1").findElement(By.xpath(".//body")).getText();

	}
	public String getChildText() {
		return driver.switchTo().frame("frame1").switchTo().frame(0).findElement(By.xpath(".//p")).getText();
	}
}
