Feature:  Register a new user
  In order to register
  As a user
  I have to enter data in all mandatory fields


  @ui @regression
  Scenario: user registration with valid data

    Given I navigate to url "https://demo.nopcommerce.com/"
    When  I click on register link
    Then  I should be directed to register page
    When  I click on male radio button
    And   I enter firstName lastName email password confirmPassword
    |firstName | lastName | email                      | password    |confirmPassword |
    | user2   |  test2   |testuser2@nop.com            | testing     |   testing      |

    And   I click on register button
    Then registration should be successful





