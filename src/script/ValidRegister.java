package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.LoginPage;
import page.RegisterPage;

public class ValidRegister extends BaseTest{
	
	@Test(priority=1)
	public void testValidRegister() {
		LoginPage lp=new LoginPage(driver);
		lp.clickRegister();
		Assert.assertEquals(driver.getTitle(), "Register: Mercury Tours");
		RegisterPage rp=new RegisterPage(driver);
		String firstName = XL.getData(XL_PATH, "ValidRegister", 1, 0);
		String lastName = XL.getData(XL_PATH, "ValidRegister", 1, 1);
		String phone = XL.getData(XL_PATH, "ValidRegister", 1, 2);
		String email = XL.getData(XL_PATH, "ValidRegister", 1, 3);
		String address1 = XL.getData(XL_PATH, "ValidRegister", 1, 4);
		String address2 = XL.getData(XL_PATH, "ValidRegister", 1, 5);
		String city = XL.getData(XL_PATH, "ValidRegister", 1, 6);
		String state = XL.getData(XL_PATH, "ValidRegister", 1, 7);
		String postalCode = XL.getData(XL_PATH, "ValidRegister", 1, 8);
		String Country = XL.getData(XL_PATH, "ValidRegister", 1, 9);
		String userName = XL.getData(XL_PATH, "ValidRegister", 1, 10);
		String Password = XL.getData(XL_PATH, "ValidRegister", 1, 11);
		String confirmPassword = XL.getData(XL_PATH, "ValidRegister", 1, 12);
		
		rp.setFirstName(firstName);
		rp.setLastName(lastName);
		rp.setPhone(phone);
		rp.setEmail(email);
		rp.setAddress1(address1);
		rp.setAddress2(address2);
		rp.setCity(city);
		rp.setState(state);
		rp.setPostalCode(postalCode);
		rp.setCountry(Country);
		rp.setUserName(userName);
		rp.setpassword(Password);
		rp.setConfirmPassword(confirmPassword);
		rp.clickRegister();
		rp.clickSignin();
		Assert.assertEquals(driver.getTitle(), "Sign-on: Mercury Tours");
	}

}
