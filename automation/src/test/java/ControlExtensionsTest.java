import org.openqa.selenium.By;
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
  
  @Test
  public void canCreateHyperLink() {
	  final String url = "https://demoqa.com/links";
	  getDriver().navigate().to(url);
	  Hyperlink hyperlink = new Hyperlink(getDriver());
	  hyperlink.click("created");
	  Assert.assertEquals(getDriver().findElement(By.id("linkResponse")).getText(), "Link has responded with staus 201 and status text Created");
  }
  
  @Test
  public void canCreateSlider() {
	  final String url = "https://demoqa.com/slider";
	  getDriver().navigate().to(url);
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
	  final String url = "https://demoqa.com/select-menu";
	  getDriver().navigate().to(url);
	  DropdownList ddl = new DropdownList(getDriver());
	  ddl.setValue("Indigo");
	  String[] options = ddl.getOptions();
	  for(int i=0; i < options.length; i++) {
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
