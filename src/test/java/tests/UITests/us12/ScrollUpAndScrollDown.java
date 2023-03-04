package tests.UITests.us12;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.AssertJUnit.assertTrue;

public class ScrollUpAndScrollDown {
    Hatem hatemPage = new Hatem();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker=new Faker();
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(hatemPage.HomePageVisible.isDisplayed());

        //4. Sayfayı aşağıya doğru kaydırın
        //5. 'ABONELİK'in görünür olduğunu doğrulayın
        //6. Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklayın
        //7. Sayfanın yukarı kaydırıldığını ve 'Otomasyon Mühendisleri için
        // Tam Teşekküllü uygulama web sitesi' metninin ekranda göründüğünü doğrulayın
    }



}
