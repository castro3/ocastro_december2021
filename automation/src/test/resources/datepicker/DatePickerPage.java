package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage extends PageObjectBase{

	public DatePickerPage(WebDriver driver) {
		super(driver);
		url = "https://demoqa.com/date-picker";
	}

	@Override
	protected WebElement findElement() {
		WebElement element = this.driver.findElement(By.xpath(".//div[@id='datePickerContainer']"));
		
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		return element;
	}

}