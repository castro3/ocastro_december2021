package datepicker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DateTimePicker extends ControlExtensionBase{

	public DateTimePicker(WebElement element) {
		super(element);
		// TODO Auto-generated constructor stub
	}
	public void setDateTime(LocalDateTime dateTime) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");
		String input = dateTime.format(format);
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
