package datepicker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerPage extends PageObjectBase{
	DatePicker date;
	DateTimePicker dateTime;
	
	public DatePickerPage(WebDriver driver) {
		super(driver);
		url = "https://demoqa.com/date-picker";
	}
	@Override
	public void navigate() {
		this.driver.navigate().to(url);
		element = this.findElement();
		date = new DatePicker(getElement());
		dateTime = new DateTimePicker(getElement());
	}
	@Override
	protected WebElement findElement() {
		date = new DatePicker(getElement());
		dateTime = new DateTimePicker(getElement());
		WebElement element = this.driver.findElement(By.xpath(".//div[@id='datePickerContainer']"));
		
		WebDriverWait wait = new WebDriverWait(this.driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		return element;
	}
	public void setDate(LocalDate date) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String input = date.format(format);
		this.date.setDate(input);
	}
	public String getDate() {
		return date.getDate();
	}
	public void setDateTime(LocalDateTime dateTime) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");
		String input = dateTime.format(format);
		this.dateTime.setDateTime(input);
	}
	public String getDateTime() {
		return dateTime.getDateTime();
	}

}