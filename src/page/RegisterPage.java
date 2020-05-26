package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(id="userName")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='address1']")
	private WebElement address1;
	
	@FindBy(xpath="//input[@name='address2']")
	private WebElement address2;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement postalCode;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement country;
	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@name='register']")
	private WebElement registerButton;
	
	@FindBy(xpath="//a[contains(text(),' sign-in ')]")
	private WebElement signinButton;
	
	@FindBy(xpath="//font[contains(text(),'Thank you')]")
	private WebElement registrationSuccessMesg;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setFirstName(String fn) {
		firstName.sendKeys(fn);
	}
	
	public void setLastName(String ln) {
		lastName.sendKeys(ln);
	}
	
	public void setPhone(String number) {
		phone.sendKeys(number);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public void setAddress1(String adr1) {
		address1.sendKeys(adr1);
	}
	
	public void setAddress2(String adr2) {
		address2.sendKeys(adr2);
	}
	
	public void setCity(String city1) {
		city.sendKeys(city1);
	}
	
	public void setState(String state1) {
		state.sendKeys(state1);
	}
	
	public void setPostalCode(String pc) {
		postalCode.sendKeys(pc);
	}
	
	public void setCountry(String country1) {
		Select s = new Select(country);
		s.selectByVisibleText(country1);
	}
	
	public void setUserName(String un) {
		userName.sendKeys(un);
	}
	
	public void setpassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void setConfirmPassword(String cpw) {
		confirmPassword.sendKeys(cpw);
	}
	
	public void clickRegister() {
		registerButton.click();
	}
	
	public void clickSignin() {
		signinButton.click();
	}
	
	public boolean successMessage() {
		boolean message = registrationSuccessMesg.isDisplayed();
		return message;
	}
	
}
