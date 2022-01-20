package crossbrowser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class CrossBrowserTest extends TestBase {
  @Test
  public void canLaunchEdgeBrowser() {
	  String browser = "edge";
	  Assert.assertEquals(this.getBrowserType(), browser);
  }
  
  @Test
  public void canLaunchChromeBrowser() {
	  String browser = "chrome";
	  Assert.assertEquals(this.getBrowserType(), browser);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  this.setup();
  }

  @AfterMethod
  public void afterMethod() {
	  this.cleanup();
  }
}
