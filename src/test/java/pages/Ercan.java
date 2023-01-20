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

<<<<<<< HEAD
=======
    //Sende olmasan biz nasil halledecez bu kadar isi ercan abi :)































>>>>>>> ercan
}
