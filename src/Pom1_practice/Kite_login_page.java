package Pom1_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_login_page {

	@FindBy(id = "userid") private WebElement userName;
	@FindBy(id = "password") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	public Kite_login_page( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void enteruserid(){
		userName.sendKeys("YYC898");
	}
	public void enterpassword() {
		pwd.sendKeys("Itachi807");
	}
	public void click_on_continue_button() {
		loginbutton.click();
	}
	}
