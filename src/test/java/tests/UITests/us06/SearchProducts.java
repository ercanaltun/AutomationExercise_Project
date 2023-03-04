package tests.UITests.us06;

import org.testng.annotations.Test;
import pages.Ercan;
import pages.Ramazan;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.Assert.*;

public class SearchProducts {

Ercan ercan=new Ercan();
Ramazan ramazan=new Ramazan();

    @Test
    public void test2(){

        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3. Verify that home page is visible successfully
        assertTrue(ercan.signup_login.isDisplayed());

        //4. Click on 'Products' button
        ercan.products.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        assertTrue(ramazan.allProducts.isDisplayed());

        //6. Enter product name in search input and click search button
        ramazan.searchBox.sendKeys("Men Tshirt");
        ramazan.submitBox.click();

        //7. Verify 'SEARCHED PRODUCTS' is visible
        assertTrue(ramazan.searchProduct.isDisplayed());

        //8. Verify all the products related to search are visible
        assertTrue(ramazan.searcProductsVisible.isDisplayed());

    }


}
