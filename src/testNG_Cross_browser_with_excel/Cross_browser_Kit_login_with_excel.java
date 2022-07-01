package testNG_Cross_browser_with_excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cross_browser_Kit_login_with_excel {
@FindBy(id ="userid") private WebElement userId;
@FindBy(id = "password")private WebElement psw;
@FindBy(xpath = "//button[@type='submit']") private WebElement clickOnLogin;

public Cross_browser_Kit_login_with_excel(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void enterUserId(String username) {
	userId.sendKeys(username);
	

}
public void enterpsw(String password) {
psw.sendKeys(password);
}
public void clickonloginbutton() {
	clickOnLogin.click();
}
}
