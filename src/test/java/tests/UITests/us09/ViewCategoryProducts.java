package tests.UITests.us09;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.*;

public class ViewCategoryProducts {
Ercan ercanPage=new Ercan();
Actions actions=new Actions(Driver.getDriver());
@Test
    public  void TC3(){

    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));

    //3. Click on 'Products' button
    ReusableMethods.waitFor(1);
    ercanPage.products.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.products.click();

    //4. Verify that Brands are visible on left side bar
    ReusableMethods.waitFor(2);
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.brands.isDisplayed());

    //5. Click on any brand name
    ReusableMethods.waitFor(1);
    ercanPage.polo.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.polo.click();
    ReusableMethods.waitFor(1);

    //6. Verify that user is navigated to brand page and brand products are displayed
    assertTrue(ercanPage.poloProducts.isDisplayed());
    ReusableMethods.waitFor(1);

    //7. On left side bar, click on any other brand link
    ercanPage.hm.click();
    Driver.getDriver().navigate().refresh();
    ercanPage.hm.click();


    //8. Verify that user is navigated to that brand page and can see products
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.hm.isDisplayed());

    Driver.quitDriver();


}



}
