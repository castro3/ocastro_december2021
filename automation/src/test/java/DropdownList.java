import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {
	private WebDriver driver;
	private final String url = "https://demoqa.com/select-menu";
	Select selValue;

	public DropdownList(WebDriver driver) {
		this.driver = driver;
		this.driver.navigate().to(url);
		selValue = new Select(this.driver.findElement(By.id("oldSelectMenu")));
	}

	public void setValue(String string) {
		selValue.selectByVisibleText(string);
	}
	
	public String getValue() {
		return selValue.getFirstSelectedOption().getText();
		
	}

	public String[] getOptions() {
		WebElement element = this.driver.findElement(By.id("oldSelectMenu"));
		List<WebElement> listOptions = selValue.getOptions();
		String[] options = new String[listOptions.size()];
		for(int i=0; i < listOptions.size(); i++) {
			options[i] = listOptions.get(i).getText();
		}
		return options;
	}
}
