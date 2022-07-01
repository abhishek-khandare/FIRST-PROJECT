package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected_study {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.nobroker.in/mumbai/rent");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	boolean radiobutton = driver.findElement(By.xpath("//input[@id='RENT']")).isSelected();
	
	System.out.println("radio button is selected is "+radiobutton);
	if(radiobutton==true) {
		System.out.println("it is true that radio button is selected");
	}
	else {
		System.out.println("radio button is need to be selected");
	}
	Thread.sleep(2000);
	boolean radiobutton2 = driver.findElement(By.xpath("//input[@id='PG']")).isSelected();
	Thread.sleep(1000);
	if(radiobutton2==true) {
		System.out.println("radio button 2 is selected");
	}
	else {
		System.out.println("radio button 2 is not selected ");
	}
	
}

}
