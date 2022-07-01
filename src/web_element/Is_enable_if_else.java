package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_if_else {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jio.com/");
		Thread.sleep(5000);
		driver.get("https://www.jio.com/selfcare/login/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='css-1r6xg00']")).click();
		Thread.sleep(5000);
		
		WebElement otp= driver.findElement(By.xpath("//button[text()='Generate OTP']"));
		Thread.sleep(5000);
		if(otp.isEnabled())
		{
			System.out.println("otp button is enable");
		}
		else {
			System.out.println("otp button is disable");
			driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9175966917");
		}
		
		if(otp.isEnabled())
				{otp.click();
			System.out.println("otp is enabled");
				}
		else {
			System.out.println("otp is disable");
		}
			
	}

}
