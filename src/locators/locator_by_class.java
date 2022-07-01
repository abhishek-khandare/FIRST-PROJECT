package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator_by_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nobroker.in/mumbai/rent");
		//driver.findElement(By.id("More Testimonials")).click();
		//driver.findElement(By.linkText("More Testimonials")).click();
		driver.findElement(By.partialLinkText("Testimonials")).click();
	}

}
