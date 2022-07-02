package actionclass;
//Hii Abhishek....
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_action {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement MyElement = driver.findElement(By.id("autocomplete"));
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(MyElement, "abhishek").perform();
		
		act.keyDown(MyElement, Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).sendKeys("bhishek").build().perform();

	}

}
