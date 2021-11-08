package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;

import java.util.List;

public class US52_54_Page extends BasePage{

    // sprint2
    @FindBy(id="dropdownMenuButton")
    public WebElement myProfileButton;
    @FindBy(xpath="//a[text()=' Çıkış Yap']")
    public WebElement logoutButton;
    @FindBy(xpath="//a[text()=' İlanlarım']")
    public WebElement ilanlarimButton;
    @FindBy(xpath="//a[text()='Giriş Yap']")
    public WebElement loginButton;
    @FindBy(xpath="//div[@class='jodit-wysiwyg']")
    public WebElement aciklamaKutusu;
    @FindBy(xpath="(//i[@class='fas fs-17 text-success fa-check-circle'])[3]")
    public WebElement aciklamaCheckBox;
    @FindBy(xpath="//select[@name='category']")
    public WebElement category;
    @FindBy(xpath = "//select[@name='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@name='telefon']")
    public WebElement phone;
    @FindBy(xpath = "//button[text()='İlanı Kaydet']")
    public WebElement ilanKayit;
    @FindBy (xpath="//a[text()='İlanlarıma Git']")
    public WebElement ilanlarimaGitButton;
    @FindBy (xpath="//a[text()='Düzenle']")
    public WebElement duzenle;
    @FindBy(xpath="//div[@class='jodit-workplace']//div//p")
    public WebElement aciklamaKutusuEdit;

    public static void selectDdValue(WebElement element, String textToSelect) {

        try {
            Select select = new Select(element);

            List<WebElement> options = select.getOptions();

            for (WebElement el : options) {
                if (el.getText().equals(textToSelect)) {
                    select.selectByVisibleText(textToSelect);
                    break;
                }
            }

        } catch (UnexpectedTagNameException e) {
            e.printStackTrace();
        }
    }

}