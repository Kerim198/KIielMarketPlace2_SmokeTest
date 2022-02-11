package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.LinkedList;
import java.util.List;

public class US080_NewRoomBackwardFunctionalityPage extends BasePage {

     By name =By.xpath("/div/div/div[1]/ul/li[2]/a/text()/..");
    /**
     * Room rent ad General Steps
     **/

    @FindBy(xpath = "//div[@class='dropdown d-inline']")
    // ilan Ver butonu  //a[@id='dropdownMenuButton']==>baska bir secenek
    public WebElement adPostingButton;

    @FindBy(xpath = "//div/div/div[1]/ul/li[2]/a/text()/..") // Oda secenegi, ilan verin altindaki dropdown listesinden
    public WebElement roomOption;

    @FindBy(xpath = "//*[@id='next' and contains(text(), 'İlerle')]")  //(linkText = "İlerle")
    public WebElement forwardButton;

    @FindBy(xpath = "//button[text() = 'Geri']")          //(xpath = "//button[@id='next']")
    public WebElement backButton;

    /**
     * new_room / STEP 1
     */

    @FindBy(xpath = "//*[text() = 'Müstakil Ev']/../../div")
    public WebElement step1_house;

    @FindBy(xpath = "//*[text() ='Apartman Dairesi']/../../div")
    public WebElement step1_apartment;

    @FindBy(xpath = "//*[text() = 'Stüdyo Daire']/../../div")
    public WebElement step1_studio;

    @FindBy(id = "flexRadioDefault1")
    //(xpath = "//*[@class='form-check-label' and contains(text(), 'Odamı kiraya vermek istiyorum.')]")     //(linkText ="Odamı kiraya vermek istiyorum.")
    public WebElement step1_rentRoomCheckBox;

    @FindBy(id = "flexRadioDefault2")
    //(xpath = "//*[@class='form-check-label' and contains(text(), 'Karşılıklı oda değişimi yapmak istiyorum.')]")
    public WebElement step1_exchangeCheckBox;

    public WebElement getHomeType(String typeOfHome) {

        return Driver.getDriver().findElement
                (By.xpath("//*[text() ='"+ typeOfHome +"']/../../div"));

    }

    public WebElement getCheckboxes(String checkBox) {

        if (checkBox.equalsIgnoreCase("first checkbox"))
            return step1_rentRoomCheckBox;
        else
            return step1_exchangeCheckBox;
    }


    /**
     * new_room / STEP 2
     */

