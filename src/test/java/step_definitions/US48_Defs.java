package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US48_Page;
import utilities.*;


public class US48_Defs {

    US48_Page us48page = new US48_Page();

    @Then("the user clicks notifications button")
    public void theUserClicksNotificationsButton() {

        us48page.notificationsButton.click();
    }

    @Given("send a notification to the local managers")
    public void sendANotificationToTheLocalManagers() {
        us48page.notificationsInputBox.sendKeys("Yerel yoneticilere bildirim");
        BrowserUtilities.waitFor(3);
        us48page.toLocalManager.click();
        us48page.sendButton.click();
        BrowserUtilities.waitFor(3);
    }

    @Given("send a notification to the users")
    public void sendANotificationToTheUsers() {
        us48page.notificationsInputBox.sendKeys("Kullanicilara bildirim");
        BrowserUtilities.waitFor(3);
        us48page.toUsers.click();
        us48page.sendButton.click();
        BrowserUtilities.waitFor(3);

    }
}
