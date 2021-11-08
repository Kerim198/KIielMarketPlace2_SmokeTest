package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US52_54_Page;
import utilities.BrowserUtilities;

public class US52_Defs {
    //sprint2
    US52_54_Page page52 = new US52_54_Page();

    @Given("user clicks my profile button")
    public void userClicksMyProfileButton() {
        page52.myProfileButton.click();
    }

    @Then("logout button should be enable")
    public void logoutButtonShouldBeEnable() {
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(page52.logoutButton.isEnabled());
    }

    @Given("User clicks the logout button")
    public void userClicksTheLogoutButton() {
        page52.logoutButton.click();
    }

    @Then("User should be able to see login button")
    public void userShouldBeAbleToSeeLoginButton() {
        BrowserUtilities.waitFor(2);
        Assert.assertTrue(page52.loginButton.isDisplayed());
    }
}