package stepDefinitions;

import baseClass.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass
{
    @When("I enter text in the search text box")
    public void i_enter_text_in_the_search_text_box()
    {
        homepage.enterSearchText("laptop");
    }

    @When("I click in search button")
    public void i_click_in_search_button()
    {
        homepage.clickSearchButton();
    }

    @Then("I should get the results for corresponding product")
    public void i_should_get_the_results_for_corresponding_product()
    {
        homepage.verifyLaptopResult();
    }

    @When("I click on add to cart button for a product listed on home page")
    public void i_click_on_add_to_cart_button_for_a_product_listed_on_home_page()
    {
        driver.navigate().refresh();
        homepage.htcAddToCart();
    }

    @Then("the product should be added to the shopping cart")
    public void the_product_should_be_added_to_the_shopping_cart() throws InterruptedException {

       homepage.clickShoppingCart();
       Thread.sleep(2000);
       shoppingCartpage.verifyHtc();
       tearDown();
    }


}
