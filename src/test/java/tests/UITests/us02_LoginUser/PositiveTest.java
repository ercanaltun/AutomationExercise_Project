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

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        assertTrue(hatem.HomePAge_isDisplay.isDisplayed());

        hatem.htmLogin.click();

        assertTrue(hatem.Loginpage_isDisplay.isDisplayed());

        hatem.Email_Address.sendKeys(ConfigReader.getProperty("UserEmail"));
        hatem.Password_Password.sendKeys(ConfigReader.getProperty("UserPassword"));

        hatem.LoginButton_Login.click();

        assertTrue(hatem.Logged_in_as.isDisplayed());

        hatem.Delete_account.click();
        hatem.wievBox.click();

        assertTrue(hatem.accountDelete.isDisplayed());


    }
}
