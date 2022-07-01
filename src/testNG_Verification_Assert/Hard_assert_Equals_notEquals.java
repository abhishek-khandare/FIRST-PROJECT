package testNG_Verification_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_assert_Equals_notEquals {//to reduce the lenght of test script we use assert class. static methods present in the Assert class
	// called as Hard assert.
/* 1)assertEqauls()
 * 2)assertNotEquals()
 * 3)assertTrue()
 * 4)assertFalse()
 * 5)assertNull()
 * 6)assertNotNull()
 * 7)fail()
 */
	// in hard assert if first assertion is fail then it will not go on 2nd assert.or skipped
  @Test
  public void TC1() {
	  String actualresult = "abhishek";
	  String expectedresult = "abhishek";
	  Assert.assertEquals(actualresult, expectedresult,"Result is not matching");
	  Reporter.log("TC1 is running", true);
  }
  @Test
  public void TC2() {
	  String actualresult = "abhishek";
	  String expectedresult = "abhishek";
	  Assert.assertNotEquals(actualresult,expectedresult,"Result is matching");
	  Reporter.log("TC2 is running", true);
  }
  
}
