package tests.UITests.us07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import pages.Ramazan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.crypto.KeyAgreementSpi;

import static org.testng.Assert.assertTrue;

public class VerifyProductQuantityInCart {

    //2. Navigate to url 'http://automationexercise.com'
    //3. Verify that home page is visible successfully
    //4. Click 'View Product' for any product on home page
    //5. Verify product detail is opened
    //6. Increase quantity to 4
    //7. Click 'Add to cart' button
    //8. Click 'View Cart' button
    //9. Verify that product is displayed in cart page with exact quantity

    Ercan ercan=new Ercan();
    Ramazan ramazan=new Ramazan();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public  void test2(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3. Verify that home page is visible successfully
        assertTrue(ercan.signup_login.isDisplayed());

        //4. Click 'View Product' for any product on home page
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        ramazan.viewFirstProduct.click();

        //5. Verify product detail is opened
        assertTrue(ramazan.detailsFirstProduct.isDisplayed());

        //6. Increase quantity to 4
        ramazan.increaseQuantityFirstProduct.sendKeys("4");

        //7. Click 'Add to cart' button
        ramazan.addToCartButton.click();
        ReusableMethods.waitFor(2);

        //8. Click 'View Cart' button
        ramazan.viewCart.click();

        //9. Verify that product is displayed in cart page with exact quantity
        assertTrue(ramazan.exactQuantity.isDisplayed());

        Driver.quitDriver();



    }

}
