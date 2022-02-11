package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import pages.LoginPagee;
import pages.US080_NewRoomBackwardFunctionalityPage;
import utilities.BrowserUtilities;
import utilities.Driver;

import java.util.LinkedList;
import java.util.List;


public class US080_NewRoomBackwardFunctionality_StepDef {

    LoginPagee loginPage = new LoginPagee();

    US080_NewRoomBackwardFunctionalityPage newRoomPage=
                      new US080_NewRoomBackwardFunctionalityPage();



    @Given("user goes to {string} page US_Eighty")
    public void userGoesToPage(String url) {
        Driver.getDriver().get(url);
    }

    @And("user logs into website US_Eighty")
    public void userLogsIntoWebsite() {
        loginPage.loginAsUser();
        BrowserUtilities.waitFor(2);

    }
    /** FIRST PAGE */

    @And("user chooses {string} as house type on the new room, step first page US_Eighty")
    public void userChoosesAsHouseTypeOnTheNewRoomStepFirstPageUS(String homeType) {
        newRoomPage.getHomeType(homeType).click();
      //  BrowserUtilities.waitFor(2);
    }

    @And("user clicks to {string} on the new room, step first page US_Eighty")
    public void userClicksToTheCheckboxUS(String checkbox) {
        newRoomPage.getCheckboxes(checkbox).click();
       // BrowserUtilities.waitFor(2);
    }


    @And("user clicks to the forward button on the new room page US_Eighty")
    public void userClicksToTheForwardButtonOnTheNewRoomPageUS() {
        newRoomPage.forwardButton.click();
       // BrowserUtilities.waitFor(1);
    }

    @Then("user verifies the back button is enabled US_Eighty")
    public void userVerifiesTheBackButtonIsEnabledUS() {
        Assert.assertTrue(newRoomPage.backButton.isEnabled() );
       // BrowserUtilities.waitFor(1);
    }

    @And("user clicks to the back button US_Eighty")
    public void userClicksToTheBackButtonUS() {
        newRoomPage.backButton.click();
        BrowserUtilities.waitFor(2);
    }

    @Then("user verifies {string} is selected on the new room step first page US_Eighty")
    public void userVerifiesIsSelectedOnTheNewRoomStepFirstPageUS(String homeType) {
        Assert.assertTrue( newRoomPage.getHomeType(homeType).getAttribute("class").contains("border-warning"));
       // BrowserUtilities.waitFor(2);
    }

    @Then("user verifies that {string} is selected US_Eighty")
    public void userVerifiesThatCheckboxIsSelectedUS(String checkbox) {
        Assert.assertTrue( newRoomPage.getCheckboxes(checkbox).isSelected() );
       // BrowserUtilities.waitFor(2);

    }

/** SECOND PAGE */

    @And("user chooses {string} as a location from the list in new room, step second page US_Eighty")
    public void userChoosesAsALocationFromTheListInNewRoomStepSecondPageUS(String location) {

        newRoomPage.step2_AddressInput.sendKeys(location);
        BrowserUtilities.waitFor(1);
        Driver.getDriver().findElement(By.cssSelector("[id$='-option-0']")).click();
   //The [attribute$=value] selector matches every element whose attribute value ends with a specified value.


/**
 *  String contents = newRoomPage.step2_AddressList.getAttribute("innerHTML");
 *         System.out.println("contents = " + contents);
 *
 *
 *         contents = <div class="css-11unzgr">
 *         <div class=" css-1n7v3ny-option" id="react-select-3-option-0" tabindex="-1">Arizona, Amerika Birleşik Devletleri</div>
 *         <div class=" css-yt9ioa-option" id="react-select-3-option-1" tabindex="-1">Arizona, Teksas, Amerika Birleşik Devletleri</div>
 *         <div class=" css-yt9ioa-option" id="react-select-3-option-2" tabindex="-1">Arizona, Louisiana, Amerika Birleşik Devletleri</div>
 *         <div class=" css-yt9ioa-option" id="react-select-3-option-3" tabindex="-1">Arizona, Nebraska, Amerika Birleşik Devletleri</div>
 *         </div>
 */
    }

