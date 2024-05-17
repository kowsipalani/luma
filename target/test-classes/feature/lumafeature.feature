
Feature: User login into the magneto 

Scenario: User enter into the magneto website
    Given User launch the magneto url
    When User click the SignIn tab
    And User enter the mail id
    And User enter the password
    And User click the SignIn button to enter the Homepage
    Then User successfully signedIn into the web application
    
Scenario Outline:
		Given User click the whatsnew tab
		When User click the Jackets
		And User click the Juno Jacket in that page
		And User pick the size of the jacket
		And User Pick the colour of the jacket
		And User pick the quantity of the jacket
		And User click the Add to Cart button
		Then User successfully ada the product to the cart

 
