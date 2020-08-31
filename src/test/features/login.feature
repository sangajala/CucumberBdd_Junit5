  Feature: Login to nop commerce application
  In order to login
  As a valid user
  I have to provide valid user name and password

  @regression
  Scenario: verify login functionality with valid credentials

    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on login link
    Then  I should be navigated to login page
    When  I enter username 'ivan@nop.com'
    And   I enter password 'testing'
    And   I click on login button
    Then  I should be logged in successfully


