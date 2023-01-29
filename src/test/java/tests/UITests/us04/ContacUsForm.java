package tests.UITests.us04;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;

public class ContacUsForm {
    Nihat nihatpage = new Nihat();
    @Test
    public void TC01 () {
        // User goes to url
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Click on 'Signup/ Login' button
        nihatpage.SignLoginButton.click();
        // Click on 'Email' button
        nihatpage.EmailButton.sendKeys(ConfigReader.getProperty("nEmail"), Keys.TAB,
                (ConfigReader.getProperty("nPassword")),Keys.TAB,Keys.ENTER);
        // Click on the contact us form
        nihatpage.ContactUsButton.click();
        // contact us form appears
        nihatpage.FormGorunurlugu.isDisplayed();
        // Close page
        Driver.closeDriver();
    }
}
