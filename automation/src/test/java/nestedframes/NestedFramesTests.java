package nestedframes;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import framework.TestBase;

public class NestedFramesTests extends TestBase{
	NestedFramesPage page;

  @Test
  public void canGetParentText() {
	  Assert.assertEquals(page.getParentText(), "Parent frame");
  }
  @Test
  public void canGetChildText() {
	  Assert.assertEquals(page.getChildText(), "Child Iframe");
  }
  @BeforeMethod
  public void beforeMethod() {
	  this.setup();
	  page = new NestedFramesPage(this.getDriver());
	  page.navigate();
  }

  @AfterMethod
  public void afterMethod() {
	  this.cleanup();
  }

}