    @And("user inputs {string} between the house and the bus stop on the new room, step second page US_Eighty")
    public void userInputsBetweenTheHouseAndTheBusStopOnTheNewRoomStepSecondPageUS(String distance) {
        newRoomPage.step2_busInput.clear();
        newRoomPage.step2_busInput.sendKeys(distance);
    }

    @And("user inputs {string} between the house and the train stop on the new room, step second page US_Eighty")
    public void userInputsBetweenTheHouseAndTheTrainStopOnTheNewRoomStepSecondPageUS(String distance) {
        newRoomPage.step2_trainInput.clear();
        newRoomPage.step2_trainInput.sendKeys(distance);
    }

    @And("user inputs {string} between the house and subway stop on the new room, step second page US_Eighty")
    public void userInputsBetweenTheHouseAndTheBusSubwayOnTheNewRoomStepSecondPageUS(String distance) {
        newRoomPage.step2_subwayInput.clear();
        newRoomPage.step2_subwayInput.sendKeys(distance);
    }

    @And("user clicks to {string} on the new room, step second page US_Eighty")
    public void userClicksToOnTheNewRoomStepSecondPageUS(String checkbox) {
        newRoomPage.step2_CheckBox.click();
    }

    @Then("user verifies {string} is visible US_Eighty")
    public void userVerifiesIsVisibleUS(String location) {

        Assert.assertEquals(location,newRoomPage.step2_AddressText.getText() );

    }

    @Then("user verifies the between the house and the bus stop is {string} km selected on the new room, step second page US_Eighty")
    public void userVerifiesTheBetweenTheHouseAndTheBusStopIsKmSelectedOnTheNewRoomStepSecondPageUSUS(String distance) {
        Assert.assertEquals(distance, newRoomPage.step2_busInput.getAttribute("value"));
    }

    @Then("user verifies the between the house and the train stop is {string} km selected on the new room, step second page US_Eighty")
    public void userVerifiesTheBetweenTheHouseAndTheTrainStopIsKmSelectedOnTheNewRoomStepSecondPageUS(String distance) {
        Assert.assertEquals(distance, newRoomPage.step2_trainInput.getAttribute("value"));
    }

    @Then("user verifies the between the house and the subway stop is {string} km on the new room, step second page US_Eighty")
    public void userVerifiesTheBetweenTheHouseAndTheSubwayStopIsKmOnTheNewRoomStepSecondPageUS(String distance) {
        Assert.assertEquals(distance, newRoomPage.step2_subwayInput.getAttribute("value"));
    }

    @Then("user verifies that {string} is selected on the new room, step second page US_Eighty")
    public void userVerifiesThatIsSelectedOnTheNewRoomStepSecondPageUS(String checkbox) {
        Assert.assertTrue( newRoomPage.step2_CheckBox.isSelected() );
    }

    /** THIRD PAGE */

    @And("user enters the {string} as an area of the room on the new room step third page US_Eighty")
    public void userEntersTheAsAnAreaOfTheRoomOnTheNewRoomStepThirdPageUS(String usageArea) {
       // BrowserUtilities.waitFor(2);
        newRoomPage.step3_UsageAreaInput.sendKeys(usageArea);
    }

    @And("user clicks ones on the all increment button of all areas that you can use in your home on the new room, step third page US_Eighty")
    public void userClicksOnesOnTheAllIncrementButtonOfAllAreasThatYouCanUseInYourHomeOnTheNewRoomStepThirdPageUS() {
        BrowserUtilities.waitFor(1);
        List<WebElement> incrementButtons = newRoomPage.step3_AllIncrementButtons;
        for (WebElement eachIncrementButton : incrementButtons) {
            eachIncrementButton.click();


        }
    }

    @Then("user verifies the value of usage area input is {string} on the new room, step third page US_Eighty")
    public void userVerifiesTheValueOfUsageAreaInputIsOnTheNewRoomStepThirdPageUS(String usageArea) {
        BrowserUtilities.waitFor(1);
        Assert.assertEquals(usageArea,newRoomPage.step3_UsageAreaInput.getAttribute("value"));
    }

