package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.SelectFlightPage;

public class ValidSelectFlight extends BaseTest{
	@Test(priority=5)
	public void testValidSelectFlight() {
		SelectFlightPage sfp = new SelectFlightPage(driver);
		sfp.setRadioButton(3);
		sfp.clickContinue();
	}

}
