Feature: N.A.I.C. Login Page
  @regression
  Scenario: User tries to login with invalid credentials
    When User navigates to the page
    Then User inputs "rdelay" in the username field
    And User inputs "Password123" in the password field
    And User clicks on the login button
    Then User should see the error message "Login failed, please try again."

  Scenario: User clicks on the forgot password link
    When User navigates to the page
    Then I click forgot password link
    Then I input "rdelay" into the username search field
    Then I click the search button
    Then I should see the error message "The user name is not valid or is not eligible to use this feature"
    Then I click the cancel button
    Then I should see the login page






