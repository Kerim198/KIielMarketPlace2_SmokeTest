package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;


public class US018_LoginPage extends BasePage{

    @FindBy (xpath = "//*[@placeholder='Email giriniz']" )
    public WebElement emailGirinizInput;

    @FindBy (xpath = "//*[@placeholder='Şifrenizi giriniz']" )
    public WebElement sifreGirinizInput;

    @FindBy (xpath = "//*[@type ='submit']" )
    public WebElement girisYapButton;

    @FindBy (xpath = "//*[contains(text(),'Email ya da şifre hatalı.')]")
    public WebElement emailYadaSifreHatali;


    public void userLogin(String username, String password) {
        emailGirinizInput.sendKeys(username);
        sifreGirinizInput.sendKeys(password, Keys.ENTER);
    }
    public void loginConf(){
        String username = ConfigurationReader.getProperty("user1_username");
        String password = ConfigurationReader.getProperty("user1_password");
        emailGirinizInput.sendKeys(username);
        sifreGirinizInput.sendKeys(password,Keys.ENTER);
    }



}