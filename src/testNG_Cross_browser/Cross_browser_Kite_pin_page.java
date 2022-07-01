package testNG_Cross_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cross_browser_Kite_pin_page {
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/div[3]/button" ) private WebElement clickoncontinue;

	public Cross_browser_Kite_pin_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void Enter_pin() {
		PIN.sendKeys("117415");
	}
	public void Click_on_Continue() {
		clickoncontinue.click();
	}
	
	
}
