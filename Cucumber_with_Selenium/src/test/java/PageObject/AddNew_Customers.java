package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNew_Customers {

	WebDriver ldriver;

	public AddNew_Customers (WebDriver rDriver)
	{
		ldriver = rDriver;

		PageFactory.initElements(rDriver, this);
	}

	/////// Find web Elements on web page

	@FindBy(xpath= "//a[@href=\"#\"]//p[contain (text(), 'Customers')]")
	WebElement linkCustomers_menu;

	@FindBy(xpath= "//a[href=\"/Admin/Customer/List\"]//p[contain (text(), 'Customers')]")
	WebElement linkCustomers_menuitem;

	@FindBy(xpath= "//a[@class=\"btn btn-primary\"]")
	WebElement btnAddnew;

	@FindBy(xpath= "//*[@id=\"Email\"]")
	WebElement txtEmail;

	@FindBy(xpath= "//*[@id=\"Password\"]")
	WebElement txtPassword;

	@FindBy(xpath= "//div[@class=\"k-multiselect-wrap k-floatwrap\"]")
	WebElement txtCsutomersRoles;

	@FindBy(xpath= "//*[@id=\"FirstName\"]")
	WebElement txtFirstName;

	@FindBy(xpath= "//*[@id=\"LastName\"]")
	WebElement txtLastName;

	@FindBy(xpath= "//*[@id=\"Gender_Male\"]")
	WebElement txtMaleGender;

	@FindBy(xpath = "//*[@id=\"DateOfBirth\"]")
	WebElement txtDOB;

	@FindBy(xpath="//input[@id=\"Company\"]")
	WebElement txtCompany;

	@FindBy(xpath="//li[contains(text(), 'Administrators')]")
	WebElement txtAdministrators;

	@FindBy(xpath="//li[contains(text(), 'Forum Moderators')]")
	WebElement txtForumModerators;

	@FindBy(xpath="//li[contains(text(), 'Guests')]")
	WebElement txtGuests;

	@FindBy(xpath="//*[@id=\"AdminComment\"]")
	WebElement txtAdminComment;

	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement txtSubmit;

	//Actions Methods for web elements

		public String getPageTitle()
		{
			return ldriver.getTitle();
		}

		public void clickOnCustomersMenu() {
			linkCustomers_menu.click();
		}

		public void clickOnCustomersMenuItem() {
			linkCustomers_menuitem.click();
		}

		public void clickOnAddnew() {
			btnAddnew.click();
		}

		public void enterEmail(String email)
		{
			txtEmail.sendKeys(email);
		}

		public void enterPassword(String password)
		{
			txtPassword.sendKeys(password);
		}
		public void enterFirstName(String firstName)
		{
			txtFirstName.sendKeys(firstName);
		}

		public void enterLastName(String lastName)
		{
			txtLastName.sendKeys(lastName);
		}

		public void enterDob(String dob)
		{
			txtDOB.sendKeys(dob);
		}

		public void enterCompanyName(String coName)
		{
			txtCompany.sendKeys(coName);
		}

		public void enterAdminContent(String content)
		{
			txtAdminComment.sendKeys(content);
		}

		/*public void enterCustomerRoles(String role)  
		{
		}*/

		public void enterManagerOfVendor(String value)
		{
			Select drp=new Select(linkCustomers_menu);
			drp.selectByVisibleText(value);
		}

		public void enterGender(String gender)
		{
			if(gender.equals("Male"))
			{
				txtMaleGender.click();
			}
			else if(gender.equals("Female"))
			{
				txtMaleGender.click();
			}
			else//default set Male gender
			{
				txtMaleGender.click();
			}

		}

		

		public void clickOnSave()
		{
			txtSubmit.click();
		}

	}