package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	WebDriver ldriver;

	public Login_page(WebDriver rDriver)
	{
		ldriver = rDriver;
		
		PageFactory.initElements(rDriver, this);
	
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy (xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement LOGIN;
	
	@FindBy(linkText= "Logout")
	WebElement Logout;
	
	public void EnterEmail(String emailadd)
	{
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void password (String Password_Add)
	{
		password.clear();
		password.sendKeys(Password_Add);
	}
	
	public void LoginPage()
	{
		LOGIN.click();
	}
	
	public void LogoutPage()
	{
		Logout.click();
	}
	
	
	
	
	
	
}