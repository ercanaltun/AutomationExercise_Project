package tests.UITests.us10;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;
import static org.testng.AssertJUnit.assertTrue;

public class AddReviewOnProduct {
    Hatem hatemPage = new Hatem();
    Faker faker = new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        hatemPage.Products.click();
        Driver.getDriver().navigate().refresh();
        hatemPage.Products.click();
        Driver.getDriver().navigate().refresh();
        assertTrue(hatemPage.SuccesfullyImage.isDisplayed());
        hatemPage.View_Product.click();
               assertTrue(hatemPage.riview_visibil.isDisplayed());
        Driver.getDriver().navigate().refresh();
        hatemPage.YourName.sendKeys("Hatem",Keys.TAB);
        hatemPage.Email_Address.sendKeys("krzmkrs36@gmail.com",Keys.TAB);
        hatemPage.riview_here.sendKeys("Write Your Review", Keys.TAB,Keys.ENTER);


    }



}
