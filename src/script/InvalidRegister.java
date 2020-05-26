package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;
import page.RegisterPage;

public class InvalidRegister extends BaseTest{
	@Test()
	public void testInvalidRegister() {
		LoginPage lp=new LoginPage(driver);
		lp.clickRegister();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		RegisterPage rp=new RegisterPage(driver);
		rp.clickRegister();
		Assert.assertEquals(rp.successMessage(), false);
	}

}
