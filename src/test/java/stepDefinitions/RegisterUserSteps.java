package stepDefinitions;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterUserSteps extends BaseClass

{
    @When("I click on register link")
    public void i_click_on_register_link()
    {
        homepage.gotoRegisterPage();
    }

    @Then("I should be directed to register page")
    public void i_should_be_directed_to_register_page()
    {
        homepage.getPageTitle();
    }

    @When("I click on male radio button")
    public void i_click_on_male_radio_button()
    {
       registerpage.clickMaleRadioBtn();
    }

    @When("I enter firstName lastName email password confirmPassword")
    public void i_enter_firstName_lastName_email_password_confirmPassword(io.cucumber.datatable.DataTable dataTable)
    {
       driver.navigate().refresh();
       registerpage.enterFirstname(dataTable.cell(1,0));
       registerpage.enterLastname(dataTable.cell(1,1));
       registerpage.enterEmail(dataTable.cell(1,2));
       registerpage.enterPassword(dataTable.cell(1,3));
       registerpage.enterConfPassword(dataTable.cell(1,4));
    }

    @When("I click on register button")
    public void i_click_on_register_button()
    {
           registerpage.clickRegisterBtn();
    }

    @Then("registration should be successful")
    public void registration_should_be_successful()
    {
          System.out.println("verify register text:  " + registerpage.verifyRegisterText());
          tearDown();
    }


}
