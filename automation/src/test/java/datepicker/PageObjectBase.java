package datepicker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class PageObjectBase {
	protected WebDriver driver;
	protected WebElement element;
	public String url;

	protected PageObjectBase(WebDriver driver) {
		this.driver = driver;
	}
	public void navigate() {
		this.driver.navigate().to(url);
		element = this.findElement();
	}
	protected abstract WebElement findElement();
	public WebElement getElement() {
		return this.element;
	}
}