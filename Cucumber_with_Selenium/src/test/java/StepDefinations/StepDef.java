package StepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Login_page;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {


	public WebDriver driver;
	public Login_page page;

	@Given("user launch Chrome browser")

	public void user_launch_chrome_browser() 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		page = new Login_page(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String URL) 
	{
		driver.get(URL);
	}

	@When("user enter valid Email as {string} and Valid password as {string}")
	public void user_enter_valid_email_as_and_valid_password_as(String string, String string2) 
	{

		page.EnterEmail(string);
		page.password(string2);

	}

	@When("click on Login")
	public void then_click_on_login() 
	{
		page.LoginPage();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) 
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(ExpectedTitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}


	@When("User click on Logout link")
	public void user_click_on_logout_link() 
	{
		page.LogoutPage();
	}

	@Then("close Browser")
	public void close_browser1() 
	{
		driver.close();
		driver.quit();
	}


	///////////////////////// Add new Customers///////////////////

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {

	}

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {

	}

	@When("User click on customers Menu")
	public void user_click_on_customers_menu() {

	}

	@When("click on customers Menu Item")
	public void click_on_customers_menu_item() {

	}

	@When("click on Add new button")
	public void click_on_add_new_button() {

	}

	@Then("User can view Add a new customer page")
	public void user_can_view_add_a_new_customer_page() {

	}

	@When("User enter customer info")
	public void user_enter_customer_info() {

	}

	@When("click on Save button")
	public void click_on_save_button() {
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	}

	@Then("close browser")
	public void close_browser() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
