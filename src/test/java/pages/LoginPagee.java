package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPagee {

    public LoginPagee() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@href = '/login']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@name = 'email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name = 'sifre']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type= 'submit']")
    public WebElement submitButton;

    public void loginAsAdmin(){
        String username = ConfigurationReader.getProperty("admin_username");
        String password = ConfigurationReader.getProperty("admin_password");
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }


    public void loginAsUser() {
        String username = ConfigurationReader.getProperty("user1_username");
        String password = ConfigurationReader.getProperty("user1_password");
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void loginAsLocalManager(){
        String username = ConfigurationReader.getProperty("authorized_username");
        String password = ConfigurationReader.getProperty("authorized_password");
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();

    }

    public void loginAsCreatedNewUser(String username, String password){
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();

    }


}
