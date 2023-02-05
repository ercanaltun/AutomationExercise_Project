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


   @Test
   public void negative1() {
       extentTest=extentReports.createTest("negative1:User shouldn't Enter with incorrect email and password");
        //Enter with incorrect email and password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User should navigate to url");

        assertTrue(ercanPage.signup_login.isDisplayed());
        extentTest.info("Home page visible successfully");

        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("incorrectEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        extentTest.pass("User don't enter with incorrect email and password");
       Driver.closeDriver();


    }

    @Test
    public void negative2(){
       extentTest=extentReports.createTest("negative2:User shouldn't Enter with incorrect email and true password");
        //Enter with incorrect email and true password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User should navigate to url");

        ReusableMethods.waitFor(1);
        assertTrue(ercanPage.signup_login.isDisplayed());
        extentTest.info("Home page visible successfully");

        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("incorrectEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("userPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        extentTest.pass("User don't enter with incorrect email and true password");
        Driver.closeDriver();


    }

    @Test
    public void negative3(){
       extentTest=extentReports.createTest("negative3:User shouldn't Enter with  true email and  incorrect password");
        //Enter with  true email and  incorrect password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User should navigate to url");

        ReusableMethods.waitFor(1);
        assertTrue(ercanPage.signup_login.isDisplayed());
        extentTest.info("Home page visible successfully");

        ercanPage.signup_login.click();
        ercanPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("incorrectPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        extentTest.pass("User don't enter with true email and  incorrect password");
        Driver.closeDriver();


    }

    @Test
    public void negative4(){
       extentTest=extentReports.createTest("negative4:user should't enter with space character in email and correct password");
       //user should't enter with space carachter in email and correct password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User should navigate to url");

        ReusableMethods.waitFor(3);
        assertTrue(ercanPage.signup_login.isDisplayed());
        extentTest.info("Home page visible successfully");

        ercanPage.email.sendKeys(" ");
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("userPassword")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        extentTest.pass("user don't enter with space character in email and correct password");
        Driver.closeDriver();


    }

    @Test
    public  void negative5(){
        extentTest=extentReports.createTest("negative4:user should't enter with  in correct email and space character password");
        //user should't enter with space carachter in email and correct password

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("User should navigate to url");

        ReusableMethods.waitFor(3);
        assertTrue(ercanPage.signup_login.isDisplayed());
        extentTest.info("Home page visible successfully");

        ercanPage.email.sendKeys("userEmail");
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty(" ")).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        assertTrue(ercanPage.incorrectEmailOrPassword.isDisplayed());
        extentTest.pass("user don't enter with  in correct email and space character password");

        Driver.closeDriver();



    }





}
