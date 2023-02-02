package tests.UITests.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.*;

public class RemoveProductsFromCart {

   Ercan ercanPage=new Ercan();

   Actions actions=new Actions(Driver.getDriver());

@Test
    public void TC1(){

    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    //3. Verify that home page is visible successfully
    assertTrue(ercanPage.signup_login.isDisplayed());

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

    //5. Click 'Cart' button
    ercanPage.cartOnHomePage.click();
    ReusableMethods.waitFor(1);

    //6. Verify that cart page is displayed
    assertTrue(ercanPage.cartOnHomePageIsDisplay.isDisplayed());

    //7. Click 'X' button corresponding to particular product
    ercanPage.xButton.click();


    //8. Verify that product is removed from the cart
    assertTrue(ercanPage.removeProductFromCart.isDisplayed());

    Driver.quitDriver();




}


}
