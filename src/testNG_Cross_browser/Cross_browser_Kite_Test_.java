package testNG_Cross_browser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser_Kite_Test_ {
	WebDriver driver;
	Cross_browser_Kite_login_page login;
	Cross_browser_Kite_pin_page pin;
	Cross_browser_Kite_Home_page home;
	@Parameters("browser")
	@BeforeClass
  public void launchbrowser(String browser) {
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","F:\\Testing\\automation testing\\Automation\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		}	
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("Browser is launch",true);
		login = new Cross_browser_Kite_login_page(driver);
		pin = new Cross_browser_Kite_pin_page(driver);
		home = new Cross_browser_Kite_Home_page(driver);
		}
	@BeforeMethod
	public void loginpage() {
		login.Enter_User_Id();
		Reporter.log("Entering userid",true);
		login.Enter_Password();
		Reporter.log("Entering password",true);
		login.Click_On_Login();
		Reporter.log("click on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		pin.Enter_pin();
		Reporter.log("Entering pin",true);
		pin.Click_on_Continue();
		Reporter.log("continue button click",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
}
	@Test
	public void verifyKiteLogin() {
		home.validate_user_id();
		
  }
	@AfterMethod 
	public void logout_kite() throws InterruptedException {
		home.click_on_logoutbutton();
	}
	@AfterClass
	public void closebrwser() {
		driver.close();
		
	}
}
