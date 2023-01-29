package tests.UITests.us05;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;

public class VerifySubscriptionInHomePage {
    Nihat nihatpage = new Nihat();

    @Test
    public void TC01() {
        // User goes to url
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Click on 'Signup/ Login' button
        nihatpage.SignLoginButton.click();
        // Click on 'Email' button
        nihatpage.EmailButton.sendKeys(ConfigReader.getProperty("nEmail"), Keys.TAB,
                (ConfigReader.getProperty("nPassword")),Keys.TAB,Keys.ENTER);
        // successful login
        nihatpage.LoginGorunurlugu.isDisplayed();
        // Close page
        Driver.closeDriver();
    }
}
