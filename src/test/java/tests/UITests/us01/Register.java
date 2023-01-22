package tests.UITests.us01;

import org.testng.annotations.Test;
import pages.Nihat;
import utilities.ConfigReader;
import utilities.Driver;


public class Register {
   Nihat nihat= new Nihat();
    @Test
    public void TC01() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));
       nihat.SignLoginButton.click();


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
