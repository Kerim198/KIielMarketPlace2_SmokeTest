package step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPagee;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;


public class Login_StepDefs {

    LoginPagee loginPage = new LoginPagee();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("keseUrl"));
        BrowserUtilities.waitFor(1);
        loginPage.loginButton.click();
    }

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String username, String password) {

        loginPage.loginAsCreatedNewUser(username, password);
    }

    @When("the user enters the admin credentials")
    public void the_user_enters_the_admin_credentials() {

        loginPage.loginAsAdmin();
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtilities.waitFor(1);
        String expectedUrl = "https://kese.nl/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @When("the user enters the user credentials")
    public void the_user_enters_the_user_credentials() {

        loginPage.loginAsUser();
    }

    @When("the user enters the local manager credentials")
    public void the_user_enters_the_local_manager_credentials() {

        loginPage.loginAsLocalManager();
    }
}