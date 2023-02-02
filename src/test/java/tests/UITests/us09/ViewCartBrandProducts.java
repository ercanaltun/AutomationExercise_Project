package tests.UITests.us09;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Ercan;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.AssertJUnit.*;

public class ViewCartBrandProducts {

Ercan ercanPage=new Ercan();
Actions actions=new Actions(Driver.getDriver());



  //7. On left side bar, click on any sub-category link of 'Men' category
  //8. Verify that user is navigated to that category page
@Test
    public  void TC2(){
    //2. Navigate to url 'http://automationexercise.com'
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    ReusableMethods.waitFor(1);

    //3. Verify that categories are visible on left side bar
    assertTrue(ercanPage.catagory.isDisplayed());

    //4. Click on 'Women' category
    ReusableMethods.waitFor(1);
    ercanPage.catagoryWomen.click();

    //5. Click on any category link under 'Women' category, for example: Tops
    ReusableMethods.waitFor(1);
    ercanPage.tops.click();
    Driver.getDriver().navigate().refresh();
    ReusableMethods.waitFor(1);
    ercanPage.catagoryWomen.click();
    ReusableMethods.waitFor(1);
    ercanPage.tops.click();

    //6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
    ReusableMethods.waitFor(1);
    assertTrue(ercanPage.topsDisplay.isDisplayed());
    ReusableMethods.waitFor(1);
    String expecteddata="WOMEN - TOPS PRODUCTS";
    assertEquals(expecteddata,ercanPage.topsProducts.getText());

    Driver.quitDriver();


}



}
