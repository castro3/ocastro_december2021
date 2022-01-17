import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import framework.TestBase;

public class ControlExtensionsTest extends TestBase{
  @Test
  public void canSelectRadioButton() {
	  RadioButton radioButton = new RadioButton(getDriver());
	  radioButton.select("Yes");
	  Assert.assertEquals(radioButton.getSelected(), "Yes");
	  radioButton.select("Impressive");
	  Assert.assertEquals(radioButton.getSelected(), "Impressive");
	  radioButton.select("No");
	  Assert.assertEquals(radioButton.getSelected(), "No");
  }
  
  @Test
  public void canClickHyperLink() {
	  Hyperlink hyperlink = new Hyperlink(getDriver());
	  hyperlink.click("created");
	  Assert.assertEquals(getDriver().findElement(By.id("linkResponse")).getText(), "Link has responded with staus 201 and status text Created");
  }
  
  @Test
  public void canSetSlider() {
	  Slider slider = new Slider(getDriver());
	  slider.setValue("80");
	  Assert.assertEquals(slider.getValue(), "80");
	  slider.setValue("17");
	  Assert.assertEquals(slider.getValue(), "17");
	  slider.setValue("0");
	  Assert.assertEquals(slider.getValue(), "0");
	  slider.setValue("100");
	  Assert.assertEquals(slider.getValue(), "100");

  }
  
  @Test
  public void canCreateOldStyleDropDownList() {
	  DropdownList ddl = new DropdownList(getDriver());
	  ddl.setValue("Indigo");
	  Assert.assertEquals(ddl.getValue(), "Indigo");
	  String[] options = ddl.getOptions();
	  for (int i = 0; i < options.length; i++) {
		ddl.setValue(options[i]);
		Assert.assertEquals(options[i], ddl.getValue());
	}
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
