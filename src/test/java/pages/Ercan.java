package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ercan {

    public Ercan(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signup_login;
    @FindBy(xpath="(//input[@name='email'])[1]")
    public WebElement email;

    @FindBy(xpath="(//input[@name='password'])[1]")
    public WebElement pasword;

    @FindBy(xpath="(//*[text()='Login'])[1]")
    public WebElement login;

    @FindBy(xpath="(//*[text()='Your email or password is incorrect!'])[1]")
    public  WebElement incorrectEmailOrPassword;

    @FindBy(xpath="//a[@data-product-id='1']")
    public WebElement addTocart1;

    @FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
    public WebElement continueShopping;

    @FindBy(xpath="//a[@data-product-id='2']")
    public WebElement addTocart2;

    @FindBy(xpath="//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath="//*[text()=' Cart']")
    public WebElement cartOnHomePage;

    @FindBy(xpath="//*[text()='Shopping Cart']")
    public WebElement cartOnHomePageIsDisplay;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement newUserSignUpName;

    @FindBy(xpath = "(//*[@name='email'])[2]")
    public WebElement newUserSignUpEmail;

    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement newUserSignUp;

    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement enterAccountInformationtitleMr;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement enterAccountInformationPassword;

    @FindBy(xpath = "//*[@id='days']")
    public WebElement enterAccountInformationDays;

    @FindBy(xpath="//*[@id='months']")
    public WebElement enterAccountInformationMonth;

    @FindBy(xpath="//*[@id='years']")
    public WebElement enterAccountInformationYears;

    @FindBy(xpath="//*[@id='newsletter']")
    public WebElement enterAccountInformationNewsletter;

    @FindBy(xpath="//*[@id='optin']")
    public WebElement enterAccountInformationReceieve;


    @FindBy(xpath="//*[@id='first_name']")
    public WebElement enterAccountInformationFirstName;


    @FindBy(xpath="//*[@id='country']")
    public WebElement enterAccountInformationCountry;

    @FindBy(xpath="//*[@id='state']")
    public WebElement enterAccountInformationState;
    @FindBy(xpath="//*[@id='mobile_number']")
    public WebElement mobileNumber;

    @FindBy(xpath="//*[text()='Create Account']")
    public WebElement enterAccountInformationCreateAccountButton;

    @FindBy(xpath="//*[text()='Account Created!']")
    public WebElement accountCreatedVisible;

    @FindBy(xpath="//*[text()='Continue']")
    public WebElement accountCreatedContinueButton;

    @FindBy(xpath="//*[text()=' Logged in as ']")
    public WebElement loggedInAUserName;

    @FindBy(xpath="//*[text()='Address Details']")
    public WebElement addressDetails;

    @FindBy(xpath="//*[text()='Review Your Order']")
    public WebElement reviewYourOrder;

    @FindBy(xpath="//*[@name='message']")
    public WebElement comment;

    @FindBy(xpath="//*[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath="//*[text()='Pay and Confirm Order']")
    public WebElement payAndConfirmOrderButton;

    @FindBy(xpath="(//div[@class='col-md-12 form-group'])[1]")
    public WebElement successMessage;

    @FindBy(xpath="//*[text()=' Delete Account']")
    public WebElement deleteAccountButton;

    @FindBy(xpath="//*[text()='Account Deleted!']")
    public WebElement accountDeletedVisible;

    @FindBy(xpath="//*[text()='Continue']")
    public WebElement accountDeletedContinueButton;




}
