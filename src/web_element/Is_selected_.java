package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();// pop up message
		Thread.sleep(5000);
		WebElement s1 = driver.findElement(By.xpath("(//label[@class='css-label_c t_c'])[1]"));
		if(s1.isSelected())
		{
			System.out.println("checkbox is already selected");
			
			Thread.sleep(2000);
		}
		
		else {
			System.out.println("check box is not selected");
			s1.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='OK']")).click();
			Thread.sleep(3000);
			System.out.println("check box is selected");
		}
//		s1.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='OK']")).click();
//		Thread.sleep(5000);
//		if(s1.isSelected())
//		{
//			System.out.println("check box is selected");
//		}
//		else {
//			System.out.println("click the check box");
//			
//		}
//		
		
	}

}
