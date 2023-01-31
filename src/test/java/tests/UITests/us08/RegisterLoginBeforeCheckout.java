package tests.UITests.us08;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.*;

public class RegisterLoginBeforeCheckout {
Ercan ercanPage=new Ercan();
Actions actions=new Actions(Driver.getDriver());
Faker faker=new Faker();
@Test
    public  void TC2(){
    //Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    //Verify that home page is visible successfully
    assertTrue(ercanPage.signup_login.isDisplayed());

    //Click 'Signup / Login' button
    ercanPage.signup_login.click();

    //Fill all details in Signup and create account
    ercanPage.newUserSignUpName.sendKeys(faker.name().username());
    actions.sendKeys(Keys.TAB).
            sendKeys(faker.internet().emailAddress()).
            sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    ercanPage.enterAccountInformationtitleMr.click();
    actions.sendKeys(Keys.TAB).
            sendKeys(faker.name().firstName()).
            sendKeys(Keys.TAB).
            sendKeys(faker.internet().password()).perform();
    Select select=new Select(ercanPage.enterAccountInformationDays);
    select.selectByIndex(16);
    Select select1=new Select(ercanPage.enterAccountInformationMonth);
    select1.selectByVisibleText("June");
    Select select2=new Select(ercanPage.enterAccountInformationYears);
    select2.selectByIndex(13);
    ercanPage.enterAccountInformationNewsletter.click();
    ercanPage.enterAccountInformationReceieve.click();
    actions.sendKeys(Keys.TAB).
            sendKeys(faker.name().firstName()).
            sendKeys(Keys.TAB).
            sendKeys(faker.name().lastName()).
            sendKeys(Keys.TAB).
            sendKeys(faker.name().bloodGroup()).
            sendKeys(Keys.TAB).
            sendKeys(faker.address().fullAddress()).
            sendKeys(Keys.TAB).
            sendKeys(faker.address().fullAddress()).
            sendKeys(Keys.PAGE_DOWN).perform();
    Select select3 =new Select(ercanPage.enterAccountInformationCountry);
    select3.selectByVisibleText("Australia");
    ercanPage.enterAccountInformationState.sendKeys(faker.address().state());
    actions.sendKeys(Keys.TAB).
            sendKeys(faker.address().cityName()).
            sendKeys(Keys.TAB).
            sendKeys(faker.address().zipCode()).
            sendKeys(Keys.PAGE_DOWN).
            sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().phoneNumber()).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    //Verify 'ACCOUNT CREATED!' and click 'Continue' button
    assertTrue(ercanPage.accountCreatedVisible.isDisplayed());
    ercanPage.accountCreatedContinueButton.click();
    Driver.getDriver().navigate().refresh();
    ReusableMethods.waitFor(2);
    ercanPage.accountCreatedContinueButton.click();

    //Verify ' Logged in as username' at top
    assertTrue( ercanPage.loggedInAUserName.isDisplayed());

    // Add products to cart
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(3);
    ercanPage.addTocart1.click();
    ReusableMethods.waitFor(2);
    ercanPage.continueShopping.click();
    ercanPage.addTocart2.click();
    ReusableMethods.waitFor(3);
    ercanPage.continueShopping.click();

    // Click 'Cart' button
    ercanPage.cartOnHomePage.click();

    //Verify that cart page is displayed
    assertTrue( ercanPage.cartOnHomePageIsDisplay.isDisplayed());

    //Click Proceed To Checkout
    ercanPage.proceedToCheckout.click();

    //Verify Address Details and Review Your Order
    assertTrue(ercanPage.addressDetails.isDisplayed());
    assertTrue(ercanPage.reviewYourOrder.isDisplayed());

    //Enter description in comment text area and click 'Place Order'
    ercanPage.comment.sendKeys(faker.artist().name());
    actions.sendKeys(Keys.TAB).
            sendKeys(Keys.ENTER).perform();

    //Enter payment details: Name on Card, Card Number, CVC, Expiration date
    //Click 'Pay and Confirm Order' button
    ercanPage.payAndConfirmOrderButton.click();
    actions.sendKeys(faker.name().fullName()).
            sendKeys(Keys.TAB).
            sendKeys(faker.phoneNumber().cellPhone()).
            sendKeys(Keys.TAB).
            sendKeys("123").
            sendKeys(Keys.TAB).
            sendKeys("04").
            sendKeys(Keys.TAB).
            sendKeys("2030").
            sendKeys(Keys.TAB).
            sendKeys(Keys.ENTER).perform();

    // Verify success message 'Your order has been placed successfully!'
    // assertTrue(ercanPage.successMessage.isDisplayed());
    // ReusableMethods.waitFor(2);

    //Click 'Delete Account' button
    ercanPage.deleteAccountButton.click();

    // Verify 'ACCOUNT DELETED!' and click 'Continue' button
    assertTrue(ercanPage.accountDeletedVisible.isDisplayed());
    ercanPage.accountDeletedContinueButton.click();














}



}
