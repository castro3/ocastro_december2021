import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import framework.TestBase;

public class RadioButton extends TestBase{

	@FindBy(how=How.CLASS_NAME, using="custom-control-label")
	private WebElement yesButton;
	
	@FindBy(how=How.CLASS_NAME, using="custom-control-label")
	private WebElement impressiveButton;
	
	@FindBy(how=How.CLASS_NAME, using="custom-control-label")
	private WebElement noButton;

	private WebDriver driver;
	
	public RadioButton(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
	}
	
	public void select(String label) {
		if(label.equalsIgnoreCase("yes")) {
			this.yesButton.click();
		}else if(label.equalsIgnoreCase("impressive")) {
			this.impressiveButton.click();
		}else {
			this.noButton.click();
		}
	}
	
	public String getSelected() {
		if(this.yesButton.isSelected()) {
			return this.yesButton.getText();
		}else if(this.impressiveButton.isSelected()) {
			return this.impressiveButton.getText();
		}else {
			return this.noButton.getText();
		}
	}
}
