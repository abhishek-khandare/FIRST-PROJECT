package testNG_Cross_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cross_browser_Kite_login_page {

	@FindBy(id = "userid") private WebElement userName;
	@FindBy(id = "password") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	public Cross_browser_Kite_login_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
  }
	public void Enter_User_Id() {
		userName.sendKeys("YYC898");
	}
	public void Enter_Password() {
		pwd.sendKeys("Itachi807");
	}
	public void Click_On_Login() {
		loginbutton.click();
	}
}
