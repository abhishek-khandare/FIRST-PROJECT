package list_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_ex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		 WebElement sub_list = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		 Thread.sleep(2000);
		 sub_list.click();
		 Thread.sleep(2000);
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 Select s1 = new Select(day);
		 s1.selectByValue("2");
		 Thread.sleep(2000);
		 s1.selectByIndex(8);
		 Thread.sleep(2000);
		 s1.selectByVisibleText("5");
		 Thread.sleep(2000);
		 s1.deselectByIndex(8);
	
		 Thread.sleep(2000);
		 s1.selectByValue("2");
		
		 
		
		
		
		

	}

}
