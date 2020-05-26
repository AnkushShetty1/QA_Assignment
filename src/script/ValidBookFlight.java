package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.BookFlightPage;

public class ValidBookFlight extends BaseTest {
	@Test(priority=6)
	public void testValidBookFlight() {
		String fn0 = XL.getData(XL_PATH, "ValidBookFlight", 1, 0);
		String ln0 = XL.getData(XL_PATH, "ValidBookFlight", 1, 1);
		String meal0 = XL.getData(XL_PATH, "ValidBookFlight", 1, 2);
		String fn1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 3);
		String ln1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 4);
		String meal1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 5);
		String cardType = XL.getData(XL_PATH, "ValidBookFlight", 1, 6);
		String cardNumber = XL.getData(XL_PATH, "ValidBookFlight", 1, 7);
		String expiryMonth = XL.getData(XL_PATH, "ValidBookFlight", 1, 8);
		String expiryYear = XL.getData(XL_PATH, "ValidBookFlight", 1, 9);
		String cardfn = XL.getData(XL_PATH, "ValidBookFlight", 1, 10);
		String cardmn = XL.getData(XL_PATH, "ValidBookFlight", 1, 11);
		String cardln = XL.getData(XL_PATH, "ValidBookFlight", 1, 12);
		String billAddress1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 13);
		String billAddress2 = XL.getData(XL_PATH, "ValidBookFlight", 1, 14);
		String billCity1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 15);
		String billState1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 16);
		String billZip1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 17);
		String billcountry1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 18);
		String delAddress1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 13);
		String delAddress2 = XL.getData(XL_PATH, "ValidBookFlight", 1, 14);
		String delCity1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 15);
		String delState1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 16);
		String delZip1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 17);
		String delcountry1 = XL.getData(XL_PATH, "ValidBookFlight", 1, 18);
		BookFlightPage bfp = new BookFlightPage(driver);
		bfp.setFirstName0(fn0);
		bfp.setLastName0(ln0);
		bfp.setMeal0(meal0);
		bfp.setFirstName1(fn1);
		bfp.setLastName1(ln1);
		bfp.setMeal1(meal1);
		bfp.setCardType(cardType);
		bfp.setcardNumber(cardNumber);
		bfp.setExpiryMonth(expiryMonth);
		bfp.setExpiryYear(expiryYear);
		bfp.setCardFirstName(cardfn);
		bfp.setCardMidName(cardmn);
		bfp.setCardLastName(cardln);
		bfp.setBillAddress1(billAddress1);
		bfp.setBillAddress2(billAddress2);
		bfp.setBillCity(billCity1);
		bfp.setBillState(billState1);
		bfp.setBillZip(billZip1);
		bfp.setBillCountry(billcountry1);
		bfp.setDelAddress1(delAddress1);
		bfp.setDelAddress2(delAddress2);
		bfp.setDelCity(delCity1);
		bfp.setDelState(delState1);
		bfp.setDelZip(delZip1);
		bfp.setDelCountry(delcountry1);
		driver.switchTo().alert().accept();
		bfp.clickSecurePurchase();
	}

}
