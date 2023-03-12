package tests.UITests.us03;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterWithExsistingEmail {
    Nihat nihatPage = new Nihat();

    @Test
    public void Tc01 () {
        // Navigate to url
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Verify that home page is visible successfully
        nihatPage.Anasayfa.isDisplayed();

        // Click on 'Signup / Login' button
        nihatPage.SignLoginButton.click();

        // Verify 'New User Signup!' is visible
        nihatPage.NewUser.isDisplayed();

        // Enter name
        nihatPage.Name.sendKeys("Nhtt");

        // Enter email address
        nihatPage.MailAdress.sendKeys("nhtt.25@gmail.com");

        // Click 'Signup' button
        nihatPage.SignupButton.click();

       //  Verify error 'Email Address already exist!' is visible
        nihatPage.VerifyErrorEmail.isDisplayed();

       // Close page
        Driver.closeDriver();


        

    }


}
