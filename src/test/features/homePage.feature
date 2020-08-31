Feature: search for product and add item to cart

  Background: navigate to url
   Given I navigate to url "https://demo.nopcommerce.com/"

  @ui @regression
Scenario: search for a product

  When  I enter text in the search text box
  And   I click in search button
  Then  I should get the results for corresponding product


Scenario: add item to cart

  When  I click on add to cart button for a product listed on home page
  Then  the product should be added to the shopping cart

