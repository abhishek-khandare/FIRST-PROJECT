package Pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin {

		//1. data member/variable
		
	@FindBy(id = "userid")  private WebElement UI;
	
	@FindBy(id = "password") private WebElement PSW ;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton ;
	
	
		//2. constructor
	
	public Kitelogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	
	//3. method
	
	public void sendUserName() {
		UI.sendKeys("ELR321");
	}
	
	public void sendPassword() {
		PSW.sendKeys("Dhana1111");
	}
	
	public void clickLoginButton() {
		loginbutton.click();
	}


}
