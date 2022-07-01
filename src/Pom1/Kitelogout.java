package Pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogout {
	//1 variable
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutbutton;
	
	// constructor
	
	public Kitelogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//method 
	
	public void validateuserId()
	{
		String actualuserId = userid.getText();
		String expecteduserId = "ELR321";
		
		if(actualuserId.equals(expecteduserId)) 
		{
			System.out.println("User ID matching TC passed");
		}
		else {
			System.out.println("User ID not matching TC is failed");
		}
	}
	public void clicklogoutbutton() throws InterruptedException
	{
		userid.click();
		Thread.sleep(1000);
		logoutbutton.click();
	}
}
