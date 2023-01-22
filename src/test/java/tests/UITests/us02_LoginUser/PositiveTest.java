package tests.UITests.us02_LoginUser;

import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.Assert.assertTrue;

public class PositiveTest  {
    Hatem hatem=new Hatem();
    @Test
    public void PositiveTest() {
        //1. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //2. Verify that home page is visible successfully
        assertTrue(hatem.HomePAge_isDisplay.isDisplayed());
        //3. Click on 'Signup / Login' button
        hatem.htmLogin.click();
        //4. Verify 'Login to your account' is visible
        assertTrue(hatem.Loginpage_isDisplay.isDisplayed());
        //Register the user
        //5. Enter correct email address and password
        hatem.Email_Address.sendKeys(ConfigReader.getProperty("UserEmail"));
        hatem.Password_Password.sendKeys(ConfigReader.getProperty("UserPassword"));
        //6. Click 'login' button
        hatem.LoginButton_Login.click();
        //7.Verify that 'Logged in as username' is visible
        assertTrue(hatem.Logged_in_as.isDisplayed());
        //8.Click 'Delete Account' button
        hatem.Delete_account.click();
        hatem.wievBox.click();
        //9.Verify that 'ACCOUNT DELETED!' is visible
        assertTrue(hatem.accountDelete.isDisplayed());


    }
}