    @Then("user verifies that the numbers are {int} {int} {int} {int} on the new room, step third page US_Eighty")
    public void userVerifiesThatTheNumbersAreOnTheNewRoomStepThirdPageUS(int numberOfBed, int numberOfBathroom, int numberOfRestroom, int numberOfLivingRoom) {
        BrowserUtilities.waitFor(2);
        List <WebElement> numberOfUsageAreas = new LinkedList<>(newRoomPage.step3_AllUsageAreaNumbers) ;

        BrowserUtilities.waitFor(1);
        for (int i = 0; i<numberOfUsageAreas.size(); i++) {
//            /** This functionality has  BUG !!!    */
//          /**  After this function fixed by developer, this line will be open */
            Assert.assertEquals(numberOfBed+"",numberOfUsageAreas.get(0).getText() );
            Assert.assertEquals(numberOfBathroom+"",numberOfUsageAreas.get(1).getText() );
            Assert.assertEquals(numberOfRestroom+"",numberOfUsageAreas.get(2 ).getText());
            Assert.assertEquals(numberOfLivingRoom+"",numberOfUsageAreas.get(3).getText() );

        }
    }



    /** FOURTH PAGE */

        @And("user chooses the {string} age range on the new room, step fourth page US_Eighty")
    public void user_chooses_the_age_range_on_the_new_room_step_fourth_page_us080(String ageRange) {
        List<WebElement> allAgeButtons = new LinkedList<>(newRoomPage.getAgeRangeButtons(ageRange) );
        for (WebElement eachButton : allAgeButtons) {
            eachButton.click();
        }
    }

    @And("user chooses the {string} as a gender on the new room, step fourth page US_Eighty")
    public void user_chooses_the_as_a_gender_on_the_new_room_step_fourth_page_us080(String gender) {
        BrowserUtilities.waitFor(1);
         newRoomPage.getGenderButtons(gender).click();

    }

    @And("user clicks ones on the increment button of maximum number of people on the new room, step fourth page US_Eighty")
    public void user_clicks_ones_on_the_increment_button_of_maximum_number_of_people_on_the_new_room_step_fourth_page_us080() {
        BrowserUtilities.waitFor(1);
        newRoomPage.step4_incrementButton.click();
    }

    @Then("user verifies the {string} age range selected on the new room, step fourth page US_Eighty")
    public void user_verifies_the_age_range_selected_on_the_new_room_step_fourth_page_us080(String ageRange) {
        BrowserUtilities.waitFor(1);
        List<WebElement> selectedAllAgeButtons = new LinkedList<>(newRoomPage.getAgeRangeButtons(ageRange));
        for (WebElement eachSelectedAllAgeButton : selectedAllAgeButtons) {
            Assert.assertTrue( eachSelectedAllAgeButton.getAttribute("class").contains("bg-success"));
        }

    }

    @Then("user verifies the {string} is selected as a gender on the new room, step fourth page US_Eighty")
    public void user_verifies_the_is_selected_as_a_gender_on_the_new_room_step_fourth_page_us080(String gender) {
        BrowserUtilities.waitFor(1);
         Assert.assertTrue( newRoomPage.getGenderButtons(gender).getAttribute("class").contains("bg-success"));
    }

    @Then("user verifies the selected maximum number of people number is {int} on the new room, step fourth page US_Eighty")
    public void user_verifies_the_selected_maximum_number_of_people_number_is_on_the_new_room_step_fourth_page_us080(Integer numberOfPeople) {
        BrowserUtilities.waitFor(1);
        Assert.assertEquals(numberOfPeople+"", newRoomPage.step4_incrementButtonValue.getText() );
    }

   /** FIFTH PAGE */

   @And("user selects everything in the list of amenities that the homeowner can provide on the new room, step fifth page US_Eighty")
   public void user_selects_everything_in_the_list_of_amenities_that_the_homeowner_can_provide_on_the_new_room_step_fifth_page_us080() {
          List <WebElement> allAmenities = new LinkedList<>(newRoomPage.step5_allAmenities );
       for (WebElement eachOption : allAmenities) {
           eachOption.click();
           
       }
   }

