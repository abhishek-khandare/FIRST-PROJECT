package Pom1;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class KiteLoginTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// Login page
		Kitelogin KL = new Kitelogin(driver);
		KL.sendUserName();
		KL.sendPassword();
		KL.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
		//PIN entering page
		KitePinPage KP = new KitePinPage(driver);
		KP.sendpin();
		KP.clickoncontinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Kite Logout
		Kitelogout KO = new Kitelogout(driver);
		KO.validateuserId();
		KO.clicklogoutbutton();
		

	}

}
