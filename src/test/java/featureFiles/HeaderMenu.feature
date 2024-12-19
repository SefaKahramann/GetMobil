Feature:Header Menu Functionality

  Scenario: Header Menu Check Functionality
    Given The user navigate to Getmobil
    When The user views the buttons in the Header Menu
    And The user hovers over the Mobile Phone button views the products and clicks
    Then The user clicks the Sell Phone button and verifies they are redirected to the page
    When The user clicks the Store button and verifies they are redirected to the page
    And The user clicks the Franchise button and verifies they are redirected to the page
    When The user clicks on the Device Search field and views the products
    And The user clicks the My Cart button and is redirected to the cart page
    Then The user clicks the Getmobil logo and reaches the homepage