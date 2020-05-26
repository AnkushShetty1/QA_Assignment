package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[contains(@href,'mercuryregister')]")
	private WebElement regButton;
	
	@FindBy(xpath="//input[@name='userName']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	private WebElement signinButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickRegister() {
		regButton.click();
	}
	
	public void setUserName(String un) {
		userName.sendKeys(un);
	}
	
	public void setPassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void clickSignin() {
		signinButton.click();
	}

}
