package Pom1_excel_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page_excel {
	@FindBy(id = "userid") private WebElement userName;
	@FindBy(id = "password") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	public Kite_login_page_excel( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(String userID){
		userName.sendKeys(userID);
	}
	public void enterpassword(String Password) {
		pwd.sendKeys(Password);
	}
	public void click_on_continue_button() {
		loginbutton.click();
	}
}
