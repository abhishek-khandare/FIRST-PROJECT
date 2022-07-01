package Pom1_practice;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_login_TestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//Login_page
		Kite_login_page login = new Kite_login_page(driver);
		login.enteruserid();
		login.enterpassword();
		login.click_on_continue_button();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//PIN_page
		Kite_pin_page pin = new Kite_pin_page(driver);
		pin.enterpin();
		pin.click_on_continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//test case or logout
		Kite_home_page home = new Kite_home_page(driver);
		home.validate_user_id();
		Thread.sleep(300);
		home.click_on_logoutbutton();
		
		driver.close();
		
	}

}
