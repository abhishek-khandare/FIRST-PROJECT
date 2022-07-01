package testNG_Verification_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_True_and_False {
  @Test
  public void TC1() {
	  boolean name = true;
	  boolean surname = false;
	  
	  Assert.assertTrue(name,"value is False");
	  Reporter.log("TC 1 is running",true);
	  
	  Assert.assertFalse(surname,"value is true");
	  Reporter.log("TC1 is running",true);
  }
}
