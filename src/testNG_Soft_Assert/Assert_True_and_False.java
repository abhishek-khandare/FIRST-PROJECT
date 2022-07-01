package testNG_Soft_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_True_and_False {
	
	SoftAssert soft= new SoftAssert();
  @Test
  public void TC1() {
	  boolean name = true;
	  boolean surname = false;
	  
	  soft.assertTrue(name,"value is False");
	  Reporter.log("TC 1 is running",true);
	  
	  soft.assertFalse(surname,"value is true");
	  Reporter.log("TC1 is running",true);
	  
	  soft.assertAll();
  }
}
