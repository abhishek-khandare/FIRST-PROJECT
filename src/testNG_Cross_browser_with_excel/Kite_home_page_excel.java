package testNG_Cross_browser_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_home_page_excel {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement click_on_id;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;

	public Kite_home_page_excel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String validate_user_id() {
		String actualUserID = click_on_id.getText();
		return actualUserID;
		
	}
	public void click_on_logoutbutton() throws InterruptedException {
		click_on_id.click();
		Thread.sleep(200);
		logoutButton.click();
	}
	
}
