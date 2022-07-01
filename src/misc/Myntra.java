package misc;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//Actions a = new Actions(driver);
		
		//WebElement profile = driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[1]"));
		driver.findElement(By.xpath("(//span[@class='desktop-userTitle'])[1]")).click();
		//	a.moveToElement(profile).perform();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@class='desktop-linkButton']")).click();
}}
