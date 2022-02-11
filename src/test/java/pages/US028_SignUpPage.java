package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtilities;
import utilities.Driver;

public class US028_SignUpPage extends BasePage {

    public static By element = By.xpath("");
//
    @FindBy(xpath = "ç")
    public WebElement usageCondition;

    @FindBy(xpath = "//a[@href ='/privacy']")
    public WebElement privacy;

    public void elementIsEnable(String str){
        String path = "//a[@href ='/" +str+ "']";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isEnabled());

    }

    public void elementIsDisplayed(String str){
        String path = "//a[@href ='/" +str+ "']";
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath(path)).isDisplayed());

    }

    public void click(String str){
        String path = "//a[@href ='/" +str+ "']";
        Driver.getDriver().findElement(By.xpath(path)).click();

    }

    public void verifyCurrentUrl(String expectedUrl){
        BrowserUtilities.waitForPageToLoad(3);
      Assert.assertEquals(expectedUrl, Driver.getDriver().getCurrentUrl());
    }

    /*
    @sprint2 @regression

Feature: US_055 As a user, on the "Home Exchange" posting page, I should be able to go back through all the steps except the first step.

  Background:
    Given the user is on the login page
    When the user enters the user credentials
    Then the user should be able to login
    When the user clicks advertise button
    And the user clicks home exchange link
    Then the user should be on the "Ev Tipi" page

# 1 den 2, 2 den 1
  @sprint2
  Scenario Outline:
    When the user selects a "<type>" of house
    And the user clicks "İlerle" button
    Then the user should be on the "Konum ve Ulaşım" page
    When the user clicks "Geri" button
    Then the user should be on the "Ev Tipi" page
    Then the user should see type of house is selected
    And the user clicks "İlerle" button

    Examples:
      | type              |
      | Müstakil Ev       |
      | Apartaman Dairesi |
      | Stüdyo Daire      |


  # 1,2 den 3, 3 ten 2
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user clicks car check box button # diğer ulaşım çeşitleri için de dene
    And the user clicks "İlerle" button
    Then the user should be on the "Kullanım Alanı" page
    When the user clicks "Geri" button
    Then the user should be on the "Konum ve Ulaşım" page
    Then the user verifies car check box button is selected
    And the user clicks "İlerle" button

       # 1,2 3, ten 4, 4 ten 3
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2. step
    When the user enters 100 to size of house
    And the user add 3 bedroom, 3 bath, 3 toilet and 3 living room
    And the user clicks "İlerle" button
    Then the user should be on the "Yatak Sayısı" page
    When the user clicks "Geri" button
    Then the user should be on the "Kullanım Alanı" page
    Then the user verifies size of house is 100
    Then the user verifies the house has 3 bedroom, 3 bath, 3 toilet and 3 living room
    And the user clicks "İlerle" button

      # 1,2,3,4 ten 5, 5 ten 4
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2. step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3. step
    And the user selects 2 from each option # 4. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Ev İmkanları" page
    When the user clicks "Geri" button
    Then the user should be on the "Yatak Sayısı" page
    Then the user verifies each option has 2
    And the user clicks "İlerle" button

       # 1,2,3,4,5 ten 6, 6 dan 5
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2. step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3. step
    And the user selects 2 each option and passes to "Ev İmkanları" page # bu 4. step
    And the user selects all home facilities # 5. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Açıklamalar" page
    When the user clicks "Geri" button
    Then the user should be on the "Ev İmkanları" page
    Then the user verifies each facilities should be selected
    And the user clicks "İlerle" button

      # 1,2,3,4,5,6 dan 7, 7 den 6
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2. step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3. step
    And the user selects 2 each option and passes to "Ev İmkanları" page # bu 4. step
    And the user selects all home facilities and passes to "Açıklamalar" page # bu 5. step
    When the user enters "text" to input box # 6. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Activiteler" page
    When the user clicks "Geri" button
    Then the user should be on the "Açıklamalar" page
    Then the user verifies "text" is displayed on the page
    And the user clicks "İlerle" button

    # 1,2,3,4,5,6,7 den 8, 8 den 7
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1. step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2. step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3. step
    And the user selects 2 each option and passes to "Ev İmkanları" page # bu 4. step
    And the user selects all home facilities and passes to "Açıklamalar" page # bu 5. step
    And the user enters "text" to input box and passes to "Activiteler" page # bu 6.step
    When the user selects all activities # 7. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Özel Şartlar" page
    When the user clicks "Geri" button
    Then the user should be on the "Activiteler" page
    Then the user verifies each activitie should be selected
    And the user clicks "İlerle" button

    # 1,2,3,4,5,6,7,8 den 9, 9 den 8
  Scenario Outline:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1.step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2.step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3.step
    And the user selects 2 each option and passes to "Ev İmkanları" page # bu 4. step
    And the user selects all home facilities and passes to "Açıklamalar" page # bu 5.step
    And the user enters "text" to input box and passes to "Activiteler" page # bu 6.step
    When the user selects all activities and passes to "Özel Şartlar" page  # bu 7.step
    And the user selects all "<special>" conditions # 8. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Değişim Tarihi" page
    When the user clicks "Geri" button
    Then the user should be on the "Özel Şartlar" page
    Then the user verifies each condition should be selected
    And the user clicks "İlerle" button

    Examples:
      | special |
      | Evet    |
      | Hayır   |


      # 1,2,3,4,5,6,7,8,9 dan 10, 10 den 9
  Scenario:
    Given the user selects type of house and passes to "Konum ve Ulaşım" page # bu 1.step
    When the user selects car check box and passes to "Kullanım Alanı" page # bu 2.step
    And the user enters 100, selects 3 each option and passes to "Yatak Sayısı" page # bu 3.step
    And the user selects 2 each option and passes to "Ev İmkanları" page # bu 4. step
    And the user selects all home facilities and passes to "Açıklamalar" page # bu 5.step
    And the user enters "text" to input box and passes to "Activiteler" page # bu 6.step
    When the user selects all activities and passes to "Özel Şartlar" page  # bu 7.step
    And the user accepts all special conditions and passes "Değişim Tarihi" page  # bu 8.step
    And the user selects "date" # 9. adımda
    And the user clicks "İlerle" button
    Then the user should be on the "Resim ve Fotoğraflar" page
    When the user clicks "Geri" button
    Then the user should be on the "Değişim Tarihi" page
    Then the user verifies "date" is slected
    And the user clicks "İlerle" button







    And the user accepts all special conditions # 8. adımda
    And the user rejects all special conditions




     */


    public static class US013_SingUp_Page extends BasePage{

        @FindBy(id = "inputUsername")
        public WebElement userNameTextBox;
        @FindBy(id = "staticEmail")
        public WebElement emailNameTextBox;
        @FindBy(id="sifre")
        public WebElement password;
        @FindBy(id="sifreTekrar")
        public WebElement passwordRepeat;
        @FindBy(id="staticEmail")
        public WebElement placeHolder;




    }
}

//