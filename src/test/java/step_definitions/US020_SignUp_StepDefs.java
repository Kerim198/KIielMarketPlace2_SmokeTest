package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US020_SignUp_Page;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US020_SignUp_StepDefs {

    US020_SignUp_Page page = new US020_SignUp_Page();
    String userName;
    String password = "1234";
    String email;
    @Given("The User goes to {string} page")
    public void the_User_goes_to_page(String url) {
        Driver.getDriver().get(url);
    }
    @When("user creates a random credentials and signup")
    public void signUpWithRandomCredentials() {
        userName = getRandomString(4);
        email = getRandomString(4) + "@nonmail.com";
        page.UserName.sendKeys(userName);
        BrowserUtilities.waitFor(2);
        page.Email.sendKeys(email);
        page.Password.sendKeys(password);
        page.Repassword.sendKeys(password);
        page.CheckBox.click();
        page.signUpButton.click();
        BrowserUtilities.waitForPageToLoad(5);
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertTrue(signInButtonElement.isDisplayed());
        page.kayitOl.click();
    }
    @And("user tries to use the same {string} for signup again")
    public void userTriesToUseTheSameForSignupAgain(String userName) {
        switch (userName) {
            case "email": // email didn't change
                userName = getRandomString(8);
                break;
            case "username": // password didn't change
                email = getRandomString(8) + "@nonmail.com";
                break;
        }
        page.UserName.sendKeys(userName);
        page.Email.sendKeys(email);
        page.Password.sendKeys(password);
        page.Repassword.sendKeys(password);
        page.CheckBox.click();
        page.signUpButton.click();
//        BrowserUtilities.waitForPageToLoad(5);
//        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
//        Assert.assertTrue(signInButtonElement.isDisplayed());
//        page.kayitOl.click();
    }
    @Then("user verifies {string} and can't signup on signup page")
    public void userVerifiesAndCanTSignupOnSignupPage(String arg0) {
        WebElement signInButtonElement= page.girisYapButtonOnSignInPage;
        Assert.assertThrows(org.openqa.selenium.NoSuchElementException.class, signInButtonElement::isDisplayed);
        WebElement textElement = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + arg0 + "')]"));
        Assert.assertTrue(textElement.isDisplayed());
//        System.out.println(page.emailagain.getText());
//        System.out.println(page.usernameagain.getText());
    }
    private String getRandomString(int length) {
        String possibleLetters = "abcdefgijklmopqrstuvwxyzQWERTYUIOPLKJHGFDSAZXCVBNM";
        char[] rndWord = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * possibleLetters.length());
            rndWord[i] = possibleLetters.charAt(rand);
        }
        return new String(rndWord);
    }
    }