    @Then("user verifies the all options are selected on the new room, step fifth page US_Eighty")
    public void user_verifies_the_all_options_are_selected_on_the_new_room_step_fifth_page_us080() {
//       /** This functionality has  BUG !!!    */
//       /**After bug fixed by developer these codes will be open!  */
        List <WebElement> selectedAmenities = new LinkedList<>(newRoomPage.step5_allAmenities );
        for (WebElement eachOption : selectedAmenities) {
            Assert.assertTrue(eachOption.getAttribute("class").contains("border-warning"));
        }
    }

    /** SIXTH PAGE */

    @And("user types a description as {string} to the input box on the new room, step sixth page US_Eighty")
    public void user_types_a_description_as_to_the_input_box_on_the_new_room_step_sixth_page_us080(String homeDescription) {
        newRoomPage.step6_iputBox.sendKeys(homeDescription);
    }

    @Then("user verifies that the text in the descriptions box says {string} on the new room, step sixth page US_Eighty")
    public void user_verifies_that_the_text_in_the_descriptions_box_says_home_sweet_home_on_the_new_room_step_sixth_page_us080(String homeDescription) {
      Assert.assertEquals( homeDescription, newRoomPage.step6_iputBox.getText() );
    }

    /** SEVENTH PAGE */

    @And("the user chooses the all activities from activities to do around the house on the new room step seventh page US_Eighty")
    public void the_user_chooses_the_all_activities_from_activities_to_do_around_the_house_on_the_new_room_step_seventh_page_us080() {
       List <WebElement> allActivities = new LinkedList<>(newRoomPage.step7_allActivities );
        for (WebElement eachActivity : allActivities) {
            eachActivity.click();
        }
    }

    @Then("user verifies the all options are selected on the new room, step seventh page US_Eighty")
    public void user_verifies_the_all_options_are_selected_on_the_new_room_step_seventh_page_us080() {
        List <WebElement> selectedActivities = new LinkedList<>(newRoomPage.step7_allActivities );
        for (WebElement eachOption : selectedActivities) {
            Assert.assertTrue(eachOption.getAttribute("class").contains("border-warning"));
        }
    }

    /** EIGHTH PAGE */

    @And("user clicks to the all {string} options on the new room, step eighth page US_Eighty")
    public void user_clicks_to_the_all_options_on_the_new_room_step_eighth_page_us080(String specialCondition) {
        List <WebElement> allSpecialConditions = new LinkedList<>(newRoomPage.getSpecialCondition(specialCondition) );
        for (WebElement eachOption : allSpecialConditions) {
            eachOption.click();
        }
    }

    @Then("user verifies the all {string} options are selected on the new, room step eighth page US_Eighty")
    public void user_verifies_the_all_options_are_selected_on_the_new_room_step_eighth_page_us080(String specialCondition) {
        List <WebElement> selectedSpecialConditions = new LinkedList<>(newRoomPage.getSpecialCondition(specialCondition) );
        for (WebElement eachOption : selectedSpecialConditions) {
            Assert.assertTrue(eachOption.getAttribute("class").contains("text-dark"));
        }
    }

    /** NINTH PAGE */

    @And("user chooses the date on the new room, step ninth page US_Eighty")
    public void user_chooses_the_date_on_the_new_room_step_ninth_page_us080() {
        newRoomPage.step9_FirstDatePickerInput.click();
        newRoomPage.step9_TodayOption.click();
        BrowserUtilities.waitFor(1);
        newRoomPage.step9_TodayOption.click();
    }

    @Then("user verifies {string} is visible on the new room, step ninth page US_Eighty")
    public void user_verifies_is_visible_on_the_new_room_step_ninth_page_us080(String chosenDate) {
        WebElement date = Driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+chosenDate+"')]"));
        Assert.assertTrue(date.isDisplayed());
    }


}
