package testNG_Soft_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Null_and_NotNull {
	
	SoftAssert soft= new SoftAssert();
  @Test
  public void TC1(){
	  String name= "abhishek";
	  String surname=null;
	  
	  soft.assertNull(surname,"String is not NUll");
	  Reporter.log("TC1 is running",true);
	  soft.assertAll();
  }
  
  @Test 
  public void TC2() {
	  String name= "abhishek";
	  String surname=null;
	  soft.assertNotNull(surname,"String is NUll");
	  Reporter.log("TC2 is running",true);
	  soft.assertAll();
  }
}
