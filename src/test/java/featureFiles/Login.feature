Feature:Login and Profile Functionality

  Background:
    Given The user navigate to Getmobil
    When The user clicks on the Login button and types phone number
    Then The user verifies login successfully

  Scenario:Profile Functionality
    Given The user hovers over the Profile button and displays profile dropdown menu
    When The user clicks on the Orders button
    Then The user clicks on the Left nav elements and verifies each options
      | mySold         |
      | favorite       |
      | userDetails    |
      | permissions    |
      | addressDetails |
      | logOut         |