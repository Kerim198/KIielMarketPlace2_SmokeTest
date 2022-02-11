package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US055_BackButtonPage;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US055_BackButtonStepDefs {

   US055_BackButtonPage newHomePage = new US055_BackButtonPage();

    @Given("user chooses {string} as house type on the new home step one page")
    public void userChoosesAsHouseTypeOnTheNewHomeStepOnePage(String tip) {
        if(tip.equalsIgnoreCase("Müstakil Ev")){
            newHomePage.step1_MustakilEvOption.click();
            BrowserUtilities.waitFor(2);
        }else if(tip.equalsIgnoreCase("Apartman Dairesi")){
            newHomePage.step1_ApartmanDairesiOption.click();
            BrowserUtilities.waitFor(2);
        }else{ //Stüdyo Daire
            newHomePage.step1_StudyoDaireOption.click();
            BrowserUtilities.waitFor(2);
        }
    }

    @And("user verifies the geri button is enabled")
    public void userVerifiesTheGeriButtonIsEnabled() {
        boolean isEnabled = newHomePage.geriButton.isEnabled();

        Assert.assertTrue(isEnabled);
    }

    @And("user clicks to the geri button")
    public void userClicksToTheGeriButton() {
        newHomePage.geriButton.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user verifies {string} is selected on the new home step one page")
    public void userVerifiesIsSelectedOnTheNewHomeStepOnePage(String tip) {
        if(tip.equalsIgnoreCase("Müstakil Ev")){
            String classDegerleri = newHomePage.step1_MustakilEvOption.getAttribute("class");
            BrowserUtilities.waitFor(2);
            System.out.println(newHomePage.step1_MustakilEvOption.getAttribute("class"));
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }else if(tip.equalsIgnoreCase("Apartman Dairesi")){
            String classDegerleri = newHomePage.step1_ApartmanDairesiOption.getAttribute("class");
            BrowserUtilities.waitFor(2);
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }else{ //Stüdyo Daire
            String classDegerleri = newHomePage.step1_StudyoDaireOption.getAttribute("class");
            BrowserUtilities.waitFor(2);
            Assert.assertTrue(classDegerleri.contains("border-warning"));
        }
    }

    @And("user types {string} to the ev otobus input on the new home step two page")
    public void userTypesToTheEvOtobusInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvOtobusInput.clear();
        newHomePage.step2_EvOtobusInput.sendKeys(mesafe);
    }

    @And("user types {string} to the ev tren input on the new home step two page")
    public void userTypesToTheEvTrenInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTrenInput.clear();
        newHomePage.step2_EvTrenInput.sendKeys(mesafe);
    }

    @And("user clicks to the ilerle button on the new home page")
    public void userClicksToTheIlerleButtonOnTheNewHomePage() {
        newHomePage.ilerleButton.click();
        BrowserUtilities.waitFor(2);
    }

    @And("user chooses {string} an address from the list in new home step two page")
    public void userChoosesAnAddressFromTheListInNewHomeStepTwoPage(String adres) {
        newHomePage.step2_AddressInput.sendKeys(adres); // Keys.ENTER
        BrowserUtilities.waitFor(3);
        Driver.getDriver().findElement(By.cssSelector("[id$='-option-0']")).click();
      //  Driver.getDriver().findElement(By.xpath("//div[@class= ' css-1uccc91-singleValue']")).click();

    }

    @And("user clicks on the increment buttons on the new home step three page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepThreePage() {
        for(WebElement e : newHomePage.step3_incrementButtons){
            e.click();
        }
    }

    @And("user types a description as {string} to the input on the new home step six page")
    public void userTypesADescriptionAsToTheInputOnTheNewHomeStepSixPage(String aciklama) {
        newHomePage.step6_DescInput.sendKeys(aciklama);
    }

    @And("user clicks to the all hayir options on the new home step eight page")
    public void userClicksToTheAllHayirOptionsOnTheNewHomeStepEightPage() {
        for(WebElement e : newHomePage.step8_HayirOptions){
            e.click();
        }
    }

    @And("user chooses the date on the new home step nine page")
    public void userChoosesTheDateOnTheNewHomeStepNinePage() {
        newHomePage.step9_FirstDatePickerInput.click();
        newHomePage.step9_TodayOption.click();
        BrowserUtilities.waitFor(1);
        newHomePage.step9_TodayOption.click();
    }

    @When("the user clicks advertise button")
    public void the_user_clicks_advertise_button() {
        newHomePage.advertiseButton.click();
    }

    @When("the user clicks home exchange link")
    public void the_user_clicks_home_exchange_link() {

        newHomePage.homeExchangeButton.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("the user should be on the {string} page")
    public void the_user_should_be_on_the_page(String expectedSubTitle) {
        newHomePage.getSubTitle(expectedSubTitle);

    }

    @And("user types usage area as {string} to the input on the new home step three page")
    public void userTypesUsageAreaAsToTheInputOnTheNewHomeStepThreePage(String sayi) {
        newHomePage.step3_UsageAreaInput.sendKeys(sayi);
    }

    @And("user clicks to the checkbox on the new home step two page")
    public void userClicksToTheCheckboxOnTheNewHomeStepTwoPage() {
        newHomePage.step2_CheckBox.click();
    }

    @And("user types {string} to the ev tramway input on the new home step two page")
    public void userTypesToTheEvTramwayInputOnTheNewHomeStepTwoPage(String mesafe) {
        newHomePage.step2_EvTramwayInput.clear();
        newHomePage.step2_EvTramwayInput.sendKeys(mesafe);
    }

    @And("user verifies the variable of ev otobus input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvOtobusInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvOtobusInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the variable of ev tren input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTrenInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTrenInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the variable of ev tramway input equals {string} on the new home step two page")
    public void userVerifiesTheVariableOfEvTramwayInputEqualsOnTheNewHomeStepTwoPage(String mesafe) {
        String value = newHomePage.step2_EvTramwayInput.getAttribute("value");
        Assert.assertEquals(value, mesafe);
    }

    @And("user verifies the checkbox is checked on the new home step two page")
    public void userVerifiesTheCheckboxIsCheckedOnTheNewHomeStepTwoPage() {
        boolean isChecked = newHomePage.step2_CheckBox.isSelected();
        Assert.assertTrue(isChecked);
    }

    @And("user verifies that the numbers are {int} {int} {int} {int} on the new home step three pagee")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepThreePagee(int sayi1, int sayi2, int sayi3, int sayi4) {
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(0).getText(), sayi1+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(1).getText(), sayi2+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(2).getText(), sayi3+"");
        Assert.assertEquals(newHomePage.step3_AllNumbers.get(3).getText(), sayi4+"");
    }

    @And("user verifies the value of usage area input is {string} on the new home step three pagee")
    public void userVerifiesTheValueOfUsageAreaInputIsOnTheNewHomeStepThreePagee(String deger) {
        String value = newHomePage.step3_UsageAreaInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks on the increment buttons on the new home step four page")
    public void userClicksOnTheIncrementButtonsOnTheNewHomeStepFourPage() {
        for(WebElement e : newHomePage.step4_incrementButtons){
            e.click();
        }
    }


    @And("user clicks to the all options on the new home step five page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepFivePage() {
        for(WebElement e : newHomePage.step5_AllOptions){
            e.click();
        }
    }

    @And("user verifies the all options are selected on the new home step five page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepFivePage() {
        for(WebElement e : newHomePage.step5_AllOptions){
           Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @And("user verifies the value of description input is same with {string} on the new home step six page")
    public void userVerifiesTheValueOfDescriptionInputIsSameWithOnTheNewHomeStepSixPage(String deger) {
        String value = newHomePage.step6_DescInput.getAttribute("value");
        Assert.assertEquals(value, deger);
    }

    @And("user clicks to the all options on the new home step seven page")
    public void userClicksToTheAllOptionsOnTheNewHomeStepSevenPage() {
        for(WebElement e : newHomePage.step7_AllOptions){
            e.click();
        }
    }

    @And("user verifies the all options are selected on the new home step seven page")
    public void userVerifiesTheAllOptionsAreSelectedOnTheNewHomeStepSevenPage() {
        for(WebElement e : newHomePage.step7_AllOptions){
            Assert.assertTrue(e.getAttribute("class").contains("border-warning"));
        }
    }

    @And("user verifies the all hayir options are selected on the new home step eight page")
    public void userVerifiesTheAllHayirOptionsAreSelectedOnTheNewHomeStepEightPage() {
        for(WebElement e : newHomePage.step8_HayirOptions){
            Assert.assertTrue(e.getAttribute("class").contains("bg-warning"));
        }
    }

    @And("user verifies {string} is visible on the new home step two page")
    public void userVerifiesIsVisibleOnTheNewHomeStepTwoPage(String text) {
        WebElement yazi = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        Assert.assertTrue(yazi.isDisplayed());
    }

    @And("user verifies {string} is visible new home step nine page")
    public void userVerifiesIsVisibleNewHomeStepNinePage(String text) {
        WebElement yazi = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+text+"')]"));
        Assert.assertTrue(yazi.isDisplayed());
    }

    @And("user verifies that the numbers are {int} {int} {int} {int} {int} {int} {int} {int} on the new home step four pagee")
    public void userVerifiesThatTheNumbersAreOnTheNewHomeStepFourPagee(int sayi1, int sayi2, int sayi3, int sayi4, int sayi5, int sayi6, int sayi7, int sayi8) {

        Assert.assertEquals(newHomePage.step4_AllNumbers.get(0).getText(), sayi1+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(1).getText(), sayi2+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(2).getText(), sayi3+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(3).getText(), sayi4+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(4).getText(), sayi5+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(5).getText(), sayi6+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(6).getText(), sayi7+"");
        Assert.assertEquals(newHomePage.step4_AllNumbers.get(7).getText(), sayi8+"");

    }



//    public static class US_049_EvDegis_Step9_StepDef {
//
//        US055_BackButtonPage.US049_IlanVer_EvDegStep9_Page page = new US055_BackButtonPage.US049_IlanVer_EvDegStep9_Page();
//
//        @And("clicks the ilan ver button and than the ev degisimi link MY")
//        public void clicksTheIlanVerButtonAndThanTheEvDegisimiLinkUs() {
//            page.ilanVerButton.click();
//            BrowserUtilities.waitFor(2);
//            page.evDegisimiLink.click();
//        }
//
//
//        @And("user chooses house type, on the new home step, one page MY")
//        public void userChoosesHouseTypeOnTheNewHomeStepOnePageUs() {
//            page.step1_MustakilEvOption.click();
//        }
//
//
//        @And("user clicks to the ilerle button, on the new home page MY")
//        public void userClicksToTheIlerleButtonOnTheNewHomePageUs() {
//            page.ilerleButton.click();
//        }
//
//
//        @And("user chooses {string} an address from the list, in new home step, two page MY")
//        public void userChoosesAnAddressFromTheListInNewHomeStepTwoPageMY(String adress) {
//            page.step2_AdressInput.sendKeys(adress + Keys.ENTER);
//        }
//
//        @And("user clicks to the checkbox, on the new home step, two page MY")
//        public void userClicksToTheCheckboxOnTheNewHomeStepTwoPageMY() {
//            page.step2_EvOtobusInput.sendKeys("5");
//            page.step2_EvTrenInput.sendKeys("6");
//            page.step2_EvTramwayInput.sendKeys("7");
//        }
//
//
//        @And("user types usage area as {String} to the input, on the new home step, three page MY")
//        public void userTypesUsageAreaAsToTheInputOnTheNewHomeStepThreePageMY(String alan) {
//            page.step3_KullanimAlaniInput.sendKeys(alan);
//        }
//
//        @And("user clicks on the increment buttons, on the new home step, three page MY")
//        public void userClicksOnTheIncrementButtonsOnTheNewHomeStepThreePageUs() {
//
//        }
//
//    }
}