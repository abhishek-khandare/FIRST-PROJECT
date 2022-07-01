package testNG_Cross_browser_with_excel;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_browser_Kite_TestClass {

WebDriver driver;
Cross_browser_Kit_login_with_excel login;
Kite_home_page_excel home;
Kite_pin_page_excel pin;
Sheet sheet1;


@Parameters("browser")
@BeforeClass
public void launchBrowser(String browser) throws EncryptedDocumentException, IOException {
	
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "F:\\Testing\\automation testing\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	Reporter.log("Launch browser",true);
	driver.get("https://kite.zerodha.com/");
	Reporter.log("Launch website",true);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	login= new Cross_browser_Kit_login_with_excel(driver);
	pin = new Kite_pin_page_excel(driver);
	home = new Kite_home_page_excel(driver);
File Kiteexcel = new File("F:\\Testing\\automation testing\\Automation\\Kitelogin.xlsx");
	
	Sheet sheet1 = WorkbookFactory.create(Kiteexcel).getSheet("Sheet1");
	
	
	
}
@BeforeMethod
public void login_kite_page_excel() {
//	sheet1.getRow(3).getCell(0).getStringCellValue();
//	sheet1.getRow(3).getCell(1).getStringCellValue();
//	sheet1.getRow(3).getCell(2).getStringCellValue();
	login.enterUserId(sheet1.getRow(0).getCell(0).getStringCellValue());
	login.enterpsw(sheet1.getRow(0).getCell(1).getStringCellValue());
	login.clickonloginbutton();
	Reporter.log("Login to kite",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	pin.enterpin(sheet1.getRow(0).getCell(2).getStringCellValue());
	pin.click_on_continue();
	Reporter.log("Login to kite",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
}

  @Test
  public void validate_user() {
	  Reporter.log("validating user Id",true);
	  String exceptedUserID = sheet1.getRow(0).getCell(0).getStringCellValue();
	  String actualUserID = home.validate_user_id();
	  Assert.assertEquals(actualUserID,exceptedUserID,"userId is not matching TC fail");
	  Reporter.log("userID is matching TC pass",true);
  }
  @AfterMethod 
  public void logout() throws InterruptedException{
	  home.click_on_logoutbutton();
	  Reporter.log("loging out",true);
	  
  }
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
