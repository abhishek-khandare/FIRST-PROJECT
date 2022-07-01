package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	//alert popup
	//we cannot inspect the alert popup , it contains ok , cancle or text.
	//If we not handled alert popup and tried to take next action."Exceptions: UnhandledAlertException"
// if we want to handled the alert popup then we need to switch the foucs of selenium to the popup box
	// alert a= driver.switchTo().alert();
	//alert is interface having abstract method like
	//1.accept()  2. dismiss()   3. getText()
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		Thread.sleep(1000);
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		alt.accept();
		
		driver.navigate().refresh();
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(1000);
		alt.dismiss();
		
		driver.navigate().refresh();
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(1000);
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		
	
	}

}
