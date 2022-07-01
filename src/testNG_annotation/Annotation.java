package testNG_annotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

@BeforeClass
public void openbrowser() {
	System.out.println("open browser is running");
	Reporter.log("open browser is running", true);
}
@BeforeMethod
public void login() {
	Reporter.log("test login succesful", true);
}
  @Test
  public void test1() {
	  Reporter.log("Test1 is running" ,true);
  }
  @AfterMethod
  public void logout() {
	  Reporter.log("test logout is done", true);
  }
  @AfterClass
  public void closebroser() {
	  Reporter.log("browser is close", true);
  }
}
