package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public abstract class TestBaseBeforeAfterClass {

    // @BeforeClass ve @AfterClass notasyonlarını
    // TestNG de kullanırken JUnit'teki gibi static yapmaya gerek yoktur
    protected  WebDriver driver;
    @BeforeClass(groups = "gp1")
    public void seTup(){

       // WebDriverManager.chromedriver().setup();
       // driver=new ChromeDriver();
      //  Actions action=new Actions(driver);
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass(groups = "gp1")
    public void tearDown() throws InterruptedException {
     //   Thread.sleep(3000);
        driver.quit();
    }
}
