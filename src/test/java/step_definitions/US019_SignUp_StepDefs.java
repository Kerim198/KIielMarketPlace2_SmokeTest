package step_definitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US020_SignUp_Page;
import pages.US028_SignUpPage;

public class US019_SignUp_StepDefs {

    US020_SignUp_Page page20 = new US020_SignUp_Page();
    US028_SignUpPage page28 = new US028_SignUpPage();
    Faker faker = new Faker();
    String password = "";

    @Given("Kullanici {string} kutucuguna gecerli bir isim girer")
    public void kullanici_kutucuguna_gecerli_bir_isim_girer(String string) {
        String name = faker.name().username();
        page20.UserName.sendKeys(name);
    }

    @When("Kullanici {string} kutucuguna @ isareti oncesi ve sonrasında en az bir karakter olacak sekilde gecerli bir mail adresi girer")
    public void kullanici_kutucuguna_isareti_oncesi_ve_sonrasinda_en_az_bir_karakter_olacak_sekilde_gecerli_bir_mail_adresi_girer(String string) {
        String mail = faker.name().firstName() + "@yandex.com" ;
        page20.Email.sendKeys(mail);

    }
    @When("Kullanici {string} kutucuguna gecerli bir sifre girer")
    public void kullanici_kutucuguna_gecerli_bir_sifre_girer(String string) {
        password = Integer.toString(faker.number().numberBetween(1,1000));
        page20.Password.sendKeys(password);

    }
    @When("Kullanici {string} kutucuguna ayni sifreyi tekrar girer")
    public void kullanici_kutucuguna_ayni_sifreyi_tekrar_girer(String string) {
        page20.Repassword.sendKeys(password);

    }
    @When("Kullanici kayit kosullarinin kabul edildigini belirten checkboxi isaretler")
    public void kullanici_kayit_kosullarinin_kabul_edildigini_belirten_checkboxi_isaretler() {
        page20.CheckBox.click();

    }
    @When("Kullanici {string} butonuna tiklar")
    public void kullanici_butonuna_tiklar(String string) {
        page20.SubmitButton.click();

    }
    @Then("Kayit olusturulduktan sonra kullanici {string} sayfasina yonlendirilmelidir.")
    public void kayit_olusturulduktan_sonra_kullanici_sayfasina_yonlendirilmelidir(String string) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        page28.verifyCurrentUrl(string);

    }

    @Then("Kullanici {string} butonuna tiklayamamalidir.")
    public void kullanici_butonuna_tiklayamamalidir(String string) {
        boolean submitBut = page20.SubmitButton.isEnabled();
        Assert.assertFalse(submitBut);
    }

}
