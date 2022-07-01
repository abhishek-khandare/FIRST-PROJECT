package scrolling;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_position {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		// //To set Position--> use Point class and create object of Point class
		Point p = new Point(100, 800);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
	}

}
