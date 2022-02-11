package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US021_SignUp_page;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US021_SignUp_StepDef {

    US021_SignUp_page passwordIssue = new US021_SignUp_page();
    String   username="ayten tecim";
    String password  ;
    String repassword;
    String email= "tecimayten@gmail.com";

    @Given("The users go to {string} page")
    public void the_User_goes_to_page(String url) {
        Driver.getDriver().get(url);
    }

    @Then("The user verifies {string} on signup page")
    public void theUserVerifiesOnSignupPage(String textss) {
        WebElement textElement = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" +textss + "')]"));
        Assert.assertTrue(textElement.isDisplayed());
        System.out.println(textss);
    }


//    @When("user creates a random credential and signup")
//    public void signUpWithRandomCredential() {
//        username = getRandomString(4);
//        email = getRandomString(4) + "@nonmail.com";
//        passwordIssue.kullaniciadi.sendKeys(userName);
//        BrowserUtilities.waitFor(2);
//        passwordIssue.Emailiyaz.sendKeys(email);
//        passwordIssue.sifre.sendKeys(password);
//        passwordIssue.Repassword.sendKeys(password);
//        passwordIssue.checkbox.click();
//        passwordIssue.signUpButton.click();
//        BrowserUtilities.waitForPageToLoad(5);
//        WebElement signInButtonElement= passwordIssue.girisYapButtonOnSignInPage;
//        Assert.assertTrue(signInButtonElement.isDisplayed());
//        passwordIssue.kayitOl.click();
//    }
    @When("The user should enter same data two times for password")
    public void theUserShouldEnterSameDataTwoTimesForPassword() {
      password = getRandomString(9);
      repassword=getRandomString(21);
        passwordIssue.kullaniciadi.sendKeys(username);
        passwordIssue.Emailiyaz.sendKeys(email);
        passwordIssue.sifre.sendKeys(password);
        passwordIssue.sifreagain.sendKeys(repassword);
        passwordIssue.checkbox.click();
        passwordIssue.submitButton.click();
        BrowserUtilities.waitForPageToLoad(3);
    }
    private String getRandomString(int length) {
        String possibleLetters = "abcdefgijklmopqrstuvwxyzQWERTYUIOPLKJHGFDSAZXCVBNM123456789";
        char[] rndWord = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * possibleLetters.length());
            rndWord[i] = possibleLetters.charAt(rand);
        }
        return new String(rndWord);
    }


}