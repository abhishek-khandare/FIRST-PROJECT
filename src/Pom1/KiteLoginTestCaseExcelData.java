package Pom1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTestCaseExcelData {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File MyFile = new File("F:\\Testing\\automation testing\\Automation\\Kitelogin.xlsx");
		Sheet data = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String userName = data.getRow(0).getCell(0).getStringCellValue();
		String password = data.getRow(0).getCell(1).getStringCellValue();
	
		// Login page
		KiteLoginExcel KL = new KiteLoginExcel(driver);
		KL.sendUserName(userName);
		KL.sendPassword(password);
		KL.clickLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
