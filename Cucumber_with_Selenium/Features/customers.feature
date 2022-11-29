
Feature: Customer

  Scenario: Add New Customer
	Given user launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login
    Then User can view Dashboard
    When User click on customers Menu
    And click on customers Menu Item
    And click on Add new button
    Then User can view Add a new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added succesfully."
    And close browser
    