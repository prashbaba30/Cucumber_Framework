
Feature: Login the page

  Scenario: Successfully Login with valid credentials
  
    Given user launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And user enter Email as "admin@yourstore.com" and Valid Password as "admin"
    And click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout link
    Then Page title should be "Your store.Login"
    And close Browser

    
    
    
    
    Scenario Outline: Successfully Login with valid credentials DDT
  
    Given user should launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And Enter valid Email as "<email>" and Valid Password as "<password>"
    And then click on Login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page title should be "Your store.Login"
    And close Browser
    
    Examples: 
    |email|password|
    |admin@yourstore.com|admin|
    |prash@yourstore.com|admin|