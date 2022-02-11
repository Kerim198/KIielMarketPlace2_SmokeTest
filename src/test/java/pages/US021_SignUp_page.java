package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class US021_SignUp_page extends BasePage {
    @FindBy(xpath = "//input[@id='inputUsername']")
    public WebElement kullaniciadi;
    @FindBy(xpath = "//input[@id='staticEmail']")
    public WebElement Emailiyaz;
    @FindBy(xpath = "//input[@id='sifre']")
    public WebElement sifre;
    @FindBy(xpath = "//input[@id='sifreTekrar']")
    public WebElement sifreagain;
    @FindBy(xpath = " //input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = " //button[@type='submit']")
    public WebElement submitButton;
}