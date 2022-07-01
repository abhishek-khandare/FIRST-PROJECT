package testNG_Cross_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@BeforeClass
  public void launchBrowser(String browser){
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Testing\\automation testing\\Automation\\geckodriver.exe");
			driver = new FirefoxDriver();
		}}
	@BeforeMethod
	public void loginToKite() {
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	driver.findElement(By.id("userid")).sendKeys("YYC898");
	driver.findElement(By.id("password")).sendKeys("Itachi807");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	driver.findElement(By.id("pin")).sendKeys("117415");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	@Test
	public void TestCaseKitePage() {
		WebElement Id = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String expectedId = "YYC898";
		String AcutalId =Id.getText();
		if (AcutalId.equals(expectedId)) {
			Reporter.log("TC pass Id matches",true);
		}
		else {
			Reporter.log("TC fail",true);
		}
		Id.click();
		
	}
	@AfterMethod
	public void logout() {
	driver.findElement(By.xpath("//a[@target='_self']")).click();
	
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}

