package example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Testing\\automation testing\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
