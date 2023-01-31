package tests.UITests.us01_RegisterUser;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;


public class Register {
    Nihat nihatPage = new Nihat();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    @Test(priority = 1)
    public void TC01() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
       //Verify that home page is visible successfully
        nihatPage.Anasayfa.isDisplayed();
        // Click on 'Signup / Login' button
       nihatPage.SignLoginButton.click();
       // Verify 'New User Signup!' is visible
        nihatPage.NewUser.isDisplayed();
        // Enter name and email address
        nihatPage.Name.sendKeys(faker.name().name());
        actions.sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        nihatPage.EnterAccount.isDisplayed();
    }


    @Test(dependsOnMethods = "TC01")
    public void TC02 () {
        // Fill details: Title, Name, Email, Password, Date of birth
        nihatPage.MrButton.click();
        nihatPage.Password.sendKeys(faker.internet().password());
        actions.sendKeys(Keys.TAB,"20",Keys.TAB,"july",Keys.TAB,"1985",Keys.PAGE_DOWN).perform();
        nihatPage.Newsletter.click();
        nihatPage.Optin.click();
               nihatPage.FirstName.sendKeys(faker.name().firstName());
               actions.sendKeys(Keys.TAB, faker.name().lastName(),Keys.TAB,"Mezunlar", Keys.TAB,
                       faker.address().fullAddress(), Keys.TAB,faker.address().zipCode(),
                       Keys.TAB,faker.address().country(),Keys.TAB,faker.address().state(),Keys.TAB,
                       faker.address().city(),Keys.TAB,faker.address().zipCode(),
                       Keys.TAB,faker.phoneNumber().phoneNumber(),Keys.TAB,
                       // Click 'Create Account button'
                       Keys.ENTER).perform();
    }

    @Test(dependsOnMethods = "TC02")
    public void TC03() {
        // Verify that 'ACCOUNT CREATED!' is visible
        nihatPage.AccountCreated.isDisplayed();
        // Click 'Continue' button
        nihatPage.ContinueButton.click();
        Driver.getDriver().navigate().refresh();
        nihatPage.ContinueButton.click();
        // Verify that 'Logged in as username' is visible
        nihatPage.GirisBasarili.isDisplayed();
        // Click 'Delete Account' button
        nihatPage.DeleteButton.click();
        // Verify that 'ACCOUNT DELETED!' is visible
        nihatPage.AccountDelete.isDisplayed();
        // click 'Continue' button
        nihatPage.DeleteContinue.click();
        // closes the page
        Driver.closeDriver();



    }



}
