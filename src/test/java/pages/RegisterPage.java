package pages;


import baseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass
{
    WebDriver driver;

    @FindBy(id = "gender-male")
    public WebElement maleRadioBtn;

    @FindBy(id = "FirstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "LastName")
    public WebElement lastNameTextBox;


    @FindBy(id = "Email")
    public WebElement emilTextBox;

    @FindBy(id = "Password")
    public WebElement passwordTextBox;

    @FindBy(id = "ConfirmPassword")
    public WebElement confPasswordTextBox;


    @FindBy(id = "register-button")
    public WebElement registerBtn;

    //
    @FindBy(css = "div.result")
    public WebElement messageRegister;


    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }


    public void clickMaleRadioBtn()
    {
        maleRadioBtn.click();
    }


    public void enterFirstname(String fn)
    {
         firstNameTextBox.sendKeys(fn);
    }


    public void enterLastname(String ln)
    {
       lastNameTextBox.sendKeys(ln);
    }


    public void enterEmail(String em)
    {
        emilTextBox.sendKeys(em);
    }


    public void enterPassword(String pw)
    {
        passwordTextBox.sendKeys(pw);
    }

    public void enterConfPassword(String cpw)
    {
       confPasswordTextBox.sendKeys(cpw);
    }


    public void clickRegisterBtn()
    {
        registerBtn.click();
    }


    public String verifyRegisterText()
    {
       return messageRegister.getText();
    }



}
