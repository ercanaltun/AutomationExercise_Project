package tests.UITests.us04;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContacUsForm {
    Nihat nihatpage = new Nihat();
    @Test
    public void TC01 () throws IOException {
        // User goes to url
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Click on 'Signup/ Login' button
        nihatpage.SignLoginButton.click();
        // Click on 'Email' button
        nihatpage.EmailButton.sendKeys(ConfigReader.getProperty("nEmail"), Keys.TAB,
                (ConfigReader.getProperty("nPassword")),Keys.TAB,Keys.ENTER);
        // Click on the contact us form
        nihatpage.ContactUsButton.click();
        // contact us appears
        nihatpage.ContactUs.isDisplayed();
        // Enter name, email, subject and message
        nihatpage.FormName.sendKeys("Nihat",Keys.TAB,"nhtt.25@gmail.com",
                Keys.TAB,"Hayat Ne Garip:)",Keys.TAB,"Elbet Birgün Hersey Güzel OLacak",
                Keys.TAB,Keys.ENTER);



        // Close page
       // Driver.closeDriver();

    }
}
