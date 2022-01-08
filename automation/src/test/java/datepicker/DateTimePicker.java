package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DateTimePicker extends ControlExtensionBase{

	public DateTimePicker(WebElement element) {
		super(element);
		// TODO Auto-generated constructor stub
	}
	public void setDateTime(String input) {
		WebElement tempElement = element.findElement(By.xpath(".//input[@id='dateAndTimePickerInput']"));
		tempElement.click();
		tempElement.sendKeys(Keys.LEFT_CONTROL, "a");
		tempElement.sendKeys(Keys.BACK_SPACE);
		tempElement.sendKeys(input);
		tempElement.sendKeys(Keys.ENTER);
	}
	public String getDateTime() {
		return element.findElement(By.xpath(".//input[@id='dateAndTimePickerInput']")).getAttribute("value");
	}

}
