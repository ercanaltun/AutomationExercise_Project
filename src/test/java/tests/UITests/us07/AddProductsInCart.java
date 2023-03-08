package tests.UITests.us07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import pages.Ramazan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertTrue;

public class AddProductsInCart {

//2. Navigate to url 'http://automationexercise.com'
//3. Verify that home page is visible successfully
//4. Click 'Products' button
//5. Hover over first product and click 'Add to cart'
//6. Click 'Continue Shopping' button
//7. Hover over second product and click 'Add to cart'
//8. Click 'View Cart' button
//9. Verify both products are added to Cart
//10. Verify their prices, quantity and total price

    Ercan ercan=new Ercan();
    Ramazan ramazan=new Ramazan();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public  void test1(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3. Verify that home page is visible successfully
        assertTrue(ercan.signup_login.isDisplayed());

        //4. Click 'Products' button
        ercan.products.click();

        //5. Hover over first product and click 'Add to cart'
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        ercan.addTocart1.click();

        //6. Click 'Continue Shopping' button
        ReusableMethods.waitFor(2);
        ercan.continueShopping.click();

        //7. Hover over second product and click 'Add to cart'
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);

        //8. Click 'View Cart' button
        ercan.viewCart.click();

        //9. Verify both products are added to Cart
        assertTrue(ramazan.firstProductDisplayInCart.isDisplayed());
        assertTrue(ramazan.secondProductDisplayInCart.isDisplayed());

        //10. Verify their prices, quantity and total price
        //Prices
        assertTrue(ramazan.priceFirstProduct.isDisplayed());
        assertTrue(ramazan.priceSecondProduct.isDisplayed());

        //Quantities
        assertTrue(ramazan.quantityFirstProduct.isDisplayed());
        assertTrue(ramazan.quantitySecondProduct.isDisplayed());

        //Total prices
        assertTrue(ramazan.totalPriceFirstProduct.isDisplayed());
        assertTrue(ramazan.totalPriceSecondProduct.isDisplayed());

        Driver.quitDriver();










    }







}
