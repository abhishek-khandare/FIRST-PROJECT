package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest1 {
	 @Test(groups = "regression")
	  public void mymethod6() {
		  Reporter.log("myMethod6 regression is running", true);
	  }
	 @Test(groups = "regression")
	  public void mymethod7() {
		  Reporter.log("myMethod7 regression is running", true);
	  }
	 @Test(groups = "regression")
	  public void mymethod8() {
		  Reporter.log("myMethod8 regression is running", true);
	  }
	  @Test(groups ="sanity")
	  public void mymethod9() {
		  Reporter.log("myMethod9 sanity is running", true);
	  }
	  @Test(groups ="sanity")
	  public void mymethod10() {
		  Reporter.log("myMethod10 sanity is running", true);
	  }
}
