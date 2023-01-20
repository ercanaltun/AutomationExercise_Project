package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Nihat {

    public Nihat(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement SignLoginButton;

    @FindBy(xpath = "//*[@id='header']")
    public WebElement Anasayfa;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement NewUser;

    @FindBy(xpath = "//*[@type='text']")
    public WebElement Name;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement EnterAccount;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement MrButton;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//*[@id='newsletter']")
    public WebElement Newsletter;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement Optin;

    @FindBy(xpath = "//*[@id='first_name']")
    public WebElement FirstName;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement AccountCreated;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement ContinueButton;

    @FindBy(xpath = "//*[@class='fa fa-user']")
    public WebElement GirisBasarili;

    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement DeleteButton;

    @FindBy(xpath = "//*[@class='ns-onkpn-e-16']")
    public WebElement CloseButton;

    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement AccountDelete;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement DeleteContinue;
}
