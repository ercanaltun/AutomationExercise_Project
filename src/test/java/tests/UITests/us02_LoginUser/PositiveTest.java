package tests.UITests.us02_LoginUser;

import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static org.testng.Assert.assertTrue;

public class PositiveTest extends TestBaseRapor {
    Hatem hatem=new Hatem();
    @Test
    public void PositiveTest() {
        //User should enter with correct email and correct password successfully
        extentTest=extentReports.createTest("PositiveTest: User should enter with correct email and correct password and delete account successfully ");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("user navigate to the url successfully");

        assertTrue(hatem.HomePAge_isDisplay.isDisplayed());
        extentTest.info("Home page should display succssefully");

        hatem.htmLogin.click();

        assertTrue(hatem.Loginpage_isDisplay.isDisplayed());
        extentTest.info("Login page should display succssefully");

        hatem.Email_Address.sendKeys(ConfigReader.getProperty("UserEmail"));
        hatem.Password_Password.sendKeys(ConfigReader.getProperty("UserPassword"));
        extentTest.info("User enter with correct email and correct password");

        hatem.LoginButton_Login.click();

        assertTrue(hatem.Logged_in_as.isDisplayed());
        extentTest.info("Username is visible in logged in as");

        hatem.Delete_account.click();
        extentTest.info("user should delete account successfully");

        assertTrue(hatem.accountDelete.isDisplayed());
        extentTest.info("Account delete is display successfully");
        Driver.quitDriver();


    }



}
