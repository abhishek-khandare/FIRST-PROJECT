package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		 
		// to switch the window we need window id, for window id we have method(getWindowHandle(),getWindowHandles())
		
		String idofmainpg = driver.getWindowHandle();
		System.out.println("main page id is "+idofmainpg);// all id are present in sets
		
		//getWindowHandles()
		Set<String> allid = driver.getWindowHandles();
	// set need to get convert into array
		ArrayList<String> ar = new ArrayList<>(allid);
		for (int i =0; i<=ar.size()-1;i++)
		{System.out.println(ar.get(i));
		}
		String mainpage_id = ar.get(0);
		String childpage_id = ar.get(1);
		
		//focus to be switch to child page
		driver.switchTo().window(childpage_id);
		Thread.sleep(100);
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.findElement(By.id("the7-search")).sendKeys("abhishek");
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(mainpage_id);
		Thread.sleep(200);
		driver.close();
}
	}