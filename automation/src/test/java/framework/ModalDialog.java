package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModalDialog {
	private WebElement element;
	private WebElement modalElement;
	
	public ModalDialog(WebElement element) {
		this.element = element;
	}
	
	public void click() {
		this.element.click();
		modalElement = this.element.findElement(By.xpath(".//ancestor::body//div[@class='modal-content']"));
	}
	
	public String getModalBody() {
		return modalElement.findElement(By.xpath(".//div[@class='modal-body']")).getText();
	}
	
	public void close() {
		modalElement.findElement(By.xpath(".//button[@type='button']")).click();
	}
}
