package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindFlightPage {
	@FindBy(xpath="//input[@value='roundtrip']")
	private WebElement roundTrip;
	
	@FindBy(xpath="//input[@value='oneway']")
	private WebElement onewayTrip;
	
	@FindBy(xpath="//select[@name='passCount']")
	private WebElement passangers;
	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement fromPort;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	private WebElement fromMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	private WebElement fromDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement toPort;
	
	@FindBy(xpath="//select[@name='toMonth']")
	private WebElement toMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	private WebElement toDay;
	
	@FindBy(xpath="//input[@value='First']")
	private WebElement firstClass;
	
	@FindBy(xpath="//select[@name='airline']")
	private WebElement airline;
	
	@FindBy(xpath="//input[@name='findFlights']")
	private WebElement continueButton;
	
	public FindFlightPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setOneway() {
		onewayTrip.click();
	}
	
	public void setPassangers(String pass) {
		passangers.sendKeys(pass);
	}
	
	public void setFromPort(String fromPort1) {
		Select s = new Select(fromPort);
		s.selectByVisibleText(fromPort1);
	}
	
	public void setFromMonth(String fromMonth1) {
		Select s = new Select(fromMonth);
		s.selectByVisibleText(fromMonth1);
	}
	
	public void setFromDay(String fromDay1) {
		Select s = new Select(fromDay);
		s.selectByVisibleText(fromDay1);
	}
	
	public void setToPort(String toPort1) {
		Select s = new Select(toPort);
		s.selectByVisibleText(toPort1);
	}
	
	public void setToMonth(String toMonth1) {
		Select s = new Select(toMonth);
		s.selectByVisibleText(toMonth1);
	}
	
	public void setToDay(String toDay1) {
		Select s = new Select(toDay);
		s.selectByVisibleText(toDay1);
	}
	
	public void setClass() {
		firstClass.click();
	}
	
	public void setAirline(String airline1) {
		Select s = new Select(airline);
		s.selectByVisibleText(airline1);
	}
	
	public void clickContinue() {
		continueButton.click();
	}

}
