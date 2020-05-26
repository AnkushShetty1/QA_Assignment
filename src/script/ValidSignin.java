package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;

public class ValidSignin extends BaseTest{
	@Test(priority=3)
	public void testValidSignin(){
		String userName = XL.getData(XL_PATH, "ValidSignin", 1, 0);
		String Password = XL.getData(XL_PATH, "ValidSignin", 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(Password);
		lp.clickSignin();
		Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	}

}