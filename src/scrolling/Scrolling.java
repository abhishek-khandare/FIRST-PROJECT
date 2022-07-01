package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// +ve x value- right hand side, y value +ve = down
		//+ve x value-- right hand side, y value -ve= up
		//-ve x value-- left hand side, y value +ve = down
		//-ve x value-- left hand side, y value -ve = up
        JavascriptExecutor j = (JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(10,10000)");
        driver.navigate().refresh();
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(10,-500)");
        driver.navigate().refresh();
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(-100,1000)");
        driver.navigate().refresh();
        Thread.sleep(1000);
        j.executeScript("window.scrollBy(-100,-5000)");
        
        
	}

}
