package tests.UITests.us09;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static org.testng.AssertJUnit.*;

public class ViewCartBrandProducts extends TestBaseRapor {

Ercan ercanPage=new Ercan();
Actions actions=new Actions(Driver.getDriver());

@Test
    public  void TC2(){

    extentTest=extentReports.createTest("User should  View Category Products");

    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    ReusableMethods.waitFor(1);
    extentTest.info("User should navigate to the url");

    //3. Verify that categories are visible on left side bar
    assertTrue(ercanPage.catagory.isDisplayed());
    extentTest.info("categories should be visibled on left side bar");

    //4. Click on 'Women' category
    ReusableMethods.waitFor(1);
    ercanPage.catagoryWomen.click();
    extentTest.info("User should Click on 'Women' category");

    //5. Click on any category link under 'Women' category, for example: Tops
    ReusableMethods.waitFor(1);
    ercanPage.tops.click();
    Driver.getDriver().navigate().refresh();
    ReusableMethods.waitFor(1);
    ercanPage.catagoryWomen.click();
    ReusableMethods.waitFor(1);
    ercanPage.tops.click();
    extentTest.info("User should Click on any category link under 'Women' category, for example: Tops");

    //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.topsDisplay.isDisplayed());
    ReusableMethods.waitFor(1);
    String expecteddata="WOMEN - TOPS PRODUCTS";
    assertEquals(expecteddata,ercanPage.topsProducts.getText());
    extentTest.info("category page should be displayed and confirm text 'WOMEN - TOPS PRODUCTS");

    //7. On left side bar, click on any sub-category link of 'Men' category
    ercanPage.catagoryMen.click();
    ReusableMethods.waitFor(2);
    ercanPage.catagoryMenTshirts.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.catagoryMen.click();
    ReusableMethods.waitFor(1);
    ercanPage.catagoryMenTshirts.click();
    extentTest.info("On left side bar,User should click on any sub-category link of 'Men' category");

    //8. Verify that user is navigated to that category page
    assertTrue(ercanPage.catagoryMenTshirtsIsVisible.isDisplayed());
    extentTest.pass("category page is navigated successfully");


    Driver.quitDriver();


}



}
