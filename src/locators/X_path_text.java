package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[text()='Selenium Webdriver with Java Basics + Advanced + Interview Guide']")).click();
		

	}

}
