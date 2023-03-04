package tests.UITests.us06;

import org.testng.annotations.Test;
import pages.Ercan;
import pages.Ramazan;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.Assert.*;

public class ProductDetailsPage {
    Ercan ercanpage=new Ercan();
    Ramazan ramazan=new Ramazan();
    @Test
    public void test1(){
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3. Verify that home page is visible successfully
        assertTrue(ercanpage.signup_login.isDisplayed());

        //4. Click on 'Products' button
        ercanpage.products.click();

        //5. Verify user is navigated to ALL PRODUCTS page successfully
        assertTrue(ramazan.allProducts.isDisplayed());

        //6. The products list is visible
        assertTrue(ramazan.productList.isDisplayed());

        //7. Click on 'View Product' of first product
        ramazan.firstViewProduct.click();

        //8. User is landed to product detail page
        assertTrue(ramazan.productInformation.isDisplayed());

        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        assertTrue(ramazan.productName.isDisplayed());
        assertTrue(ramazan.productCategory.isDisplayed());
        assertTrue(ramazan.productPrice.isDisplayed());
        assertTrue(ramazan.availability.isDisplayed());
        assertTrue(ramazan.condition.isDisplayed());
        assertTrue(ramazan.brand.isDisplayed());

    }









}
