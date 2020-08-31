Feature: Login to nop commerce application with multiple users
  In order to login
  As a valid user
  I have to provide valid user name and password

  Scenario Outline: verify login functionality with multiple users

    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link
    Then  I should be navigated to login page
    When  I enter username "<email>"
    And   I enter password "<password>"
    And   I click on login button
    Then  I should be logged in successfully

  Examples:
   |email|password|
   |test123@nop.com|test1234|
   |ivan@nop.com| testing|
   |swap.p@gmail.com| Swap123|
