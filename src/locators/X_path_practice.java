package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_practice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.jiomart.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()=' Sign in / Sign up ']")).click();
	Thread.sleep(1000);

	
}
}
