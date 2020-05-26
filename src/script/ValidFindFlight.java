package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.FindFlightPage;

public class ValidFindFlight extends BaseTest{
	@Test(priority=4)
	public void testValidFindFlight() {
		String pass = XL.getData(XL_PATH, "ValidFindFlight", 1, 0);
		String fromPort1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 1);
		String fromMonth1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 2);
		String fromDay1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 3);
		String toPort1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 4);
		String toMonth1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 5);
		String toDay1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 6);
		String airline1 = XL.getData(XL_PATH, "ValidFindFlight", 1, 7);
		
		FindFlightPage ffp = new FindFlightPage(driver);
		ffp.setOneway();
		ffp.setPassangers(pass);
		ffp.setFromPort(fromPort1);
		ffp.setFromMonth(fromMonth1);
		ffp.setFromDay(fromDay1);
		ffp.setToPort(toPort1);
		ffp.setToMonth(toMonth1);
		ffp.setToDay(toDay1);
		ffp.setClass();
		ffp.setAirline(airline1);
		ffp.clickContinue();
	}

}
