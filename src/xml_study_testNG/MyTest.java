package xml_study_testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void mymethod1() {
	  Reporter.log("myMethod1 is running", true);
  }
  @Test
  public void mymethod2() {
	  Reporter.log("myMethod2 is running", true);
  }
  @Test
  public void mymethod3() {
	  Reporter.log("myMethod3 is running", true);
  }
  @Test
  public void mymethod4() {
	  Reporter.log("myMethod4 is running", true);
  }
  @Test
  public void mymethod5() {
	  Reporter.log("myMethod5 is running", true);
  }
}
