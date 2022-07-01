package Pom1_excel_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_pin_page_excel {
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/div[3]/button" ) private WebElement clickoncontinue;

	public Kite_pin_page_excel(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterpin(String Pin) {
		PIN.sendKeys(Pin);
	}
	public void click_on_continue() {
		clickoncontinue.click();
}
}
