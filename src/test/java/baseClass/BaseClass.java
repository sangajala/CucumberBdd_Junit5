package baseClass;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import pages.ShoppingCartPage;

public class BaseClass
{
    public static WebDriver driver;
    public static HomePage homepage;
    public static LoginPage loginpage;
    public static RegisterPage registerpage;
    public static ShoppingCartPage shoppingCartpage;

    @BeforeAll
    public static void setUp()
    {
        driver = new ChromeDriver();

        // driver set up step goes here

        driver.manage().window().maximize();
        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        registerpage = new RegisterPage(driver);
        shoppingCartpage = new ShoppingCartPage(driver);

    }


    @AfterAll
    public static void tearDown()
    {
        driver.close();
    }

    public String getPageTitle()
    {
        return driver.getTitle();
    }

    public void pageRefresh()
    {
        driver.navigate().refresh();
    }

}
