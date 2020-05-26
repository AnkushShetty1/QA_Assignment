package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class InvalidSignin extends BaseTest{
	
	@Test(priority=2)
	public void testInValidSignin(){
		for (int i = 1; i <= XL.getRowCount(XL_PATH, "InValidSignin"); i++) {
			String userName = XL.getData(XL_PATH, "InValidSignin", i, 0);
			String password = XL.getData(XL_PATH, "InValidSignin", i, 1);
			Reporter.log("UN:"+userName+"  PW:"+password);
			LoginPage lp = new LoginPage(driver);
			lp.setUserName(userName);
			lp.setPassword(password);
			lp.clickSignin();
			Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours","Welcome: Mercury Tours");	
		}
	}
}
