package datepicker;

import org.openqa.selenium.WebElement;

public abstract class ControlExtensionBase {
	protected WebElement element; 
	
	public ControlExtensionBase(WebElement element) {
		this.element = element;
	}
	
}
