package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.discoveryplus.in/?gclid=CjwKCAjw682TBhATEiwA9crl38_MBFtao2JUGnFb6Ki0BQsA9Hu7f1bLIVY-5Yvr6XSc7RyzEEIjexoCE8QQAvD_BwE");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//h6[text()='Sign In']")).click();
		Thread.sleep(5000);
			WebElement signin= driver.findElement(By.xpath("//button[@type='submit']"));
			Thread.sleep(5000);
		System.out.println(signin.isEnabled());
		Thread.sleep(5000);
		if(signin.isEnabled()) 
		{
			System.out.println("sign in button is enable");
		}
		else {
			signin.click();
			if (signin.isEnabled())
			{
				System.out.println("sign in button is clicked");
			}
			else {
				System.out.println("signin button is disable");
			}
		}
	}

}
