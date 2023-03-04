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


}
