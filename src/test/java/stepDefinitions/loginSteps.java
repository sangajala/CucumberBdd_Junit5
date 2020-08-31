package stepDefinitions;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends BaseClass
{

    @Given("I navigate to url {string}")
    public void i_navigate_to_url(String url)
    {
        setUp();
        homepage.navigateToUrl(url);

    }

    @When("I click on login link")
    public void i_click_on_login_link()
    {
         homepage.clickLoginLink();
    }

    @Then("I should be navigated to login page")
    public void i_should_be_navigated_to_login_page()
    {
       String loginpageTitle = getPageTitle();

       System.out.println(loginpageTitle);

    }

    @When("I enter username {string}")
    public void i_enter_username(String un)
    {
         homepage.pageRefresh();
         loginpage.enterEmail(un);
    }

    @When("I enter password {string}")
    public void i_enter_password(String pw)
    {

        loginpage.enterPassword(pw);
    }

    @When("I click on login button")
    public void i_click_on_login_button()
    {
        loginpage.clickLoginButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully()
    {
          homepage.verifyLogin();
          tearDown();
    }

}
