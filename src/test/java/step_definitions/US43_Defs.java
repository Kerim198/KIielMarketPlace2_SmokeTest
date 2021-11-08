package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US43_Page;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US43_Defs {
    US43_Page page = new US43_Page();

    @And("the user goes to the {string}")
    public void theUserGoesToThe(String url) {
        BrowserUtilities.waitFor(3);
        Driver.getDriver().get(url);
    }

    @Then("Verify save ad button is enabled")
    public void verifySaveAdButtonIsEnabled() {
        Assert.assertTrue(page.saveAdButton.isEnabled());
    }

    @And("Enter required info")
    public void enterRequiredInfo() {
        String projectPath = System.getProperty("user.dir");
        BrowserUtilities.waitFor(2);
        page.header.sendKeys("Araba");
        BrowserUtilities.waitFor(5);
        page.firstP.sendKeys (projectPath+"/src/test/resources/us43_pictures/Admin_Postman_Ekran_Görüntüsü.png");
        BrowserUtilities.waitFor(2);
        page.secondP.sendKeys (projectPath+"/src/test/resources/us43_pictures/YetkilPostman_Ekran_Görüntüsü.png");
        BrowserUtilities.waitFor(2);
        page.description.sendKeys("Bu bir klasik araba");
        Select select = new Select(page.categoriesDropdown);
        select.selectByIndex(2);
        BrowserUtilities.waitFor(2);
        Select select1 = new Select(page.countryListDropdown);
        select1.selectByIndex(4);
        page.phoneDropdown.sendKeys("+905358125573");
    }

    @And("Click save ad button")
    public void clickSaveAdButton() {
        page.saveAdButton.click();
    }

    @Then("Verify the message is {string}")
    public void verifyTheMessageIs(String expectedMessage) {
        Assert.assertTrue(page.message.getText().contains(expectedMessage));
    }



    }

