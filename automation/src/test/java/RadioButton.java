import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RadioButton {

	@FindBy(how=How.XPATH, using="//input[@id='yesRadio']//following-sibling::label[@class='custom-control-label']")
	private WebElement yesButton;
	@FindBy(how=How.XPATH, using="//input[@id='impressiveRadio']//following-sibling::label[@class='custom-control-label']")
	private WebElement impressiveButton;
	@FindBy(how=How.XPATH, using="//input[@id='noRadio']//following-sibling::label[@class='custom-control-label disabled']")
	private WebElement noButton;
	private WebDriver driver;
	private final String url = "https://demoqa.com/radio-button";
	
	public RadioButton(WebDriver webDriver) {
		this.driver = webDriver;
		PageFactory.initElements(driver, this);
		this.driver.navigate().to(url);
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
		}else if(this.noButton.isSelected()){
			return this.noButton.getText();
		}
		return null;
	}
}
