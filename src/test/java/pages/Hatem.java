package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Hatem {

    public Hatem(){

        PageFactory.initElements(Driver.getDriver(),this);


        }
    @FindBy(xpath = "//*[text()=' Signup / Login']")                         public WebElement htmLogin;
    @FindBy(xpath = "(//*[@placeholder='Email Address'])[1]")                public WebElement Email_Address;
    @FindBy(xpath = "(//*[@placeholder='Password'])[1]")                     public WebElement Password_Password;
    @FindBy(xpath = "//*[@data-qa='login-button']")                          public WebElement LoginButton_Login;
    @FindBy(xpath = "//*[@alt='Website for automation practice']")           public WebElement HomePAge_isDisplay;
    @FindBy(xpath = "(//h2)[1]")                                             public WebElement Loginpage_isDisplay;
    @FindBy(xpath = "//*[@class='fa fa-user']")                             public WebElement  Logged_in_as;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")                          public WebElement  Delete_account;
    @FindBy(xpath = "//*[text()='Account Deleted!']")                       public WebElement  accountDelete;
    @FindBy(xpath = "//*[@class='material-icons card_travel']")             public WebElement  Products;
    @FindBy(xpath = "//*[@id='sale_image']")                                public WebElement  SuccesfullyImage;
    @FindBy(xpath = "//*[@id='search_product']")                            public WebElement  SearchProduct;
    @FindBy(xpath = "//*[@id='submit_search']")                             public WebElement  searchbutton;
    @FindBy(xpath = "//h2[@class='title text-center']")                     public WebElement  Searched_Product;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[1]")        public WebElement  AddToCart;
    @FindBy(xpath = "(//*[@class='btn btn-default add-to-cart'])[3]")        public WebElement  AddToCart2;
    @FindBy(xpath = "//*[@class='btn btn-success close-modal btn-block']")   public WebElement continue_shopping;
    @FindBy(xpath = "//*[text()='View Cart']")                               public WebElement view_cart;
    @FindBy(xpath = "//*[@id='cart_items']")                                 public WebElement CardContainer;
    @FindBy(xpath = "//*[@class='fa fa-lock']")                              public WebElement LoginButton;
    @FindBy(xpath = "//*[@data-qa='signup-name']")                           public WebElement NewUser_Name;
    @FindBy(xpath = "//*[@data-qa='signup-email']")                          public WebElement Email_Email;
    @FindBy(xpath = "//*[@data-qa='signup-button']")                         public WebElement SignupButton;
    @FindBy(xpath = "(//*[@type='radio'])[1]")                               public WebElement radioButton;
    @FindBy(xpath = "//*[@type='password']")                                 public WebElement PasswordField;
    @FindBy(xpath = "(//div/select/option[@value='3'])[1]")                  public WebElement Daydate;
    @FindBy(xpath = "(//div/select/option[@value='3'])[2]")                  public WebElement monthdate;
    @FindBy(xpath = "//div/select/option[@value='1988']")                    public WebElement yearDate;
    @FindBy(xpath = "//*[@id='newsletter']")                                 public WebElement clicknewsletter;
    @FindBy(xpath = "(//*[@class='fa fa-shopping-cart'])[1]")                public WebElement clickCart;
    @FindBy(xpath = "//*[@class='cart_menu']")                               public WebElement visibilityCartMenu;
    @FindBy(xpath = "(//*[@class='fa fa-plus-square'])[1]")                  public WebElement View_Product;
    @FindBy(xpath = "//*[@name='review']")                                   public WebElement riview_here;
    @FindBy(xpath = "//*[text()='Write Your Review']")                       public WebElement riview_visibil;
    @FindBy(xpath = "//*[@id='name']")                                       public WebElement YourName;
    @FindBy(xpath = "//*[@id='cart_items']")                                 public WebElement CartVisible;
    @FindBy(xpath = "//*[@id='susbscribe_email']")                           public WebElement SusbridgeScroll;
    @FindBy(xpath = "(//h2[@class='title text-center'])[1]")                 public WebElement Recommended_Item;
    @FindBy(xpath = "(//*[@data-product-id='2'])[1]")                        public WebElement ADD_iTEM1;
    @FindBy(xpath = "(//*[@class='text-center'])[2]")                        public WebElement WievCart;
    @FindBy(xpath = "//*[@id='header']")                                      public WebElement HomePageVisible;









}
