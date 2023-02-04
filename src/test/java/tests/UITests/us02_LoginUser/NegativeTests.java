package tests.UITests.us02_LoginUser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.*;

import static org.testng.AssertJUnit.assertTrue;

public class NegativeTests extends TestBaseRapor {
      Ercan ercanPage=new Ercan();
      Actions actions=new Actions(Driver.getDriver());

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

    @Test(dependsOnMethods = "negative1")
    public void negative2(){
        //Enter with incorrect email and true password
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(10);
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

    @Test(dependsOnMethods = "negative2")
    public void negative3(){
        //Enter with  true email and  incorrectpassword

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
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

    @Test(groups = "gp1")
    public void negative4(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assertTrue(ercanPage.signup_login.isDisplayed());
        ercanPage.email.sendKeys(" ");
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();


    }

    @Test(groups = "gp1")
    public  void negative5(){

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        ReusableMethods.waitFor(3);
        assertTrue(ercanPage.signup_login.isDisplayed());
        ercanPage.email.sendKeys("userEmail");
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty(" ")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();



    }





}
