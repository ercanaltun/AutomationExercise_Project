package tests.UITests.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.Assert.*;

public class RemoveProductsFromCart extends TestBaseRapor {

   Ercan ercanPage=new Ercan();

   Actions actions=new Actions(Driver.getDriver());

@Test
    public void TC1(){

    extentTest=extentReports.createTest("User should Remove Products From Cart");

    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    extentTest.info("User navigate to the url");

    //3. Verify that home page is visible successfully
    assertTrue(ercanPage.signup_login.isDisplayed());
    extentTest.info("home page should be visibled successfully");

    //4. Add products to cart
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(1);
    ercanPage.addTocart1.click();
    ReusableMethods.waitFor(1);
    ercanPage.continueShopping.click();
    ReusableMethods.waitFor(1);
    ercanPage.addTocart2.click();
    ReusableMethods.waitFor(1);
    ercanPage.continueShopping.click();
    ReusableMethods.waitFor(1);
    extentTest.info("User should Add products to cart");

    //5. Click 'Cart' button
    ercanPage.cartOnHomePage.click();
    ReusableMethods.waitFor(1);
    extentTest.info("User should Click 'Cart' button");

    //6. Verify that cart page is displayed
    assertTrue(ercanPage.cartOnHomePageIsDisplay.isDisplayed());
    extentTest.info(" cart page should be  displayed");

    //7. Click 'X' button corresponding to particular product
    ercanPage.xButton.click();
    extentTest.info("User should Click 'X' button corresponding to particular product");


    //8. Verify that product is removed from the cart
    assertTrue(ercanPage.removeProductFromCart.isDisplayed());
    extentTest.pass("product is removed from the cart");


    Driver.quitDriver();




}


}
