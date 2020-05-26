package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightConfirmPage {
	@FindBy(xpath="//img[contains(@src,'Logout.gif')]")
	private WebElement logoutButton;
	
	public FlightConfirmPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickLogout() {
		logoutButton.click();
	}

}
