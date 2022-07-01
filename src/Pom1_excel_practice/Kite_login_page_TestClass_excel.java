package Pom1_excel_practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kite_login_page_TestClass_excel {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver",  "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		File KiteloginExcel = new File("F:\\Testing\\automation testing\\Automation\\Kitelogin.xlsx");
		Sheet Sheet1 = WorkbookFactory.create(KiteloginExcel).getSheet("Sheet1");
		String userID = Sheet1.getRow(2).getCell(0).getStringCellValue();
		String Password =Sheet1.getRow(2).getCell(1).getStringCellValue();
		String Pin = Sheet1.getRow(2).getCell(2).getStringCellValue();
		//Login_page
		Kite_login_page_excel login = new Kite_login_page_excel(driver);
		login.enteruserid(userID);
		login.enterpassword(Password);
		login.click_on_continue_button();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//PIN_page
		Kite_pin_page_excel pin = new Kite_pin_page_excel(driver);
		pin.enterpin(Pin);
		pin.click_on_continue();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		//test case or logout
		Kite_home_page_excel home = new Kite_home_page_excel(driver);
		home.validate_user_id(userID);
		Thread.sleep(300);
		home.click_on_logoutbutton();
		
		driver.close();
		
	}

	}


