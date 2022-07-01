package Pom1_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_pin_page {
@FindBy(id = "pin") private WebElement PIN;
@FindBy(xpath="//*[@id=\"container\"]/div/div/div/form/div[3]/button" ) private WebElement clickoncontinue;

public Kite_pin_page(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void enterpin() {
	PIN.sendKeys("117415");
}
public void click_on_continue() {
	clickoncontinue.click();
}
}
