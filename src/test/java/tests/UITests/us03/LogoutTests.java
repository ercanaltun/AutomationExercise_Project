package tests.UITests.us03;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;

public class LogoutTests {
    Nihat nihatpage = new Nihat();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

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
        // Click on 'Logout' button
        nihatpage.LogoutButton.click();
        // closes the page
       // Driver.closeDriver();
    }
}
