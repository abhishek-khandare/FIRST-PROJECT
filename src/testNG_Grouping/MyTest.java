package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test(groups = "sanity")
  public void mymethod1() {
	  Reporter.log("myMethod1 sanity is running", true);
  }
  @Test(groups = "sanity")
  public void mymethod2() {
	  Reporter.log("myMethod2 sanity is running", true);
  }
  @Test(groups = "sanity")
  public void mymethod3() {
	  Reporter.log("myMethod3 sanity is running", true);
  }
  @Test(groups = "regression")
  public void mymethod4() {
	  Reporter.log("myMethod4 regression is running", true);
  }
  @Test(groups = "regression")
  public void mymethod5() {
	  Reporter.log("myMethod5 regression is running", true);
  }
}
