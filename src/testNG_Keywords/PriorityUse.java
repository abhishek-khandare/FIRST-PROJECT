package testNG_Keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {//which test do you want to perform first as per priority
  @Test (priority = 1)
  public void A() {
	  Reporter.log("A is running", true);
  }
  @Test(priority=0)
  public void B() {
	  Reporter.log("B is running", true);
  }
  @Test (priority = 3)
  public void C() {
	  Reporter.log("C is running", true);
  }
  @Test (priority = -1)
  public void D() {
	  Reporter.log("D is running", true);
  }
}
