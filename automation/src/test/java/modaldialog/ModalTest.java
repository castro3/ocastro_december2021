package modaldialog;
import org.testng.annotations.Test;

import framework.ModalDialog;
import framework.TestBase;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ModalTest extends TestBase {
	
	public ModalPage page;
			
  @Test
  public void canClickSmallModal() {
	  WebElement element = this.getDriver().findElement(By.id("showSmallModal"));
	  ModalDialog smallModal = new ModalDialog(element);
	  smallModal.click();
	  Assert.assertEquals(smallModal.getModalBody(), "This is a small modal. It has very less content");
	  smallModal.close();
  }
  
  @Test
  public void canClickLargeModal() {
	  WebElement element = this.getDriver().findElement(By.id("showLargeModal"));
	  ModalDialog largeModal = new ModalDialog(element);
	  largeModal.click();
	  Assert.assertEquals(largeModal.getModalBody(), "Lorem Ipsum is simply dummy text of the printing "
	  		+ "and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever "
	  		+ "since the 1500s, when an unknown printer took a galley of type and scrambled it to make "
	  		+ "a type specimen book. It has survived not only five centuries, but also the leap into "
	  		+ "electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s "
	  		+ "with the release of Letraset sheets containing Lorem Ipsum passages, and more recently "
	  		+ "with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
	  largeModal.close();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  this.setup();
	  page = new ModalPage(this.getDriver());
  }

  @AfterMethod
  public void afterMethod() {
	  this.cleanup();
  }

}
