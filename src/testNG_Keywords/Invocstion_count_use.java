package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Invocstion_count_use {
  @Test(invocationCount=3) //it means that how many time do you want to run the test
  public void Method1() {
	  Reporter.log("Method 1 is running", true);
  }
  @AfterMethod
  public void close() {
	  Reporter.log("closing browser", true);
  }
  @Test
  public void Method2() {
	  Reporter.log("Method 2 is running",true);
  }
}
