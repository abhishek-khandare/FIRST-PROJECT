package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
//		Date d = new Date(10);
//		String FileName = d. toString(). replace(":", "_"). replace(" ", "_") + ".png";
		
		File dest = new File("F:\\Testing\\automation testing\\Automation\\codes\\screenshot\\screenshot.png");
		FileHandler.copy(src, dest);
		  Thread.sleep(3000); 
	}

	}

