import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import framework.TestBase;

public class ControlExtensionsTest extends TestBase{
  @Test
  public void canCreateRadioButtonExtension() {
	  final String url = "https://demoqa.com/radio-button";
	  getDriver().navigate().to(url);
	  String selection = "";
	  RadioButton radioButton = new RadioButton(getDriver());
	  radioButton.select("Yes");
	  selection = radioButton.getSelected();
	  Assert.assertEquals(selection, "Yes");
	  System.out.println(selection);
	  
	  radioButton.select("Impressive");
	  selection = radioButton.getSelected();
	  Assert.assertEquals(selection, "Impressive");
	  System.out.println(selection);
	  
	  radioButton.select("No");
	  selection = radioButton.getSelected();
	  Assert.assertEquals(selection, "No");
	  System.out.println(selection);
	  
  }
  
  @BeforeMethod
	public void setup() {
		super.setup();
	}

	@AfterMethod
	public void cleanup() {
		super.cleanup();
	}
}
