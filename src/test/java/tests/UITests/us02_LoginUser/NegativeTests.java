package tests.UITests.us02_LoginUser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.*;

import static org.testng.AssertJUnit.assertTrue;

public class NegativeTests extends TestBaseBeforeAfterClass {
      Ercan ercanPage=new Ercan();
      Actions actions=new Actions(Driver.getDriver());

    @Test(groups = "gp1")
    public void negative1() {
        //Enter with incorrect email and password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(ercanPage.signup_login.isDisplayed());
        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("incorrectEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }

    @Test(groups = "gp1")
    public void negative2(){
        //Enter with incorrect email and true password
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assertTrue(ercanPage.signup_login.isDisplayed());

        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("incorrectEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("userPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test(groups = "gp1")
    public void negative3(){
        //Enter with  true email and  incorrectpassword

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(5);
        assertTrue(ercanPage.signup_login.isDisplayed());

        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();

    }



}
