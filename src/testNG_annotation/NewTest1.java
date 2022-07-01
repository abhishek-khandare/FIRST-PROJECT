package testNG_annotation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void m1() {
	  System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("Kite app is launch TC is pass", true);
		driver.close();
  }
  @Test
  public void m2() {
	  System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("facebook is launch TC is pass", true);
		driver.close();
  }
  
  @Test
  public void m3() {
	  System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		Reporter.log("jio is launch TC is pass", true);
	//	Reporter.log("jio is launch TC is pass",false);
		driver.close();
  }
}
