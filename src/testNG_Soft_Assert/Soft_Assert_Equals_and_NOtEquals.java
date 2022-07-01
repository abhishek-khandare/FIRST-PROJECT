package testNG_Soft_Assert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Equals_and_NOtEquals {
	/* to overcome the problem of hard assert we need soft assert
	 * it conatains non static methods use to do verification
	 * Soft assert will do verification if any executes the rest of verification in a test method
	 */
	
 SoftAssert soft = new SoftAssert();
  @Test
  public void TC1() {
	  String name = "abhishek";
	  String surname = "abhishek";
	  String city = "nagpur";
	  
	  soft.assertEquals(name, surname,"String is not matching");
	  Reporter.log("TC1 is running",true);
	  soft.assertNotEquals(name, city,"String is matching");
	  Reporter.log("TC1 is running",true);
	soft.assertAll();//If we don’t write assertAll then it will not notify 
	  
  }
}
