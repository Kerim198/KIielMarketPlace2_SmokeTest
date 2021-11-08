package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US48_Page extends BasePage {

    @FindBy(id = "textarea")
    public WebElement notificationsInputBox;

    @FindBy(id= "gonder")
    public WebElement sendButton;

    @FindBy (xpath = "//label[@for='btnradio1']")
    public WebElement toLocalManager;

    @FindBy (xpath = "//label[@for='btnradio2']")
    public WebElement toUsers;

    @FindBy(xpath = "//a[@href = '/notification']")
    public WebElement notificationsButton;



}
