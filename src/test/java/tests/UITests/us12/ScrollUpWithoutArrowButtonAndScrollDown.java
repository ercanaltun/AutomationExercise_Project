package tests.UITests.us12;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Hatem;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.assertTrue;

public class ScrollUpWithoutArrowButtonAndScrollDown {

    Hatem hatemPage = new Hatem();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker=new Faker();
    Nihat nihatPage = new Nihat();
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        assertTrue(hatemPage.HomePageVisible.isDisplayed());
        ReusableMethods.waitFor(3);
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",hatemPage.SusbridgeScroll);
        assertTrue(hatemPage.Subscription.isDisplayed());

        JavascriptExecutor jse2=(JavascriptExecutor)Driver.getDriver();
        jse2.executeScript("arguments[0].scrollIntoView(true);",hatemPage.HomePage);
        assertTrue(hatemPage.AssertipnFull_Fled.isDisplayed());








    }




}

