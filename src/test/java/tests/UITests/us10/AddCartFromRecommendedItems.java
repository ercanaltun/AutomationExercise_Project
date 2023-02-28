package tests.UITests.us10;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.Hatem;
import utilities.ConfigReader;
import utilities.Driver;
import java.io.IOException;
import static org.testng.AssertJUnit.assertTrue;

public class AddCartFromRecommendedItems {
    Hatem hatemPage=new Hatem();
    Faker faker=new Faker();
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        JavascriptExecutor jse=(JavascriptExecutor)Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",hatemPage.SusbridgeScroll);
        assertTrue(hatemPage.Recommended_Item.isDisplayed());
        hatemPage.ADD_iTEM1.click();
        hatemPage.WievCart.click();
        assertTrue(hatemPage.CartVisible.isDisplayed());
        Driver.quitDriver();
   }
}
