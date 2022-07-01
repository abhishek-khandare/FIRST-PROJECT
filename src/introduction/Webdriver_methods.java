package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//1
		driver.get("https://vctcpune.com/");// get method is use to get url(enter string in parenthesis.
		//2
		driver.close();// close is use to closed the current tab opened in url 
		//3
		driver.quit();//quit is use to close the all tabs opened in url.
		Thread.sleep(1000);
		//4
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();// minimize/ maximize is use to mini/max the browser 
		driver.manage().window().minimize();
		
		//navigate is use to open an application,move forward, backward and refresh the webpage
		driver.navigate().to("https://vctcpune.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(200);
		driver.navigate().refresh();
		driver.close();
		Thread.sleep(1000);
		
		//getTitle: this method is use to get the title of a webpage . return type of getTitle method is string
		driver.get("https://vctcpune.com/");
		
		String Title = driver.getTitle();
		System.out.println("title is "+Title);
		
		
	// getCurrentURl :this method is used to get the url of webpage. return type of getCurrentURL is string
		driver.get("https://vctcpune.com/");
		
		String url = driver.getCurrentUrl();
		System.out.println("url of webpage is "+url);
		
	
	}

}
