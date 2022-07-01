package testNG_Verification_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Null_and_NotNull {
  @Test
  public void TC1(){
	  String name= "abhishek";
	  String surname=null;
	  
	  Assert.assertNull(surname,"String is not NUll");
	  Reporter.log("TC1 is running",true);
  }
  
  @Test 
  public void TC2() {
	  String name= "abhishek";
	  String surname=null;
	  Assert.assertNotNull(surname,"String is NUll");
	  Reporter.log("TC2 is running",true);
	  
  }
}
