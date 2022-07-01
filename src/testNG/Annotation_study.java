package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study {
  @Test
  public void test() {
  Reporter.log("test case is pass",true);
  }
  
  @BeforeClass
  public void launchBrowser() {
	  Reporter.log("before class bowser to be launch and get URL",true);
  }
  @BeforeMethod
  public void login() {
	  Reporter.log("login to website",true);
  }
  @AfterMethod
  public void logout() {
	  Reporter.log("logout from the site",true);
  }
  @AfterClass
  public void close()
  {
	  Reporter.log("Close browser",true);
  }
}
