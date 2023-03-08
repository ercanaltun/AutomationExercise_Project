package tests.UITests.us06.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.*;

public class ViewCategoryProducts extends TestBaseRapor {
Ercan ercanPage=new Ercan();
Actions actions=new Actions(Driver.getDriver());
@Test
    public  void TC3(){

    extentTest=extentReports.createTest("User should  View & Cart Brand Products");

    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    extentTest.info("User should  navigate to the url ");

    //3. Click on 'Products' button
    ReusableMethods.waitFor(1);
    ercanPage.products.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.products.click();
    extentTest.info("User should Click on 'Products' button");

    //4. Verify that Brands are visible on left side bar
    ReusableMethods.waitFor(2);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.brands.isDisplayed());
    extentTest.info("Brands should be visibled on left side bar");

    //5. Click on any brand name
    ReusableMethods.waitFor(1);
    ercanPage.polo.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.polo.click();
    ReusableMethods.waitFor(1);
    extentTest.info("User should Click on any brand name");

    //6. Verify that user is navigated to brand page and brand products are displayed
    assertTrue(ercanPage.poloProducts.isDisplayed());
    ReusableMethods.waitFor(1);
    extentTest.info("user should be  navigated to brand page and brand products are displayed");

    //7. On left side bar, click on any other brand link
    ercanPage.hm.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.hm.click();
    extentTest.info("On left side bar,User should click on any other brand link");

    //8. Verify that user is navigated to that brand page and can see products
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.hm.isDisplayed());
    extentTest.pass("user is navigated to that brand page and can see products");


    Driver.quitDriver();


}




}










