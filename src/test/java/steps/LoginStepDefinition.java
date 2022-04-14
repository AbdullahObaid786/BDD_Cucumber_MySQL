package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BasePage;
import pages.DatabasePage;
import pages.LoginPage;

public class LoginStepDefinition extends BasePage {
	DatabasePage databasepage;
	LoginPage loginPage;

	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasepage = new DatabasePage ();
	}

	@Given("^User is on Techfios login page$")
	public void user_is_on_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button() {
		loginPage.signInButton();

	}

	@Then("^User Should land on dashboard page$")
	public void user_Should_land_on_dashboard_page() {
		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitile());
		takeScreenShot(driver);
	}

	// reading from Database MySQL
	@When("^User enters \"([^\"]*)\" from database$")
	public void user_enters_from_database(String loginData) {

//		if (loginData.equalsIgnoreCase("username")) {
//
//		} else if (loginData.equalsIgnoreCase("password")) {
//
//		} else {
//			System.out.println("unable to extract login Data" + loginData + "from DB");
//		}

		switch (loginData) {
		case "username":
			loginPage.enterUserName(databasepage.getData("username"));
			System.out.println("Username from DB: " + databasepage.getData("username"));
			break;

		case "password":
			loginPage.enterPassword(databasepage.getData("password"));
			System.out.println("password from DB: " + databasepage.getData("password"));
			break;
			
		default:
			System.out.println("unable to extract login Data" + loginData + "from DB");
		}
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
