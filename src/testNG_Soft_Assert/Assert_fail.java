package testNG_Soft_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_fail {
	SoftAssert soft= new SoftAssert();
  @Test
  public void TC1()
  {
	  soft.fail("TC is fail");
	  Reporter.log("TC1 is running",true);
	  soft.assertAll();
	 
  }
  @Test
  public void TC2() {
  Reporter.log("assert is Fail");
  soft.fail();
  Reporter.log("TC1 11 is running");
  soft.assertAll();
  }
  
}
