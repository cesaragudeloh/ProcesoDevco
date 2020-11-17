#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: find cruises in the system, using the different search options


  @FindTheCheapestCruise
  Scenario: Find the cheapest cruise
    Given go to the Travelocity homepage
    When I looking for a cruise
      | goingTo   | traveles | departsAsEarlyAs | departsAslateAs |
      | Caribbean | 2        | 1-June-2021      | 30-June-2021    |
    And I select a cruise with all its properties
    Then the system displays the review of the cruise to be booked


  @manual
  Scenario: Reserve the cheapest cruise
    Given I log in to the system
    When I looking for and reserve the cheapest cruise for the month of July
    And enter the credit card details
    Then the system makes the reservation and shows me the details on the screen


  @manual
  Scenario: Cancell reserve the cheapest cruise
    Given I log in to the system
    When I cancell the reservations of the cruises that I have
    Then the system makes the reservation and shows me the details on the screen

