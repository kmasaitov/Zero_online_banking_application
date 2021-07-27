@wip
  Feature: Login functionality

    Scenario: User should not be able to login
      Given User is in the login page
      Then Users with wrong username or wrong password should not be able to login
      And User should see error message "Login and/or password are wrong." should be displayed


      Scenario: User should not be able to login
        Given User is in the login page
        Then Users with blank username or wrong password should not be able to login
        And User should see error message "Login and/or password are wrong." should be displayed

    Scenario: User should be able to login using correct credentials
      Given User is in the login page
      Then Users with correct username or wrong password should be able to login
      And Account	summary	page	should	be	displayed