package testNG_Verification_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
  @Test
  public void TC1()
  {
	  Assert.fail("TC case is Failed");
	  Reporter.log("TC1 is running",true);
 
  }
}
