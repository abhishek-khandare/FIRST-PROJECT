package scrolling;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\automation testing\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		System.out.println(driver.manage().window().getSize());
		
		//to set size create the object of Dimension class.
	Dimension d = new Dimension(1000, 800);
	
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

	}

}
