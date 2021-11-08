package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class US43_Page extends BasePage{

    @FindBy(xpath = "//input[@placeholder='İlan Başlığını Giriniz']")
    public WebElement header;

    @FindBy(xpath = "//input[@id='file-upload1']")
    public WebElement firstPicture;

    @FindBy(xpath = "//input[@id='file-upload2']")
    public WebElement secondPicture;

    @FindBy(xpath = "//input[@id='file-upload1']")
    public WebElement firstP;

    @FindBy(xpath = "//input[@id='file-upload2']")
    public WebElement secondP;

    @FindBy(xpath = "//div[@class='jodit-wysiwyg']")
    public WebElement description;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement categoriesDropdown;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryListDropdown;

    @FindBy(xpath = "//input[@name='telefon']")
    public WebElement phoneDropdown;

    @FindBy(xpath = "//button[contains(@class,'btn btn-warning mt-3 w-100')]")
    public WebElement saveAdButton;

    @FindBy(xpath = "//div[@class = 'pt-3']")
    public WebElement message;



}
