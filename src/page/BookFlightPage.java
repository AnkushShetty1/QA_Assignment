package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPage {
	@FindBy(xpath="//input[@name='passFirst0']")
	private WebElement passFirst0;
	
	@FindBy(xpath="//input[@name='passLast0']")
	private WebElement passLast0;
	
	@FindBy(xpath="//select[@name='pass.0.meal']")
	private WebElement passMeal0;
	
	@FindBy(xpath="//input[@name='passFirst1']")
	private WebElement passFirst1;
	
	@FindBy(xpath="//input[@name='passLast1']")
	private WebElement passLast1;
	
	@FindBy(xpath="//select[@name='pass.1.meal']")
	private WebElement passMeal1;
	
	@FindBy(xpath="//select[@name='creditCard']")
	private WebElement creditCard;
	
	@FindBy(xpath="//input[@name='creditnumber']")
	private WebElement creditNumber;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_mn']")
	private WebElement ccExpiryMonth;
	
	@FindBy(xpath="//select[@name='cc_exp_dt_yr']")
	private WebElement ccExpiryYear;
	
	@FindBy(xpath="//input[@name='cc_frst_name']")
	private WebElement ccFirstName;
	
	@FindBy(xpath="//input[@name='cc_mid_name']")
	private WebElement ccMidName;
	
	@FindBy(xpath="//input[@name='cc_last_name']")
	private WebElement ccLastName;
	
	@FindBy(xpath="//input[@name='billAddress1']")
	private WebElement billAddress1;
	
	@FindBy(xpath="//input[@name='billAddress2']")
	private WebElement billAddress2;
	
	@FindBy(xpath="//input[@name='billCity']")
	private WebElement billCity;
	
	@FindBy(xpath="//input[@name='billState']")
	private WebElement billState;
	
	@FindBy(xpath="//input[@name='billZip']")
	private WebElement billZip;
	
	@FindBy(xpath="//select[@name='billCountry']")
	private WebElement billCountry;
	
	@FindBy(xpath="//input[@name='delAddress1']")
	private WebElement delAddress1;
	
	@FindBy(xpath="//input[@name='delAddress2']")
	private WebElement delAddress2;
	
	@FindBy(xpath="//input[@name='delCity']")
	private WebElement delCity;
	
	@FindBy(xpath="//input[@name='delState']")
	private WebElement delState;
	
	@FindBy(xpath="//input[@name='delZip']")
	private WebElement delZip;
	
	@FindBy(xpath="//select[@name='delCountry']")
	private WebElement delCountry;
	
	@FindBy(xpath="//input[@name='buyFlights']")
	private WebElement purchaseButton;
	
	public BookFlightPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setFirstName0(String fn) {
		passFirst0.sendKeys(fn);
	}
	
	public void setLastName0(String ln) {
		passLast0.sendKeys(ln);
	}
	
	public void setMeal0(String meal) {
		Select s = new Select(passMeal0);
		s.selectByVisibleText(meal);
	}
	
	public void setFirstName1(String fn) {
		passFirst1.sendKeys(fn);
	}
	
	public void setLastName1(String ln) {
		passLast1.sendKeys(ln);
	}
	
	public void setMeal1(String meal) {
		Select s = new Select(passMeal1);
		s.selectByVisibleText(meal);
	}
	
	public void setCardType(String cardType) {
		Select s = new Select(creditCard);
		s.selectByVisibleText(cardType);
	}
	
	public void setcardNumber(String cardNumber) {
		creditNumber.sendKeys(cardNumber);
	}
	
	public void setExpiryMonth(String expiryMonth) {
		Select s = new Select(ccExpiryMonth);
		s.selectByVisibleText(expiryMonth);
	}
	
	public void setExpiryYear(String expiryYear) {
		Select s = new Select(ccExpiryYear);
		s.selectByVisibleText(expiryYear);
	}
	
	public void setCardFirstName(String cardfn) {
		ccFirstName.sendKeys(cardfn);
	}
	
	public void setCardMidName(String cardmn) {
		ccMidName.sendKeys(cardmn);
	}
	
	public void setCardLastName(String cardln) {
		ccLastName.sendKeys(cardln);
	}
	
	public void setBillAddress1(String billAddress) {
		billAddress1.clear();
		billAddress1.sendKeys(billAddress);
	}
	
	public void setBillAddress2(String billAddress) {
		billAddress2.sendKeys(billAddress);
	}
	
	public void setBillCity(String billCity1) {
		billCity.clear();
		billCity.sendKeys(billCity1);
	}
	
	public void setBillState(String billState1) {
		billState.clear();
		billState.sendKeys(billState1);
	}
	
	public void setBillZip(String billZip1) {
		billZip.clear();
		billZip.sendKeys(billZip1);
	}
	
	public void setBillCountry(String billcountry1) {
		Select s = new Select(billCountry);
		s.selectByVisibleText(billcountry1);
	}
	
	public void setDelAddress1(String delAddress) {
		delAddress1.clear();
		delAddress1.sendKeys(delAddress);
	}
	
	public void setDelAddress2(String delAddress) {
		delAddress2.sendKeys(delAddress);
	}
	
	public void setDelCity(String delCity1) {
		delCity.clear();
		delCity.sendKeys(delCity1);
	}
	
	public void setDelState(String delState1) {
		delState.clear();
		delState.sendKeys(delState1);
	}
	
	public void setDelZip(String delZip1) {
		delZip.clear();
		delZip.sendKeys(delZip1);
	}
	
	public void setDelCountry(String delcountry1) {
		Select s = new Select(delCountry);
		s.selectByVisibleText(delcountry1);
	}
	
	public void clickSecurePurchase() {
		purchaseButton.click();
	}

}
