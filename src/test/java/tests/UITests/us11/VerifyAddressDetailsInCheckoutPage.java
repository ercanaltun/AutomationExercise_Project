package tests.UITests.us11;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Hatem;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class VerifyAddressDetailsInCheckoutPage {
    Hatem hatemPage = new Hatem();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker=new Faker();
    Nihat nihatPage = new Nihat();

    @Test
    public  void test(){


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(hatemPage.HomePageVisible.isDisplayed());
        hatemPage.LoginButton.click();
        hatemPage.NewUser_Name.sendKeys(faker.name().
                firstName(), Keys.TAB,faker.internet().emailAddress());
        hatemPage.SignupButton.click();
        hatemPage.radioButton.click();
        hatemPage.PasswordField.sendKeys(faker.internet().password());
        actions.sendKeys(Keys.TAB,"20",Keys.TAB,"july",Keys.TAB,"1985",Keys.PAGE_DOWN).perform();
        hatemPage.clicknewsletter.click();
        nihatPage.Optin.click();
        nihatPage.FirstName.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB, faker.name().lastName(),Keys.TAB,"Mezunlar", Keys.TAB,
                faker.address().fullAddress(), Keys.TAB,faker.address().zipCode(),
                Keys.TAB,faker.address().country(),Keys.TAB,faker.address().state(),Keys.TAB,
                faker.address().city(),Keys.TAB,faker.address().zipCode(),
                Keys.TAB,faker.phoneNumber().phoneNumber(),Keys.TAB,
                // Click 'Create Account button'
                Keys.ENTER).perform();
        assertTrue(hatemPage.AccountCreatedVisible.isDisplayed());
        hatemPage.ContinueButton.click();
        ReusableMethods.waitFor(3);
        assertTrue(hatemPage.LOginVisible.isDisplayed());
        Driver.getDriver().navigate().refresh();
        //8. Sepete ürün ekleyin
        //9. 'Sepet' düğmesine tıklayın
        //10. Sepet sayfasının görüntülendiğini doğrulayın
        //11. Ödeme İşlemine Devam Et'i tıklayın
        //12. Teslimat adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //13. Fatura adresinin, hesap kaydı sırasında girilen adresle aynı olduğunu doğrulayın.
        //14. 'Hesabı Sil' düğmesini tıklayın
        //15. 'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın
    }
}
