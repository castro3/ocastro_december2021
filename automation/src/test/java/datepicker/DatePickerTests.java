package datepicker;

import org.testng.annotations.Test;

import framework.TestBase;
import org.testng.annotations.BeforeMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DatePickerTests extends TestBase{
	DatePickerPage page;

  @Test
  public void canSelectDate() {
	  LocalDate dateIn = LocalDate.of(1234, 12, 30);
	  page.setDate(dateIn);
	  
	  DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	  Assert.assertEquals(page.getDate(), dateIn.format(format));
  }
  @Test
  public void canSetDateAndTime() {
	  LocalDateTime dateTimeIn = LocalDateTime.of(1234, 12, 30, 4, 56);
	  page.setDateTime(dateTimeIn);
	  
	  DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");
	  Assert.assertEquals(page.getDateTime(), dateTimeIn.format(format));
  }
  @BeforeMethod
  public void beforeMethod() {
	  this.setup();
	  page = new DatePickerPage(this.getDriver());
	  page.navigate();
  }

  @AfterMethod
  public void afterMethod() {
	  this.cleanup();
  }

}
