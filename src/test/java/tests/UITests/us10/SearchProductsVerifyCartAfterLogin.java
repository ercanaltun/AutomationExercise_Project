package tests.UITests.us10;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class SearchProductsVerifyCartAfterLogin {

    Hatem hatemPage=new Hatem();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void  test(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        hatemPage.Products.click();
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        hatemPage.Products.click();
        assertTrue(hatemPage.SuccesfullyImage.isDisplayed());
        hatemPage.SearchProduct.sendKeys("Frozen Tops For Kids", Keys.ENTER);
        hatemPage.searchbutton.click();
        actions.sendKeys(Keys.PAGE_DOWN);
        assertTrue(hatemPage.Searched_Product.isDisplayed());
        hatemPage.SearchProduct.clear();
        hatemPage.searchbutton.click();
        assertTrue(hatemPage.Searched_Product.isDisplayed());
        hatemPage.AddToCart.click();
        hatemPage.continue_shopping.click();
        hatemPage.AddToCart2.click();
        hatemPage.view_cart.click();
        assertTrue(hatemPage.CardContainer.isDisplayed());
        hatemPage.LoginButton.click();
        hatemPage.NewUser_Name.sendKeys(ConfigReader.getProperty("UserNew_Name"));
        hatemPage.Email_Email.sendKeys(ConfigReader.getProperty("UserEmail"));
        hatemPage.LoginButton_Login.click();
        hatemPage.SignupButton.click();
        hatemPage.radioButton.click();
        hatemPage.PasswordField.sendKeys("1453birader12");
        hatemPage.Daydate.click();
        hatemPage.monthdate.click();
        hatemPage.yearDate.click();
        hatemPage.clicknewsletter.click();
        actions.sendKeys(Keys.TAB,Keys.TAB,faker.name().firstName(),Keys.TAB,faker.name().lastName(),Keys.TAB,"Mezunlar", Keys.TAB,
                faker.address().fullAddress(), Keys.TAB,faker.address().zipCode(),
                Keys.TAB,faker.address().country(),Keys.TAB,faker.address().state(),Keys.TAB,
                faker.address().city(),Keys.TAB,faker.address().zipCode(),
                Keys.TAB,faker.phoneNumber().phoneNumber(),Keys.TAB,
                Keys.ENTER).perform();
            hatemPage.clickCart.click();
            assertTrue(hatemPage.visibilityCartMenu.isDisplayed());




    }



}
