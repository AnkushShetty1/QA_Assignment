package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	@FindBy(xpath="//input[@name='reserveFlights']")
	private WebElement continueButton;
	
	@FindBy(xpath="//input[@type='radio']")
	private java.util.List<WebElement> radioButton;
	
	public SelectFlightPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setRadioButton(int i) {
		radioButton.get(i).click();
	}
	
	public void clickContinue() {
		continueButton.click();
	}
}
