package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut_use {
	 @Test (timeOut = 1000)// if one of the method is time consuming then testng by default fails that test case and executes the other test case
	  public void A() throws InterruptedException {
		 Thread.sleep(500);
		  Reporter.log("A is running", true);
	  }
	  @Test(timeOut = 1000)
	  public void B() throws InterruptedException {
		  Thread.sleep(1200);
		  Reporter.log("B is running", true);
	  }
	  @Test 
	  public void C() {
		  Reporter.log("C is running", true);
	  }
	  @Test 
	  public void D() {
		  Reporter.log("D is running", true);
	  }
}
