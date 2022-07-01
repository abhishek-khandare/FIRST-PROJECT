package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecharge.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='login-btn']")).click();
		Thread.sleep(1000);
		WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		boolean result = signin.isEnabled();
		System.out.println("result is "+result);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8308887091");
		Thread.sleep(5000);
		boolean result1 = signin.isEnabled();
		System.out.println("result is "+result1);
		
		
		
	}

}
