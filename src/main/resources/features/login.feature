Feature: User login to automation web

  Scenario: user can not login with invalid data
    Given user navigate to automation web
    When user click on Signup or Login button
    And user Enter email address "hussein@gmail.com"
    And user Enter password"555555555"
    And user click on login button
    Then web will show error message

  @smo
    Scenario Outline: Invalid login
      Given user navigate to automation web
      When user click on Signup or Login button
      And user Enter email address "<user>"
      And user Enter password"<password>"
      And user click on login button
      Then web will show error message


      Examples:
           |user                 | password      |message  |
           | hussein@gmail.com   | 555555        |yes|
           |bebo@yahoo.com.com   | 00000000      |no|
           |234@hotmail.com      | 212312ed      |no|

           |                     |               ||