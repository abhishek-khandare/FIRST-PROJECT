package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsUnorderedList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("Honda");
		List<WebElement> searchlist = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement search:searchlist) {
			System.out.println(search.getText());
		}

		String expectedresult ="honda amaze";
		for(WebElement result:searchlist)
		{
	//		System.out.println(result.getText());
			String actualresult = result.getText();
			if(actualresult.equals(expectedresult))
			{
				result.click();
				break;
				
			}
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Images")).click();
	}

}
