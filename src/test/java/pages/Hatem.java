package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hatem {

    public Hatem(){

        PageFactory.initElements(Driver.getDriver(),this);


        }
    @FindBy(xpath = "//*[text()=' Signup / Login']")                   public WebElement htmLogin;
    @FindBy(xpath = "(//*[@placeholder='Email Address'])[1]")          public WebElement Email_Address;
    @FindBy(xpath = "(//*[@placeholder='Password'])[1]")               public WebElement Password_Password;
    @FindBy(xpath = "//*[@data-qa='login-button']")                    public WebElement LoginButton_Login;
    @FindBy(xpath = "//*[@alt='Website for automation practice']")     public WebElement HomePAge_isDisplay;
    @FindBy(xpath = "(//h2)[1]")                                       public WebElement Loginpage_isDisplay;
    @FindBy(xpath = "//*[@class='fa fa-user']")                        public WebElement  Logged_in_as;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")                     public WebElement  Delete_account;
    @FindBy(xpath = "//*[text()='Account Deleted!']")                  public WebElement  accountDelete;
    @FindBy(xpath = "(//*[@fill='#5F6368'])[1]")                       public WebElement  wievBox;







}
