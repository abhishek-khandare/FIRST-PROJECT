package testNG_Verification_Assert;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void MyTC() throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	//  ChromeOptions opt = new ChromeOptions();
	//	opt.addArguments("headless");
	  WebDriver driver = new ChromeDriver();//opt);
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
//		if(checkBox1.isSelected()) {
//			Reporter.log("TC is pass",true);
//		}
//		else {
//			Reporter.log("TC is fail", true);
//		}
		checkBox1.click();
		Thread.sleep(200);
		Assert.assertTrue(checkBox1.isSelected(),"checkbox is not selected TC fail");
		Reporter.log("checkbox is selected TC is pass", true);
		
		
  }
}
