package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import pages.US018_HomePage;
import pages.US018_LoginPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US018_LoginStepDefs {
    US018_LoginPage login = new US018_LoginPage();
    US018_HomePage home = new US018_HomePage();

    @Given("The user goes to {string} page")
    public void theUserGoesToPage(String loginUrl) {
        Driver.getDriver().get(loginUrl);
    }

    @When("The user login to the system by using username and password")
    public void theUserLoginToTheSystemByUsingAnd() {

        /* login.emailGirinizInput.sendKeys(username);
        login.sifreGirinizInput.sendKeys(password);
        login.girisYapButton.click();*/
        login.loginConf();
        BrowserUtilities.waitFor(5);
        Assert.assertEquals("https://kese.nl/", Driver.getDriver().getCurrentUrl());

    }

    @Then("The user is redirected to the homepage as logged in and sees the profilim button at the top right")
    public void theUserIsRedirectedToTheHomepageAsLoggedInAndSeesTheButtonAtTheTopRight() {
        BrowserUtilities.verifyElementDisplayed(home.profilimButton);
    }

    @When("The user enters the wrong {string} or {string} information or both information incorrectly and clicks the US018_LoginPage button")
    public void theUserEntersTheWrongOrInformationOrBothInformationIncorrectlyAndClicksTheLoginButton(String username, String password) {
        /*login.emailGirinizInput.sendKeys(Username);
        login.sifreGirinizInput.sendKeys(Password);
        login.girisYapButton.click();*/
            if (username.equals("") || password.equals("")) {
              String browserPopup = Driver.getDriver().findElement(By.name("email")).getAttribute("validationMessage");
                login.userLogin(username, password);
                Assert.assertEquals("Please fill out this field.",browserPopup );
            } else
                login.userLogin(username, password);
    }
    @Then("User {string} sees the text.")
    public void userSeesTheText(String expectedErrorMessage)  {
        //BrowserUtilities.verifyElementDisplayed(login.emailYadaSifreHatali);
        try {
            Assert.assertEquals(login.emailYadaSifreHatali.getText(),"Email ya da şifre hatalı.");
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
        }
        Assert.assertEquals(login.emailGirinizInput.getAttribute("placeholder"),"Email giriniz");
    }
}
