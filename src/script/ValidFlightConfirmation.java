package script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.FlightConfirmPage;

public class ValidFlightConfirmation extends BaseTest{
	@Test(priority=7)
	public void testValidFlightConfirm() throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(10000);
		for(int i=0;i<5;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(1000);
		}
		r.keyPress(KeyEvent.VK_DOWN);
		for(int i=0;i<5;i++) {
			r.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
		}
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		FlightConfirmPage fcp = new FlightConfirmPage(driver);
		fcp.clickLogout();
		
		
		
	}

}
