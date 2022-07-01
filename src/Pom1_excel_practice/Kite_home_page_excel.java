package Pom1_excel_practice;

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
	public void validate_user_id(String userID) {
		 String actualuserId = click_on_id.getText();
		 String expecteduserId = userID;
		
		 if(actualuserId.equals(expecteduserId)) 
		 {
			 System.out.println("UserId is matched TC pass");
		 }
		 else {
			System.out.println("UserId is not matched TC fail");
		}
	}
	public void click_on_logoutbutton() throws InterruptedException {
		click_on_id.click();
		Thread.sleep(200);
		logoutButton.click();
	}
	
}
