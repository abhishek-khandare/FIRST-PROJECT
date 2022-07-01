package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_action {

	public static void main(String[] args) {
		//Actions class is used to handle keyboard or mouse event in selenium.
		//click()
		
			
			System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			
			Actions act = new Actions(driver);
		
			WebElement myele = driver.findElement(By.xpath("(//a[@data-toggle='dropdown'])[1]"));
			//1
		act.moveToElement(myele).click().build().perform();
			//2
		//	act.click(myele).perform();
	}

}
