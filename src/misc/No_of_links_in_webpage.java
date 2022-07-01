package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_links_in_webpage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//Print all text along with link using for each loop
		
		for(WebElement all:links) {
			System.out.println(all.getText()+"-"+ all.getAttribute("href"));
		
	}
		Thread.sleep(1000);
		driver.quit();
		
		
	}
}
