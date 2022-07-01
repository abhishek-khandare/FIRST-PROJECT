package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementUnOrder_list {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		 WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
		 searchButton.click();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  
		 WebElement review = driver.findElement(By.xpath("(//div[@class='_3pLy-c row'])[1]//span[3]"));
		 
		 System.out.println(review.getText());
		 Thread.sleep(500);
		 review.click();
		
		
		
	}

}
