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

public class DownloadInvoiceAfterPurchaseOrder {
        Hatem hatemPage = new Hatem();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker=new Faker();
        Nihat nihatPage = new Nihat();

    @Test
    public  void test(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(hatemPage.HomePageVisible.isDisplayed());
        hatemPage.Products.click();
        ReusableMethods.waitFor(3);
        Driver.getDriver().navigate().refresh();
        hatemPage.View_Product.click();
        hatemPage.AddToCartSon.click();
        hatemPage.WievCart.click();
        assertTrue(hatemPage.visibilityCartMenu.isDisplayed());
        hatemPage.ProceedtoCart.click();
        hatemPage.Register_Login.click();
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
                             Keys.ENTER).perform();
                hatemPage.ContinueButton.click();
            assertTrue(hatemPage.LoggedVisible.isDisplayed());

        //12.Click 'Cart' button
        //13. Click 'Proceed To Checkout' button
        //14. Verify Address Details and Review Your Order
        //15. Enter description in comment text area and click 'Place Order'
        // 16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
        //17. Click 'Pay and Confirm Order' button
        //18. Verify success message 'Your order has been placed successfully!'
        //19. Click 'Download Invoice' button and verify invoice is downloaded successfully.
        //20. Click 'Continue' button
        //21. Click 'Delete Account' button
        //22. Verify 'ACCOUNT DELETED!' and click 'Continue' button

    }



}
