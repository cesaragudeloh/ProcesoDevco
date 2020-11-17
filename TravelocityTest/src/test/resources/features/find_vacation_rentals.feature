#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find vacation rentals in the system, using the different search options


  @manual
  Scenario: Reserve a vacation rentals
    Given Given I log in to the system
    When looking for a vacation rentals
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen