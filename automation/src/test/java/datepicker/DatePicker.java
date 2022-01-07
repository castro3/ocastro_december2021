package datepicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DatePicker extends ControlExtensionBase{
	
	public DatePicker(WebElement element) {
		super(element);
	}
	public void setDate(LocalDate date) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String input = date.format(format);
		WebElement tempElement = element.findElement(By.xpath(".//input[@id='datePickerMonthYearInput']"));
		tempElement.click();
		tempElement.sendKeys(Keys.LEFT_CONTROL, "a");
		tempElement.sendKeys(Keys.BACK_SPACE);
		tempElement.sendKeys(input);
		tempElement.sendKeys(Keys.ENTER);
	}
	public String getDate() {
		return element.findElement(By.xpath(".//input[@id='datePickerMonthYearInput']")).getAttribute("value");
	}
}
