package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Ramazan {
    public Ramazan(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[text()='All Products']")   public WebElement allProducts;
    @FindBy (xpath = "//div[@class='col-sm-9 padding-right']")   public WebElement productList;
    @FindBy (xpath = "(//*[text()='View Product'])[1]")   public WebElement firstViewProduct;
    @FindBy (xpath = "(//*[@class='product-information'])[1]")   public WebElement productInformation;
    @FindBy (xpath = "((//*[text()='Blue Top'])[1]")   public WebElement productName;
    @FindBy (xpath = "//p[text()='Category: Women > Tops']")   public WebElement productCategory;
    @FindBy (xpath = "//*[text()='Rs. 500']")   public WebElement productPrice;
    @FindBy (xpath = "//*[text()='Availability:']")   public WebElement availability;
    @FindBy (xpath = "//*[text()='Condition:']")   public WebElement condition;
    @FindBy (xpath = "//*[text()='Brand:']")   public WebElement brand;
    @FindBy (xpath = "//*[@id='search_product']")   public WebElement searchBox;
    @FindBy (xpath = "//*[@id='submit_search']")   public WebElement submitBox;
    @FindBy (xpath = "//*[text()='Searched Products']")   public WebElement searchProduct;
    @FindBy (xpath = "(//*[text()='Men Tshirt'])[1]")   public WebElement searcProductsVisible;
    @FindBy (xpath = "//*[text()='Blue Top']")   public WebElement firstProductDisplayInCart;
    @FindBy (xpath = "//*[text()='Men Tshirt']")   public WebElement secondProductDisplayInCart;
    @FindBy (xpath = "(//*[text()='Rs. 500'])[1]")   public WebElement priceFirstProduct;
    @FindBy (xpath = "(//*[text()='Rs. 400'])[1]")   public WebElement priceSecondProduct;
    @FindBy (xpath = "(//*[text()='1'])[1]")   public WebElement quantityFirstProduct;
    @FindBy (xpath = "(//*[text()='1'])[2]")   public WebElement quantitySecondProduct;
    @FindBy (xpath = "(//*[text()='Rs. 500'])[2]")   public WebElement totalPriceFirstProduct;
    @FindBy (xpath = "(//*[text()='Rs. 400'])[2]")   public WebElement totalPriceSecondProduct;
    @FindBy (xpath = "(//*[text()='View Product'])[1]")   public WebElement viewFirstProduct;
    @FindBy (xpath = "(//*[@class='product-information'])[1]")   public WebElement detailsFirstProduct;
    @FindBy (xpath = "(//*[@value='1'])[1]")   public WebElement increaseQuantityFirstProduct;
    @FindBy (xpath = "(//*[@type='button'])[1]")   public WebElement addToCartButton;
    @FindBy (xpath = "(//*[text()='View Cart'])[1]")   public WebElement viewCart;
    @FindBy (xpath = "(//*[text()='4'])[1]")   public WebElement exactQuantity;














}
