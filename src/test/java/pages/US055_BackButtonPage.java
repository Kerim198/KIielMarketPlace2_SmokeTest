package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class US055_BackButtonPage extends BasePage {
    //login

    //ilan ver ve ev değişimi
    @FindBy(css = "#dropdownMenuButton")
    public WebElement advertiseButton;

    @FindBy(xpath = "//a[text() = ' Ev Değişimi']")
    public WebElement homeExchangeButton;

    @FindBy(xpath = "//div[@class = 'dropdown d-inline']/ul/li[.  = ' Kargo']")
    public WebElement kargoButton;

    @FindBy(xpath = "//div[@class = 'dropdown d-inline']/ul/li")
    public List<WebElement> dropDownMenu;

    public WebElement getDropdownMenu(String tab){
        String xpath = "//div[@class = 'dropdown d-inline']/ul/li[.  = ' "+tab+"']";
        return Driver.getDriver().findElement(By.xpath(xpath));

    }

    /**
     *  General locator
     *
     */

    @FindBy(tagName = "h2")
    public WebElement general_subTitle;

    /**
     * 1. step -> Type of house
     */

    @FindBy(xpath = "//*[text() = 'Müstakil Ev']")
    public WebElement step1_MustakilEvOptionn;

    @FindBy (xpath = "//*[@id='next' and contains(text(), 'İlerle')]")
    public WebElement ilerleButton;

    @FindBy(xpath = "//small[. = 'Stüdyo Daire']") //içine hangi ev türünü yazarsan o elementi verir.
    public WebElement step1_studioButton;

    @FindBy(xpath = "//div[@class = 'px-3 py-2']/div/div[. = 'Müstakil Ev']")
    public WebElement step1_houseButton;

    @FindBy(xpath = "//small[. = 'Apartman Dairesi']")
    public WebElement step1_apartmanDairesi;

    @FindBy (xpath = "//*[text() = 'Müstakil Ev']/../../div")
    public WebElement step1_MustakilEvOption;


    @FindBy(xpath = "//div[@class = 'px-3 py-2']/div/div")
    public List<WebElement> step1_listOfHouses;

    @FindBy(xpath = "//div[. = 'İlerle']")
    public WebElement nextButton;

    public void selectAHouse(String typeHouse){
        switch (typeHouse){
            case "Müstakil Ev":
                step1_houseButton.click();
                break;
            case "Apartman Dairesi":
                step1_apartmanDairesi.click();
                break;
            case "Stüdyo Daire":
                step1_studioButton.click();
                break;
        }
    }

    public void clickNextBackButton(String button){

        switch (button){
            case "İlerle":
                ilerleButton.click();
                break;
            case "Geri":
                step2_backButton.click();
                break;
        }
    }

    /**
     * 2. step -> Location and Transportation
     */

    @FindBy (xpath = "//input[@type='text']")
    public WebElement step2_AddressInput;

    @FindBy (xpath = "//*[@class = ' css-26l3qy-menu']")
    public WebElement step2_AddressList;

    @FindBy (id = "flexRadioDefault2")
    public WebElement step2_CheckBox;

    @FindBy(xpath = "(//div[@class = 'col-2 px-0 py-0']/input)[1]")
    public WebElement step2_evIleOtobusArası;

    @FindBy(xpath = "(//div[@class = 'col-2 px-0 py-0']/input)[2]")
    public WebElement step2_evIleTrenArası;

    @FindBy(xpath = "(//div[@class = 'col-2 px-0 py-0']/input)[3]")
    public WebElement step2_evIleTramvayArası;

    @FindBy(xpath = "//div[. = 'Geri']")
    public WebElement step2_backButton;

    public void getSubTitle(String expectedSubTitle){

        if (expectedSubTitle.equals("Ev Tipi")){
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Konum ve Ulaşım")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Kullanım Alanı")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Yatak Sayısı")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Ev İmkanları")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Açıklamalar")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Activiteler")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Özel Şartlar")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        } else if (expectedSubTitle.equals("Değişim Tarihi")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }else if (expectedSubTitle.equals("Resim ve Fotoğraflar")) {
            System.out.println(general_subTitle.getText());
            Assert.assertEquals(expectedSubTitle, general_subTitle.getText());
        }

    }

    /**
     * 3. step -> Usage Area
     */

    @FindBy (id = "size")
    public WebElement step3_UsageAreaInput;

    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step3_incrementButtons;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//span[@class = 'input-number-value'])[1]")
    public WebElement step3_numberOfBed; // 1-> yatak odası, 2-> banyo, 3->tuvalet, 4->oturma odası

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//span[@class = 'input-number-value'])[2]")
    public WebElement step3_numberOfBath;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//span[@class = 'input-number-value'])[3]")
    public WebElement step3_numberOfToilet;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//span[@class = 'input-number-value'])[4]")
    public WebElement step3_numberOfLivingRoom;

    @FindBy(xpath = "//div[@class = 'px-3 py-2']//span[@class = 'input-number-value']")
    public List<WebElement> listOfUsageArea; //bed, bath,toilet, living room

    @FindBy(xpath = "//div[@class = 'px-3 py-2']//button[. = '−']")
    public List<WebElement> step3_listOfMinusButton;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[1]")
    public WebElement step3_incrementBedButton; //1-> yatak odası, 2-> banyo, 3->tuvalet, 4->oturma odası

    /**
     * 4. step -> number of bed
     */

    @FindBy (xpath = "//button[text() = '+']")
    public WebElement step4_incrementButtonOfTekKisilikYatak;

    @FindBy(xpath = "//div[@class = 'px-3 py-2']//button[. = '+']")
    public List<WebElement> step4_listOfNumberBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[1]")
    public WebElement step4_numberOfSingleBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[2]")
    public WebElement step4_numberOfDoubleBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[3]")
    public WebElement step4_numberOfChildBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[4]")
    public WebElement step4_numberOfBabyBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[5]")
    public WebElement step4_numberOfGroundSingleBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[6]")
    public WebElement step4_numberOfGroundDoubleBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[7]")
    public WebElement step4_numberOfGroundChildBed;

    @FindBy(xpath = "(//div[@class = 'px-3 py-2']//button[. = '+'])[8]")
    public WebElement step4_numberOfBesik;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[1]")
    public WebElement step4_valueOfSingleBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[2]")
    public WebElement step4_valueOfDoubleBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[3]")
    public WebElement step4_valueOfChildBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[4]")
    public WebElement step4_valueOfBabyBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[5]")
    public WebElement step4_valueOfGroundSingleBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[6]")
    public WebElement step4_valueOfGroundDoubleBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[7]")
    public WebElement step4_valueOfGroundChildBed;

    @FindBy(xpath = "(//span[@class = 'input-number-value'])[8]")
    public WebElement step4_valueOfBesik;

    /**
     * 5. step -> Home Facilities
     */

    @FindBy (xpath = "//*[text() = 'TV']")
    public WebElement step5_TvOption;

    @FindBy(xpath = "//div[@class = 'row d-flex align-items-center justify-content-center']/div")
    public List<WebElement> step5_listOfHomeFacilities;

    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[1]")
    public WebElement step5_TV;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[2]")
    public WebElement step5_privateGarage;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[3]")
    public WebElement step5_WiFi;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[4]")
    public WebElement step5_bulasıkMakinesi;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[5]")
    public WebElement step5_kurutmaMakinesi;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[6]")
    public WebElement step5_camasırMakinesi;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[7]")
    public WebElement step5_microDalga;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[8]")
    public WebElement step5_asansor;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[9]")
    public WebElement step5_bebekArabası;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[10]")
    public WebElement step5_bilgisayar;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[11]")
    public WebElement step5_bahce;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[12]")
    public WebElement step5_mangal;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[13]")
    public WebElement step5_klima;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[14]")
    public WebElement step5_ucretsizParkAlanı;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[15]")
    public WebElement step5_ucretliParkAlanı;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[16]")
    public WebElement step5_bisiklet;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[17]")
    public WebElement step5_cocukBisikleti;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[18]")
    public WebElement step5_oyunKonsolu;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[19]")
    public WebElement step5_balkon;
    @FindBy(xpath = "(//div[@class = 'row d-flex align-items-center justify-content-center']/div)[19]")
    public WebElement step5_teras;

    /**
     * 6. step -> Descriptions
     */

    @FindBy (id = "home")
    public WebElement step6_DescInput;


    /**
     * 7. step -> Activities
     */

    @FindBy(xpath = "//div[@class = 'row d-flex align-items-center justify-content-center']/div")
    public List<WebElement> step7_listOfActivities;

    @FindBy (xpath = "//*[text() = 'Lunapark']")
    public WebElement step7_LuneparkOption;

    @FindBy (xpath = "//*[text() = 'Plaj']")
    public WebElement step7_PlajOption;

    @FindBy (xpath = "//*[text() = 'Bisiklet Yolu']")
    public WebElement step7_BisikletYolukOption;

    @FindBy (xpath = "//*[text() = 'Müze']")
    public WebElement step7_MuzeOption;

    @FindBy (xpath = "//*[text() = 'Balık Tutma']")
    public WebElement step7_BalıkTutmaOption;

    @FindBy (xpath = "//*[text() = 'Kayak Yapma']")
    public WebElement step7_KayakYapmaOption;

    @FindBy (xpath = "//*[text() = 'Spor Salonu']")
    public WebElement step7_SporSalonuOption;

    @FindBy (xpath = "//*[text() = 'Doğa Yürüyüşü']")
    public WebElement step7_DogaYuruyusuOption;

    @FindBy (xpath = "//*[text() = 'Ünlü Meydan']")
    public WebElement step7_UnluMeydanOption;

    @FindBy (xpath = "//*[text() = 'Çocuk Parkı']")
    public WebElement step7_CocukParkıOption;

    @FindBy (xpath = "//*[text() = 'Helal Restorant']")
    public WebElement step7_HelalRestorantOption;

    @FindBy (xpath = "//*[text() = 'AVM']")
    public WebElement step7_AVMOption;

    @FindBy (xpath = "//*[text() = 'Sinema']")
    public WebElement step7_SinemaOption;

    @FindBy (xpath = "//*[text() = 'Camii & Dernek']")
    public WebElement step7_CamiAndDernekOption;


    /**
     * 8. step -> Special conditions
     */

    @FindBy (xpath = "//*[text() = 'Hayır']")
    public List<WebElement> step8_HayirOptions;

    @FindBy(xpath = "//div[.= 'Evet']")
    public List<WebElement> step8_EvetOptions;


    /**
     * 9. step -> Change Date
     */

    @FindBy (xpath = "//input[@placeholder = 'Tarih seçmek için tıklayınız'][1]")
    public WebElement step9_FirstDatePickerInput;

    @FindBy (css = " [class~=react-datepicker__day--today]")
    public WebElement step9_TodayOption;


    /**
     * 10 step -> Pictures and Photos
     */

    @FindBy (id = "file-upload1")
    public WebElement step10_FileUpload1;

    @FindBy (id = "file-upload2")
    public WebElement step10_FileUpload2;

    @FindBy (id = "file-upload3")
    public WebElement step10_FileUpload3;

    @FindBy (id = "file-upload4")
    public WebElement step10_FileUpload4;

    @FindBy (id = "file-upload5")
    public WebElement step10_FileUpload5;

    @FindBy (id = "file-upload6")
    public WebElement step10_FileUpload6;

    @FindBy (id = "file-upload7")
    public WebElement step10_FileUpload7;

    @FindBy (id = "file-upload8")
    public WebElement step10_FileUpload8;

    @FindBy (id = "file-upload9")
    public WebElement step10_FileUpload9;

    @FindBy (id = "file-upload10")
    public WebElement step10_FileUpload10;

    @FindBy (xpath = "//*[contains(text(), 'Resimleri Kaydet')]")
    public WebElement step10_ResimleriKaydetButton;


    public WebElement getStep5Option(String text){
        for(WebElement e : step5_AllOptions){
            if(e.getText().equalsIgnoreCase(text)){
                return e;
            }
        }

        return null;
    }

    public WebElement getStep7Option(String text){
        for(WebElement e : step7_AllOptions){
            if(e.getText().equalsIgnoreCase(text)){
                return e;
            }
        }

        return null;
    }


    @FindBy (xpath = "//*[text() = 'Apartman Dairesi']/../../div")
    public WebElement step1_ApartmanDairesiOption;

    @FindBy (xpath = "//*[text() = 'Stüdyo Daire']/../../div")
    public WebElement step1_StudyoDaireOption;

    @FindBy(xpath = "//button[text() = 'Geri']")
    public WebElement geriButton;


    @FindBy (xpath = "(//input[@type='number'])[1]")
    public WebElement step2_EvOtobusInput;

    @FindBy (xpath = "(//input[@type='number'])[2]")
    public WebElement step2_EvTrenInput;

    @FindBy (xpath = "(//input[@type='number'])[3]")
    public WebElement step2_EvTramwayInput;


    @FindBy(className = "input-number-value")
    public List<WebElement> step3_AllNumbers;


    @FindBy (xpath = "//button[text() = '+']")
    public List<WebElement> step4_incrementButtons;

    @FindBy(className = "input-number-value")
    public List<WebElement> step4_AllNumbers;


    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step5_AllOptions;



    @FindBy(css = ".row.d-flex.align-items-center.justify-content-center > div > div")
    public List<WebElement> step7_AllOptions;


    public static class US049_IlanVer_EvDegStep9_Page extends BasePage {

        @FindBy(id = "dropdownMenuButton")
        public WebElement ilanVerButton;

        @FindBy(xpath = "//a[@href='/new_home']")
        public WebElement evDegisimiLink;

        @FindBy(xpath = "//*[text()='Müstakil Ev']")
        public WebElement step1_MustakilEvOption;

        @FindBy(xpath = "//*[text()='İlerle']")
        public WebElement ilerleButton;

    //    @FindBy(xpath = "//*[@id='next' and contains(text(), 'İlerle')]")
    //    public WebElement ilerleButton;

        @FindBy(xpath = "//input[@type='text']")
        public WebElement step2_AdressInput;

        @FindBy (xpath = "//*[@class = ' css-26l3qy-menu']")
        public WebElement step2_AddressList;

        @FindBy(xpath = "(//input[@id='flexRadioDefault1'])[1]")
        public WebElement step2_EvOtobusInput;

        @FindBy(xpath = "(//input[@id='flexRadioDefault1'])[2]")
        public WebElement step2_EvTrenInput;

        @FindBy(xpath = "(//input[@id='flexRadioDefault1'])[3]")
        public WebElement step2_EvTramwayInput;

        @FindBy(id = "size")
        public WebElement step3_KullanimAlaniInput;

        @FindBy(xpath = "//button[text() = '+']")
        public List<WebElement> step3_IncrementButtons;

        @FindBy(xpath = "//button[text() = '+']")
        public List<WebElement> step4_IncrementButtons;



    }
}
