package pages;


import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends BaseClass
{
       WebDriver driver;


    @FindBy(linkText = "HTC One M8 Android L 5.0 Lollipop")
    public WebElement htcOne;

    public ShoppingCartPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void verifyHtc()
    {
        htcOne.isDisplayed();
    }
}