    @FindBy(xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;

    @FindBy(xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy(xpath = "//div[2]/b")
    public WebElement step2_AddressText;

    @FindBy(id = "flexRadioDefault1")
    public List<WebElement> step2_busTrainSubwayStation; //km girilen 3 tane box birlikte, ayni sirada

    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement step2_busInput;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement step2_trainInput;

    @FindBy(xpath = "(//input[@type='number'])[3]")
    public WebElement step2_subwayInput;

    @FindBy(id = "flexRadioDefault2")
    public WebElement step2_CheckBox;


    /**
     * new_room / STEP 3
     */

    @FindBy(id = "size")
    public WebElement step3_UsageAreaInput;

    @FindBy(xpath = "//span[@class='input-number-value']")
    public List<WebElement> step3_AllUsageAreaNumbers;

    @FindBy(xpath = "//div[2]/div/div/div/button[2]")
    public WebElement step3_bedroomIncrementButtons;

    @FindBy(xpath = "//button[@class='btn btn-light border py-1 px-2 ml-3']")
    public List<WebElement> step3_AllIncrementButtons;

    @FindBy(xpath = "//div[2]/div/div/div/button[1]")
    public WebElement step3_badroomDecrementButtons;

    @FindBy(xpath = "//div[3]/div/div/button[2]")
    public WebElement step3_bathroomIncrementButtons;

    @FindBy(xpath = "//div[3]/div/div/button[1]")
    public WebElement step3_bathroomDecrementButtons;

    @FindBy(xpath = "//div[4]/div/div/button[2]")
    public WebElement step3_restroomIncrementButtons;

    @FindBy(xpath = "//div[4]/div/div/button[1]")
    public WebElement step3_restroomDecrementButtons;

    @FindBy(xpath = "//div[5]/div/div/button[2]")
    public WebElement step3_livingRoomIncrementButtons;

    @FindBy(xpath = "//div[5]/div/div/button[1]")
    public WebElement step3_livingRoomDecrementButtons;


    /**
     * new_room /STEP 4
     */

    @FindBy(xpath = "//button[@class='btn btn-light border py-1 px-2 ml-3']")
    public WebElement step4_incrementButton;

    @FindBy(xpath = "//span[@class='input-number-value']")
    public WebElement step4_incrementButtonValue;

    @FindBy(xpath = "//span[.='10-15']")
    public WebElement step4_ageRange10_15Button;

    @FindBy(xpath = "//span[.='16-20']")
    public WebElement step4_ageRange16_20Button;

    @FindBy(xpath = "//span[.='21-25']")
    public WebElement step4_ageRange21_25Button;

    @FindBy(xpath = "//span[.='26-35']")
    public WebElement step4_ageRange26_35Button;

    @FindBy(xpath = "//span[.='36-45']")
    public WebElement step4_ageRange36_45Button;

    @FindBy(xpath = "//span[.='46-65']")
    public WebElement step4_ageRange46_65Button;

    @FindBy(xpath = "//span[.='65+']")
    public WebElement step4_ageRange65PlusButton;

    @FindBy(xpath = "//div[8]/span")
    public WebElement step4_ageFarketmezButton;

    @FindBy(xpath = "//div[2]/div[3]/span")
    public WebElement step4_genderFarketmezButton;

    @FindBy(xpath = "//span[.='Kadin']")
    public WebElement step4_genderWomenButton;

    @FindBy(xpath = "//span[.='Erkek']")
    public WebElement step4_genderManButton;

    public List<WebElement> getAgeRangeButtons(String rangeOfAge) {
        List<WebElement> anyAge = new LinkedList<>();
        anyAge.add(step4_ageFarketmezButton);

        List<WebElement> tenTosixtyFivePlusButtonList = new LinkedList<>();
        tenTosixtyFivePlusButtonList.add(step4_ageRange10_15Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange16_20Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange21_25Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange26_35Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange36_45Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange46_65Button);
        tenTosixtyFivePlusButtonList.add(step4_ageRange65PlusButton);

        if (rangeOfAge.equalsIgnoreCase("10-65+"))

            return tenTosixtyFivePlusButtonList;
        else
            return anyAge;

    }

    public WebElement getGenderButtons(String genderButton) {
        if (genderButton.equalsIgnoreCase("Kadin"))
            return step4_genderWomenButton;
        else if (genderButton.equalsIgnoreCase("Erkek"))
            return step4_genderManButton;
        else
            return step4_genderFarketmezButton;
    }


    /** new_room / STEP 5  */

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step5_allAmenities;

   /** new_room / STEP 6  */
   @FindBy(xpath = "//textarea")
   public WebElement step6_iputBox;

  /** new_room / STEP 7  */

    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step7_allActivities;

  /** new_room / STEP 8  */

  @FindBy(xpath = "//div[@class='badge rounded-pill px-2 py-1 text-dark' and .='Hayır']")
  public List<WebElement> step8_allHayirButtons;

  @FindBy(xpath = "//div[@class='badge rounded-pill px-2 py-1 text-dark' and .='Evet']")
  public List<WebElement> step8_allEvetButtons;

  public List<WebElement> getSpecialCondition(String answer){

      if(answer.equalsIgnoreCase("Evet"))
          return step8_allEvetButtons;
      else
          return step8_allHayirButtons;
  }



  /** new_room / STEP 9  */

   @FindBy (xpath = "//input[@placeholder = 'Tarih seçmek için tıklayınız'][1]")
   public WebElement step9_FirstDatePickerInput;

    @FindBy (css = " [class~=react-datepicker__day--today]")
    public WebElement step9_TodayOption;



}
