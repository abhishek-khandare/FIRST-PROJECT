package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleNo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icc-cricket.com/cricket-world-cup-super-league/standings");
		
		Thread.sleep(1000);
		List<WebElement> Noofrow = driver.findElements(By.xpath("//*[@id='main-content']/div[1]/div[1]/article/div[2]/table"));
		int row =Noofrow.size();
		System.out.println(row);
		
		
		for(int i =1; i<=row;i++)
		{
			WebElement column = driver.findElement(By.xpath("//*[@id='main-content']/div[1]/div[1]/article/div[2]/table["+i+"]"));
			System.out.println(column.getText()+" ||");
		}
			System.out.println();
//		//List<WebElement> Noofcolumn = driver.findElements(By.xpath("//td"));
//		
//		for(WebElement row:Noofrow) {
//			System.out.print(row.getText()+" ||");
//			
//		}
//		System.out.println();
//	
	}

}
