package tests.UITests.us01_RegisterUser;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;


public class Register {
    Nihat nihatPage = new Nihat();
    @Test
    public void TC01() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
       nihatPage.SignLoginButton.click();


    }
/*
    @Test(priority = 1)
    public void TC02() {
        driver.get("https://www.automationexercise.com/");
       // nihatpage.SignLoginButton.click();
        Driver.getDriver().findElement(By.xpath("//*[@class='fa fa-lock']")).click();
    }

 */
}
