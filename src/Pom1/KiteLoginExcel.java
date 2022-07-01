package Pom1;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginExcel {
	//1. data member/variable
	
		@FindBy(id = "userid")  private WebElement UI;
		
		@FindBy(id = "password") private WebElement PSW ;
		
		@FindBy(xpath = "//button[@type='submit']") private WebElement loginbutton ;
		
		
			//2. constructor
		
		public KiteLoginExcel(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
	
		//3. method

		public void sendUserName(String userName) 
		{
			
			UI.sendKeys(userName);
		}
		
		public void sendPassword(String password) {
			PSW.sendKeys(password);
		}
		
		public void clickLoginButton() {
			loginbutton.click();
		}

}
