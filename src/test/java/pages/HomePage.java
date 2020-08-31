package pages;


import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass
{
       WebDriver driver;

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(linkText = "Log in")
    public WebElement loginLink;

    @FindBy(id = "small-searchterms")
    public WebElement searchTextBox;

    @FindBy(css = "input.search-box-button")
    public WebElement searchButton;

    @FindBy(linkText = "Log out")
    public WebElement logout;


    @FindBy(linkText = "Asus N551JK-XO076H Laptop")
    public WebElement asusLaptop;

    @FindBy( xpath= "(//input[@value='Add to cart'])[3]")
    public WebElement addToCartHtc;



    @FindBy( css= "span.cart-label")
    public WebElement shoppingCart;


    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void gotoRegisterPage()
    {
        registerLink.click();
    }

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void enterSearchText(String searchText)
    {
        searchTextBox.sendKeys(searchText);
    }

    public void clickSearchButton()
    {
        searchButton.click();
    }

    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
    }

    public void verifyLogin()
    {
        logout.isDisplayed();
    }

    public void verifyLaptopResult()
    {
        asusLaptop.isDisplayed();
    }

    public void htcAddToCart()
    {
        addToCartHtc.click();
    }

    public void goToProduct(String productName)
    {
        driver.findElement(By.linkText(productName)).click();
        driver.findElement(By.xpath("(//input[@value='Add to cart']"));
        addToCartHtc.click();
    }


    public void clickShoppingCart()
    {
        shoppingCart.click();
    }


//    gotoRegisterPage()
//    gotoLoginPage()
//
//"addAnyProductTocart()(use htc mobile)
//    gotoCartPage()"
//        "addAnyProductTocart()(use htc mobile)
//    gotoCartPage()"
//        """addAnyProductTocart()(use htc mobile)
//    gotoCartPage()"""
//
//    goToProduct(productName)
//    goToProduct(productName)
//
//"addAnyProductTocart()(use htc mobile)
//    gotoCartPage()"
//        "addAnyProductTocart()(use htc mobile)
//    gotoCartPage()"



}
