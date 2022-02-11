package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;


public class US020_SignUp_Page extends BasePage {

    @FindBy(id = "inputUsername")
    public WebElement UserName;
    //
//    @FindBy(xpath = "//input[@id='inputUsername']")
//    public WebElement UserName;
    @FindBy(xpath = "//input[@id='staticEmail']")
    public WebElement Email;
    @FindBy(xpath = "//input[@id='sifre']")
    public WebElement Password;
    @FindBy(xpath = "//input[@id='sifreTekrar']")
    public WebElement Repassword;
    @FindBy(xpath = " //input[@type='checkbox']")
    public WebElement CheckBox;
    @FindBy(xpath = " //button[@type='submit']")
    public WebElement SubmitButton;
    @FindBy(xpath = "//a[.=/usage]")
    public WebElement UsingPosition;
    @FindBy(xpath = "//a[.=/privacy]")
    public static WebElement SecurityPosition;
    @FindBy(xpath = "//*[contains(text(),'yapma')]")
    public WebElement message;
    @FindBy(xpath = "//div[text()='Bu kullanıcı adı alınmıştır. Başka bir kullanıcı adı giriniz.']")
    public WebElement usernameagain;
    @FindBy(xpath = "  //div[text()='Bu mail adresi zaten kullanılıyor.']")
    public WebElement emailagain;
    @FindBy(css = "form > div:nth-child(7)")
    public WebElement repeatedCredentialAlertText;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signUpButton;       //Kayit olustur butonu
    @FindBy(xpath = "//button[contains(text(),'Giriş Yap')]")
    public WebElement girisYapButtonOnSignInPage;
    @FindBy(className = "btn-danger")
    public WebElement kayitOl;

    public void elementIsEnable(String str) {
        String path = "//a[.='/" + str + "']";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isEnabled());
    }

    public void elementIsDisable(String str) {
        String path = "//a[.='/" + str + "']";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isDisplayed());
        {
        }
    }
}